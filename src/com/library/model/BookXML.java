package com.library.model;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by MATI on 08.01.2018.
 */
public class BookXML {

	public File file = new File("F:\\javaprojekt\\library\\src\\com\\library\\model\\booksXML.xml");
    public ArrayList<Book> ReadBookfromXML() throws JAXBException {
        
    	ArrayList<Book> getbooks=new ArrayList<Book>();

        JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        BookList bookList = (BookList) unmarshaller.unmarshal(file);

        String n;
        for(Book b :bookList.catalog) {

           getbooks.add(b);


        }
        return getbooks;
    }
    
    public void UpdateBookStatus(String id) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        BookList bookList = (BookList) unmarshaller.unmarshal(file);

        int i=0;
        for(Book b:bookList.catalog)
        {
            String com = b.getIdget();
            if(com.equals(id)){
                bookList.catalog.get(i).setStatus("busy");
            }
            i++;
        }

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(bookList,file);
    }
}
