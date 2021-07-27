package com.example.interviewproject.model;

import java.util.TreeMap;

public class DiscountOfferDictionary {
    public static TreeMap<String, RegularOffer> discountOfferMap = new TreeMap<String, RegularOffer>();

    static{
        discountOfferMap.put("001", new RegularOffer("001", 3, 200));
        discountOfferMap.put("002", new RegularOffer("002", 2, 120));
    }
}