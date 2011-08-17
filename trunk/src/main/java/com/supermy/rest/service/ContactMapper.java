package com.supermy.rest.service;

import java.util.List;

import com.supermy.rest.domain.Contact;

public interface ContactMapper {

	List<Contact> findByName(String username);
	Contact getContact(long id);
	Integer addContact(Contact obj);
	Integer updateContact(Contact obj);
	Integer delContact(long id);
	Integer delContacts(long[] id);

}
