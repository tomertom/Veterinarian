package com.company;

import java.util.ArrayList;

public class Hospital extends Client {

    public Hospital(String firstName, String lastName, String phoneNumber, boolean ads ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.ads = ads;
        this.clientNumber=counter++;
        sendADs();
    }

       public void removeClient( int clientNumber ){
              this.firstName = null;
              this.lastName = null;
              this.phoneNumber = null;
              this.ads = false;
              this.clientNumber=clientNumber;
       }
      static ArrayList<String> petsList=new ArrayList<>();

      public void addPetsToClient(int clientNumber, String petsName,String typeOfPet,boolean er){

              petsList.add(petsName);
              this.clientNumber=clientNumber;
              Animal animal= new Animal(typeOfPet,petsName);
              animal.printAnimalDetails();
              this.typeOfPet=typeOfPet;
              if(typeOfPet=="dog"){
                  sendSmsToDogOwner();
              }

              if(er){
                  ER er1=new ER();
                 if (er1.addAnimalToER()){
                     System.out.println("send -" +petsName+ "- is in ER to phone number: "+phoneNumber);
                 }else {
                     System.out.println("* "+firstName+" come to take -"+ petsName +"- he cant enter ER ,"+ "phone number:"+ phoneNumber);
                 }
              }

      }

       public void removePetFromClient(int clientNumber, String petsName){
             this.clientNumber=clientNumber;
              for (int i = 0; i <petsList.size() ; i++) {
                     if(petsList.get(i)==petsName){
                      petsList.remove(i);
                     }
              }
       }
    public void sendADs(){
          String contact="send ADs to: " +firstName+" " + lastName+" " + phoneNumber;

        if (ads){
            System.out.println(contact);
        }
    }
    public void sendSmsToDogOwner(){
        System.out.println(firstName+" come to vaccine your dog ,"+"phone number is: "+ phoneNumber);
    }
       public void printPetList(){
              System.out.println(petsList);

       }

}
