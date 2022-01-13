package com.company;

public class ER {
 static int beds;
public ER(){
}
public boolean addAnimalToER(){
    if(beds==5){
        System.out.println();
        return false;
    }else{
        beds++;
    }
    System.out.println("beds place:"+(5-beds));
    return true;
}
}

