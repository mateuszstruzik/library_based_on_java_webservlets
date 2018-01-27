package com.library.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by MATI on 08.01.2018.
 */
@XmlRootElement(name="catalog")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookList {

    @XmlElement(name="book")
    public ArrayList<Book> catalog=new ArrayList<Book>();

	public ArrayList<Book> getCatalogGet() {
		return catalog;
	}

	public void setCatalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}
    
}
