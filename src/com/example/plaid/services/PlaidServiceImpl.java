package com.example.plaid.services;

import java.util.Random;

public class PlaidServiceImpl implements PlaidService
{

    @Override
    public String getPlaidImagePath()
    {
        int numberOfPlaids = 10;
        int random = new Random().nextInt(numberOfPlaids) + 1;
        return String.format("/images/plaid-%s.jpeg", random);
    }

}
