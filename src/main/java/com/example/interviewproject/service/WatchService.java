package com.example.interviewproject.service;

import com.example.interviewproject.model.DiscountOfferDictionary;
import com.example.interviewproject.model.RegularOffer;
import com.example.interviewproject.model.RegularOfferDictionary;
import com.example.interviewproject.repository.WatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class WatchService {

    private WatchRepository watchRepository;

    public Integer calculateTotalPrice(List<String> itemsList) {

        Integer total = 0;
        Set<String> items = new HashSet<String>(itemsList);

        for (Iterator<String> i = items.iterator(); i.hasNext();) {
            String item = i.next();
            Integer quantity = Collections.frequency(itemsList, item);
            if(DiscountOfferDictionary.discountOfferMap.containsKey(item)){

                RegularOffer regularOffer = DiscountOfferDictionary.discountOfferMap.get(item);
                // If the quantity of the item in the cart is more than offer quantity
                // then process the items and their price accordingly
                if(regularOffer.quantity < quantity)
                {
                    total += (quantity % regularOffer.quantity) * DiscountOfferDictionary.discountOfferMap.get(item).price + (quantity / regularOffer.quantity) * regularOffer.price;
                }
                else if(regularOffer.quantity == quantity)
                {
                    total += regularOffer.price;
                }
            }
            else // If there is no offer on the item then just fetch the price from the regular price map and calculate the total
            {
                total += quantity * RegularOfferDictionary.regularOfferMap.get(item);
            }
        }

        return total;
    }

}
