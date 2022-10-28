package ru.mirea.task13.address;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String apartment;

    public Address(String addressString) {
        String[] strings = addressString.split(",");
        this.country = strings[0];
        this.region = strings[1];
        this.city = strings[2];
        this.street = strings[3];
        this.house = strings[4];
        this.corpus = strings[5];
        this.apartment = strings[6];
    }

    public Address(String addressString, String separator) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, separator);
        this.country = tokenizer.nextToken();
        this.region = tokenizer.nextToken();
        this.city = tokenizer.nextToken();
        this.street = tokenizer.nextToken();
        this.house = tokenizer.nextToken();
        this.corpus = tokenizer.nextToken();
        this.apartment = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Country: " + country + ", Region: "
                + region + " City: " + city+ " Street: "
                + street + " House: " + house + ", Corpus:"
                + corpus + ", Apartment: " + apartment;
    }
}
