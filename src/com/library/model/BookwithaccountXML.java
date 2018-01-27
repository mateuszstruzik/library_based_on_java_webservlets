package com.library.model;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by MATI on 11.01.2018.
 */
public class BookwithaccountXML {

    File file = new File("bookwithaccountXML.xml");
    public ArrayList<Bookwithaccount> ReadBookAccountFromxml() throws JAXBException {

        ArrayList<Bookwithaccount> getbookstoaccount=new ArrayList<Bookwithaccount>();

        JAXBContext jaxbcontext=JAXBContext.newInstance(BookwithaccountList.class);

        Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
        BookwithaccountList bookwithaccountList=(BookwithaccountList) unmarshaller.unmarshal(file);

        // Marshaller marshaller = jaxbcontext.createMarshaller();
        //  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        String n;

        for(Bookwithaccount ba :bookwithaccountList.bookwithaccountslists) {


getbookstoaccount.add(ba);

        }

        return bookwithaccountList.bookwithaccountslists;
    }
}
