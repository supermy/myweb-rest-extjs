package com.supermy.rest.web;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.supermy.rest.client.ContactRestClient;
import com.supermy.rest.domain.Contact;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/servlet-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ContactRestClientTest {
 
	private Logger log = LoggerFactory.getLogger(ContactRestClientTest.class);

	@Autowired
	private ContactRestClient contactRestClient;

	@Test
	public void crudRestContact() throws Exception {
		log.info("crud contact ...");
		List<Contact> contacts = contactRestClient.getContacts(0, 8);
		log.debug("get conact count:{}", contacts.size());
		Contact newcontact = contactRestClient.addContact();
		newcontact.setName("superadmin");
		newcontact.setEmail("test@core.com");
		newcontact.setBirthDate(new Date());
		newcontact.setPhone("110119");
		Contact  createcontact = contactRestClient.createContact(newcontact);
		log.debug("new  conact {}", createcontact);
		Contact contact = contactRestClient.getContact(createcontact.getPkId());
		log.debug("get conact {}", contact);
		Contact editcontact = contactRestClient.editContact(createcontact.getPkId());
		Long id = contactRestClient.updateContact(editcontact.getPkId(),
				editcontact);
		contactRestClient.delContacts(id);
		
		Contact  c1 = contactRestClient.createContact(newcontact);
		Contact  c2 = contactRestClient.createContact(newcontact);
		Contact  c3 = contactRestClient.createContact(newcontact);
		Contact  c4 = contactRestClient.createContact(newcontact);
		long[] ids={c1.getPkId(),c2.getPkId(),c3.getPkId(),c4.getPkId()};
		contactRestClient.batchDeleteContacts(ids);//FIXME

	}
}