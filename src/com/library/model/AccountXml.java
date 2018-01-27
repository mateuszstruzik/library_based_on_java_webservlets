package com.library.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;

public class AccountXml{

	public File file = new File("F:\\javaprojekt\\library\\src\\com\\library\\model\\accountsXML.xml");

    public ArrayList<Account> ReadAccountFromxml() throws JAXBException{

    	ArrayList<Account> getUsername=new ArrayList<Account>();
        JAXBContext jaxbcontext=JAXBContext.newInstance(AccountList.class);

        Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
        AccountList accountlist=(AccountList) unmarshaller.unmarshal(file);

       // Marshaller marshaller = jaxbcontext.createMarshaller();
      //  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        String n;
        
        for(Account a :accountlist.accountlists) {

          // n=a.getUsernameget();
           getUsername.add(a);


        }
        return getUsername;
    }
    
    public Account  getUserbyId(String username)throws JAXBException {
    	Account getUser=new Account();
        JAXBContext jaxbcontext=JAXBContext.newInstance(AccountList.class);

        Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
        AccountList accountlist=(AccountList) unmarshaller.unmarshal(file);
        
        for(Account a :accountlist.accountlists) {

            if(a.getUsernameget().equals(username))
             getUser=a;
        	}
          return getUser;
      }
    	
    	
    
    	
    

	public AccountXml() {
		super();
		// TODO Auto-generated constructor stub
	}
}

//@XmlRootElement(name="accounts")
//@XmlAccessorType(XmlAccessType.FIELD)
//class AccountList{

    //@XmlElement(name="account")
    //public ArrayList<Accountt> accountlists=new ArrayList<Accountt>();
//}

//class Accountt{
//
//    //String name;
//
//    @XmlElement(name="username")
//    private String username;
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUsername(){
//        return username;
//    }
//
//    @XmlElement(name="password")
//    private String password;
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    @XmlElement(name="name")
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @XmlElement(name="surname")
//    private String surname;
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    @XmlElement(name="old")
//    private String old;
//
//    public void setOld(String old) {
//        this.old = old;
//    }
//
//    public String getOld() {
//        return old;
//    }
//
//    @XmlElement(name="adress")
//    private String adress;
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    @XmlElement(name="lend_books")
//    private ArrayList<LendBooks>lendbooklist=new ArrayList<LendBooks>();
//
//    public void setLendbooklist(ArrayList<LendBooks> lendbooklist) {
//        this.lendbooklist = lendbooklist;
//    }
//
//    public ArrayList<LendBooks> getLendbooklist() {
//        return lendbooklist;
//    }
//}
//
//class LendBooks{
//
//    @XmlElement(name="book")
//    private ArrayList<String>book;
//
//    public void setBook(ArrayList<String> book) {
//        this.book = book;
//    }
//
//    public ArrayList<String> getBook() {
//        return book;
//    }
//}
//
