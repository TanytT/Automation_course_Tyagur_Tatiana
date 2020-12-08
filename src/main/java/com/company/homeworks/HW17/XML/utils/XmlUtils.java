package com.company.homeworks.HW17.XML.utils;

import com.company.homeworks.HW17.XML.modelsGen.MessageType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlUtils {


    public static void marshal(String filePath, MessageType messageType, Class unicCl) {

        try{
            JAXBContext jContext = JAXBContext.newInstance(unicCl);
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallObj.marshal(messageType, new FileOutputStream(filePath));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static MessageType unmarshal(String filePath,Class unicCl){
        MessageType messageType = null;

        try{
            File file = new File(filePath);
            JAXBContext jContext = JAXBContext.newInstance(unicCl);
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            messageType=(MessageType) unmarshallerObj.unmarshal(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return messageType;
    }
}
