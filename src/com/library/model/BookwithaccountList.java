package com.library.model;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by MATI on 11.01.2018.
 */    @XmlRootElement(name="file")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookwithaccountList {


        @XmlElement(name="account")
        public ArrayList<Bookwithaccount> bookwithaccountslists=new ArrayList<Bookwithaccount>();



}
