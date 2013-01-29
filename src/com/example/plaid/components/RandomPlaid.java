package com.example.plaid.components;

import com.example.plaid.services.PlaidService;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.SupportsInformalParameters;
import org.apache.tapestry5.ioc.annotations.Inject;

@SupportsInformalParameters
public class RandomPlaid
{

    @Inject
    private ComponentResources resources;

    @Inject
    private PlaidService plaidService;

    @Parameter(required = true, defaultPrefix = "literal")
    private String alt;

    boolean beginRender(MarkupWriter writer)
    {
        writer.element("img", "src", plaidService.getPlaidImagePath(), "alt", alt, "title", alt);

        resources.renderInformalParameters(writer);

        writer.end();

        return false;
    }

}
