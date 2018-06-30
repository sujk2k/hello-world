package com.sujk2k.hello.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("brown")) {
            brands.add("Jail Pail Ale");
            brands.add("Gout Stout");
        }
        else {
            brands.add("random1");
            brands.add("random2");
        }
        return brands;
    }
}
