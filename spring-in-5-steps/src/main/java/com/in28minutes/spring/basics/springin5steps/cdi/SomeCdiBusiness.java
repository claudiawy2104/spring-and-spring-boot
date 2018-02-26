package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCdiDao;

	public SomeCdiDAO getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDAO someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
