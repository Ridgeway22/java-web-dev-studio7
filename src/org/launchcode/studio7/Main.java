package org.launchcode.studio7;


public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("Goodbye ",700, 350, "Cd-r");
        DVD dvd1 = new DVD("GoodBye", 500, 3000, "Dr-r");

        // TODO: Call each CD and DVD method to verify that they work as expected.
cd1.spinDisc();
dvd1.spinDisc();
        cd1.readDisc();
        dvd1.readDisc();
        System.out.println(cd1.writingDate(300));
        System.out.println(dvd1.writingDate(10000));


    }
}
