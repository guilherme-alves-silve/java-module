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
    final var sortUtil = new SortUtil(); 
    final List<Contact> contacts; 
    try { 
      contacts = contactLoader.loadContacts("input.xml"); 
    } catch (ContactLoadException e) { 
      logger.severe(e.getMessage()); 
      return;
    }

    sortUtil.sortList(contacts); 
    System.out.println(contacts);
    logger.info("Address book viewer application: Completed"); 
  }
}
