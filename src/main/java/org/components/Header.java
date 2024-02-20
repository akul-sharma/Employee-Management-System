package org.components;

import org.apache.tapestry5.annotations.Parameter;


public class Header {

    @Parameter
    private String companyName = "Kane LPI Solutions Ltd.";

    @Parameter
    private String companyAddress = "Central Business Centre\n" +
            "Mdina Road\n" +
            "Zebbug ZBG 9015\n" +
            "Malta";

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyName(){
        return companyName;
    }
}
