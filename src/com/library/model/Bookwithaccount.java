package com.library.model;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by MATI on 11.01.2018.
 */
public class Bookwithaccount {

    @XmlElement(name="book")
    public String book;

    @XmlAttribute(name="id")
    public String id;
}
