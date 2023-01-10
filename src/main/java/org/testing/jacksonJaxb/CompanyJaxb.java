package org.testing.jacksonJaxb;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;



public class CompanyJaxb {

    public void SerializedToXmlFile() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("simple_bean.xml"), new Company(1,"Enigma"));
    }
    public void deserializeXmlFile() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        File file = new File("simple_bean.xml");
        xmlMapper.readValue(file, Company.class);
    }

}
