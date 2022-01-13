package com.company;



public class Animal  {
    static int counter=1;
  int chipNumber;
 String typeOfAnimal;
 String animalName;

    public Animal( String typeOfAnimal, String animalName) {
        this.chipNumber = counter++;
        this.typeOfAnimal = typeOfAnimal;
        this.animalName = animalName;
    }
    public void printAnimalDetails(){
        System.out.println("animal chip number is: "+chipNumber+", type of animal is: "+typeOfAnimal+", animal name is: "+animalName);
    }

}
