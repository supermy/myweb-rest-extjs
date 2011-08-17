package com.supermy.rest.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.supermy.core.domain.BaseDomain;

import com.supermy.rest.client.ContactExtjsRestClient;
import com.supermy.rest.domain.Contact;
import com.supermy.rest.util.extjs.ExtData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/servlet-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ContactExtjsRestClientTest {
 
	private Logger log = LoggerFactory.getLogger(ContactExtjsRestClientTest.class);

	@Autowired
	private ContactExtjsRestClient c;

	@Test
	public void crudRestContact() throws Exception {
		log.info("crud batch contacts ...");
		c.getContacts(0, 6);
		//List<Long> ids=new ArrayList<Long>(contacts.size());

		List<Contact> newcontacts=new ArrayList<Contact>();
		Contact newcontact = new Contact();
		newcontact.setName("superadmin");
		newcontact.setEmail("test@core.com");
		newcontact.setBirthDate(new Date());
		newcontact.setPhone("110119");
		
		newcontacts.add(newcontact);
		newcontacts.add(newcontact);
		newcontacts.add(newcontact);
		newcontacts.add(newcontact);
		
		Contact [] array = (Contact []) newcontacts.toArray(new Contact[newcontacts.size()]);  

		ExtData<Contact> objs = c.createContacts(array);
		List data = objs.getData();//FIXME json to Object
		log.debug("============={}",data);			
		List<Long> ids=new ArrayList<Long>();
		for (Object obj : data) {
			String id = ((HashMap)obj).get("pkid").toString();
			ids.add(new Long(id));
			log.debug("============={}",id);			
		}		
		c.updateContacts(array);		
		Long [] ids1 = (Long []) ids.toArray(new Long[ids.size()]);  
		c.deleteContacts(ids1);
	}
}