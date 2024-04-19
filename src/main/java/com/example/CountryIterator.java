/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;


import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

    private final CountryCollection countryCollection;
    private int index;

    public CountryIterator(CountryCollection countryCollection) {
        this.countryCollection = countryCollection;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        var countryList = countryCollection.getCountries();
        return index < countryList.length;
    }

    @Override
    public Country next() {
        var countryList = countryCollection.getCountries();
      //  System.out.println("this.index " +this.index);
        if (hasNext()) {
            return countryList[index++];
        } else {
            return null;
        }
    }
}