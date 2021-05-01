package packt.addressbook; 

import java.util.*;

import packt.addressbook.model.*;
import packt.addressbook.util.*;
import packt.sortutil.SortUtil;
import packt.sortutil.impl.BubbleSortUtil;

public class Main {  

	public static void main(String[] args) { 
		ContactUtil contactUtil = new ContactUtil(); 
		SortUtil sortUtil = new SortUtil(); 
		List<Contact> contacts = contactUtil.getContacts(); 
		sortUtil.sortList(contacts); 
		System.out.println(contacts); 
		BubbleSortUtil s = new BubbleSortUtil();
	}
} 
