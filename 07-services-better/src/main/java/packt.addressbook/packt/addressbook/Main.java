package packt.addressbook; 

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Logger;

import packt.sortutil.SortUtil;
import packt.contact.model.Contact;
import packt.contact.util.ContactLoader;
import packt.contact.util.ContactLoadException;

public class Main {  

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) { 

    logger.info("Address book viewer application: Started"); 
    final var contactLoader = new ContactLoader(); 
    final List<Contact> contacts; 
    try { 
      contacts = contactLoader.loadContacts("input.xml"); 
    } catch (ContactLoadException e) { 
			logger.severe("Was not possible to load the xml: " + e.getMessage());
      return;
    }

    final var sortUtil = SortUtil.getProviderInstance(contacts.size());
    sortUtil.sortList(contacts); 
    System.out.println(contacts);

    logger.info("Address book viewer application: Completed"); 
  }
}
