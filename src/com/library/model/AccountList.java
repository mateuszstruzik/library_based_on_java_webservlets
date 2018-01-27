package com.library.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
/**
 * Created by MATI on 08.01.2018.
 */

@XmlRootElement(name="accounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountList {
    @XmlElement(name="account")
    public ArrayList<Account> accountlists=new ArrayList<Account>();
}
