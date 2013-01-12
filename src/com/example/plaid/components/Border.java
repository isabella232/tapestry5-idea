package com.example.plaid.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class Border
{

    @Property
    @Parameter(defaultPrefix = "literal")
    private String pageTitle = "Default";

}
