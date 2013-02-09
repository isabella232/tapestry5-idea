package com.example.tartan.pages;

import java.util.Random;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;

public class JavaLibraryMappedPage
{

    @Property
    private boolean thisOrThat;

    @SetupRender
    void setupThisOrThat()
    {
        thisOrThat = new Random().nextBoolean();
    }

    public String getThisText()
    {
        return "This or that is: This";
    }

    public String getThatText()
    {
        return "This or that is: That";
    }

}
