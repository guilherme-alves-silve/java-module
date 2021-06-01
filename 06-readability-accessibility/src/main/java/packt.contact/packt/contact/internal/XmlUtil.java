package packt.contact.internal;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XmlUtil {

    public Document loadXmlFile(String fileName) throws 
        ParserConfigurationException, SAXException, IOException {
        final var inputFile = new File(fileName);
        final var dbFactory = DocumentBuilderFactory.newInstance();
        final var dbBuilder = dbFactory.newDocumentBuilder();
        final var document = dbBuilder.parse(inputFile);
        document.getDocumentElement().normalize();
        return document;
    }

    public String getElement(Node node, String tagName) {
        if (node.getNodeType() != Node.ELEMENT_NODE) {
            return "";            
        }

        final var element = (Element) node;
        return element.getElementsByTagName(tagName)
                .item(0)
                .getTextContent();
    }
}