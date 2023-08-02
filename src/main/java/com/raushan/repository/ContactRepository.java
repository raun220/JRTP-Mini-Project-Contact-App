package com.raushan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raushan.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
