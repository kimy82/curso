package com.atos.curso.services;

public class ClassToTest {

	private MyOtherService	myOtherService;
	private String			myLoadString;

	public void loadMyString() {
		this.myLoadString = this.myOtherService.getMyString();
	}

	public MyOtherService getMyOtherService() {
		return myOtherService;
	}

	public void setMyOtherService(MyOtherService myOtherService) {
		this.myOtherService = myOtherService;
	}

}
