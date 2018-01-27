package com.library.servl;

import javax.xml.bind.JAXBException;

import com.library.model.AccountXml;

public class ShowXmlContent {

	public static void main(String[] args) throws JAXBException {
		AccountXml account = new AccountXml();
		account.ReadAccountFromxml();

	}

}
