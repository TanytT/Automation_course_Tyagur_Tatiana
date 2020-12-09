package com.company.homeworks.HW17.XML;

import com.company.homeworks.HW17.XML.modelsGen.MessageType;
import com.company.homeworks.HW17.XML.utils.XmlUtils;


public class XmlApp {
    public static void main(String[] args) {

        String fileRes = "C:\\Users\\Tatiana_Tgr\\IdeaProjects\\Automation_course_Tyagur_Tatiana\\src\\main\\java\\com\\company\\homeworks\\HW17\\XML\\resources\\ResultEx.xml";
        String filePath = "C:\\Users\\Tatiana_Tgr\\IdeaProjects\\Automation_course_Tyagur_Tatiana\\src\\main\\java\\com\\company\\homeworks\\HW17\\XML\\resources\\Example.xml";
        MessageType messageType= XmlUtils.unmarshal(filePath, MessageType.class);

        messageType.setType("Type of message");
        messageType.setCompanyName("New Company Name");
        messageType.getMessageDetails().setTypeDet("New type");
        messageType.getIssues().getIssue().get(2).setValue("New Issue Value");

        XmlUtils.marshal(fileRes, messageType, MessageType.class);

        String fileResSmall = "C:\\Users\\Tatiana_Tgr\\IdeaProjects\\Automation_course_Tyagur_Tatiana\\src\\main\\java\\com\\company\\homeworks\\HW17\\XML\\resources\\ResExSmall.xml";
        String filePathSmall = "C:\\Users\\Tatiana_Tgr\\IdeaProjects\\Automation_course_Tyagur_Tatiana\\src\\main\\java\\com\\company\\homeworks\\HW17\\XML\\resources\\ExSmall.xml";
        MessageType message= XmlUtils.unmarshal(filePathSmall, MessageType.class);
        message.setCompanyName("New Company Name");
        message.setType("New type!");

        XmlUtils.marshal(fileResSmall, message, MessageType.class);

    }
}
