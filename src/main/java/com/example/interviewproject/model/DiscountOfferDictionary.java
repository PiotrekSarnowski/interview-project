package com.example.interviewproject.model;

import java.util.TreeMap;

public class DiscountOfferDictionary {
    public static TreeMap<Long, RegularOffer> discountOfferMap = new TreeMap<Long, RegularOffer>();

    static{
        discountOfferMap.put(001L, new RegularOffer(001L, 3, 200));
        discountOfferMap.put(002L, new RegularOffer(002L, 2, 120));
    }
}