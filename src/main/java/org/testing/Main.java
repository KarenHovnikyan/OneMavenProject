package org.testing;

import org.testing.csv.Person;
import org.testing.jacksonJaxb.Company;
import org.testing.jacksonJaxb.CompanyJaxb;
import org.testing.jaxb.BookJAXB;

import javax.xml.bind.JAXBException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        //marshal anMarshal xml files in JAXB

        /*BookJAXB bookJAXB = new BookJAXB();
        bookJAXB.marshal();
        System.out.println(bookJAXB.unmarshall().toString());*/

        //XML Serialization and Deserialization with Jackson
        //---------------------------------------------
        /*CompanyJaxb companyJaxb = new CompanyJaxb();
        companyJaxb.SerializedToXmlFile();
        companyJaxb.deserializeXmlFile();*/

        //Read and Write JSON files


        org.testing.gson.BookJSON bookJSON = new org.testing.gson.BookJSON ();
        bookJSON.writeJsonFile();
        bookJSON.readJsonFile();

        /* org.testing.jacksonJson.BookJSON bookJSON = new org.testing.jacksonJson.BookJSON();
        bookJSON.writeJsonFile();
        bookJSON.readJsonFile();*/

      /*  Person person = new Person();
        person.writeCSVFile();
        person.readCSVFile();*/

    }
}