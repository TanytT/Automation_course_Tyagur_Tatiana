//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 10:26:41 PM EET 
//


package com.company.homeworks.HW17.XML.modelsGen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)

public class IssuesType {

    @XmlElement(name = "Issue")
    protected List<IssueType> issue;

    public List<IssueType> getIssue() {
        if (issue == null) {
            issue = new ArrayList<IssueType>();
        }
        return this.issue;
    }

    @Override
    public String toString() {
        return "IssuesType{" +
                "issue=" + issue +
                '}';
    }
}