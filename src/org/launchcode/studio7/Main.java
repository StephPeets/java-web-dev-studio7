package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

    CD cd = new CD("Songs");
    DVD dvd = new DVD("Movie");

    System.out.println(cd.toString());
    cd.spin();

    System.out.println(dvd.toString());
    dvd.spin();

    }
}
