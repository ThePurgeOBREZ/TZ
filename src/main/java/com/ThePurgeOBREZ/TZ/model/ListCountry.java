package com.ThePurgeOBREZ.TZ.model;

import java.util.Locale;

public class ListCountry {
    ListCountry obj = new ListCountry();

    public void run() {

        String[] locales = Locale.getISOCountries();

        for (String countryCode : locales) {

            Locale obj = new Locale("", countryCode);

            System.out.println("Country Code = " + obj.getCountry()
                    + ", Country Name = " + obj.getDisplayCountry());
        }
    }
}
