package com.fps.phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook("Telefoonboek", 10);
        pb.AddNumber("hoi1", "+31 01 11 11 11");
        pb.AddNumber("hoi2", "061 02 11 11 11");
        pb.AddNumber("hoi3", "06 03 11 11 11");
        pb.AddNumber("hoi4", "06 04 11 11 11");
        pb.AddNumber("hoi5", "06 05 11 11 11");
        pb.AddNumber("hoi6", "06 06 11 11 11");
        pb.AddNumber("hoi7", "06 07 11 11 11");
        pb.AddNumber("hoi8", "06 06 11 11 11");
        pb.AddNumber("hoi9", "06 09 11 11 11");
        pb.AddNumber("hoi10", "06 10 11 11 11");
        pb.AddNumber("hoi11", "06 11 11 11 11");
        pb.AddNumber("hoi12", "06 12 11 11 11");

        //Dit is puur om onderscheid te houden tussen print en add
        System.out.print("\n");
        pb.Print();

    }
}
