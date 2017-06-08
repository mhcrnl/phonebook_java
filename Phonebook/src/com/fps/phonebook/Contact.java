package com.fps.phonebook;

public class Contact {
    private String number;
    private String name;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
