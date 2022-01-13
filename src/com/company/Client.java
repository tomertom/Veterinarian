package com.company;

import java.util.ArrayList;

public class Client {
     static int counter=1;
    int clientNumber;
   String firstName;
   String lastName;
    String phoneNumber;
     boolean ads;
     String typeOfPet;

    public void removeClient( int clientNumber,String clientName ){
        this.firstName = null;
        this.lastName = null;
        this.phoneNumber = null;
        this.ads = false;
        this.clientNumber=clientNumber;
    }

    public void printClient(){
        System.out.println( "client number is: " +clientNumber +
                ", first name is: "+ firstName +
                ", last name is: "+ lastName +
                ", ads: " + ads);
    }
}
