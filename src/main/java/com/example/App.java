package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");
        
        var countries = new CountryCollection(india, poland, nigeria,canada,argentina);
        var countriesIterator = countries.iterator();

        while (countriesIterator.hasNext()) {
            var item = countriesIterator.next();
            System.out.println(item.getName());
        }

    }

}
