package packt.contact.util;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import packt.contact.internal.XmlUtil;
import packt.contact.model.Address;
import packt.contact.model.Contact;

public class ContactLoader {

    private static final String ERROR_MSG = "Unable to load Contact file";
    private static final Logger logger = Logger.getLogger(ContactLoader.class.getName());

    private final XmlUtil xmlUtil;

    public ContactLoader() {
        this.xmlUtil = new XmlUtil();
    }

    public List<Contact> loadContacts(final String fileName) throws ContactLoadException { 
        
        final var contacts = new ArrayList<Contact>();
        final var document = getDocument(fileName);
        NodeList nList = document.getElementsByTagName("contact");
        for (int index = 0; index < nList.getLength(); index++) {
            Node contactNode = nList.item(index);
            if (contactNode.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            final var eElement = (Element) contactNode;
            final var contact = createContact(contactNode);
            final var addressNode = eElement.getElementsByTagName("address").item(0);
            final var address = createAddress(addressNode);
            contact.setAddress(address);
            contacts.add(contact);
        }
        
        return contacts;
    }

    private Document getDocument(final String fileName) throws ContactLoadException {
        try {
            final var xmlUtil = new XmlUtil();
            return xmlUtil.loadXmlFile(fileName);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            logger.log(Level.SEVERE, ERROR_MSG, ex);
            throw new ContactLoadException(ERROR_MSG);            
        }
    }

    private Contact createContact(Node contactNode) {
        return new Contact(
            xmlUtil.getElement(contactNode, "firstname"),
            xmlUtil.getElement(contactNode, "lastname"),
            xmlUtil.getElement(contactNode, "phone")
        );
    }

    private Address createAddress(Node addressNode) {
        return new Address()
                .setStreet(xmlUtil.getElement(addressNode, "street"))
                .setCity(xmlUtil.getElement(addressNode, "city"))
                .setState(xmlUtil.getElement(addressNode, "state"))
                .setCountry(xmlUtil.getElement(addressNode, "country"));
    }
}
