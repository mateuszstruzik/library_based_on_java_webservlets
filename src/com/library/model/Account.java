package com.library.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 * Created by MATI on 08.01.2018.
 */
public class Account{

    //String name;

    @XmlElement(name="username")
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernameget(){
        return username;
    }

    @XmlElement(name="password")
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordget() {
        return password;
    }

    @XmlElement(name="name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getNameget() {
        return name;
    }

    @XmlElement(name="surname")
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurnameget() {
        return surname;
    }

    @XmlElement(name="old")
    private String old;

    public void setOld(String old) {
        this.old = old;
    }

    public String getOldget() {
        return old;
    }

    @XmlElement(name="adress")
    private String adress;

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdressget() {
        return adress;
    }

    @XmlElement(name="lend_books")
    private ArrayList<LendBooks> lendbooklist=new ArrayList<LendBooks>();

    public void setLendbooklist(ArrayList<LendBooks> lendbooklist) {
        this.lendbooklist = lendbooklist;
    }

    public ArrayList<LendBooks> getLendbooklistget() {
        return lendbooklist;
    }
}

class LendBooks{

    @XmlElement(name="book")
    private ArrayList<String>book;

    public void setBook(ArrayList<String> book) {
        this.book = book;
    }

    public ArrayList<String> getBookget() {
        return book;
    }
}

