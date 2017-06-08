package com.fps.phonebook;

public class Phonebook {

    private int numberCount;
    private String bookName;
    private Contact[] contact;

    public Phonebook(String bookName, int arraySize) {
        this.bookName = bookName;
        contact = new Contact[arraySize];
        numberCount = 0;
    }

    public void AddNumber(String name, String number) {
        if(numberCount == contact.length) {
            System.out.println("Het telefoonboek is vol.");
        } else if(NumberExists(number)) {
            System.out.println("Dit nummer staat al in het telefoonboek");
        } else if(ValidPhoneNumber(number)) {
            System.out.println("Dit is niet een geldig telefoonnummer");
        } else {
            contact[numberCount] = new Contact(name, number);
            System.out.println((numberCount + 1) + ": De contact '"+name+"', '" + number + "' is  succesvol toegevoegd aan het telefoonboek");
            numberCount++;
        }
    }

    public boolean NumberExists(String number) {
        for(int i = 0; i < numberCount; i++) {
            if (contact[i].getNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public void Print() {
        System.out.println(bookName + ":");
        for(int i = 0; i < numberCount; i++) {
            System.out.println((i + 1) + ". " + contact[i].getName() + " - " + contact[i].getNumber());
        }
    }

    public boolean ValidPhoneNumber(String number) {
       if(!number.substring(0, 1).equals("0")) {
           return true;
       } else {
           number = number.replaceAll(" ", "");
           if (number.length() != 10) {
               return true;
           } else {
               return false;
           }
       }
    }
}
