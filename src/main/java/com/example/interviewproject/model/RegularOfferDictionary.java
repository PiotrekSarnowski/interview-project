package com.example.interviewproject.model;

import java.util.TreeMap;

public class RegularOfferDictionary {
    public static TreeMap<String, Integer> regularOfferMap = new TreeMap<String, Integer>();

    static{
        regularOfferMap.put("001", 100);
        regularOfferMap.put("002", 80);
        regularOfferMap.put("003", 50);
        regularOfferMap.put("004", 30);
    }
}
