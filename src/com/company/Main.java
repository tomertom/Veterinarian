package com.company;



public class Main {

    public static void main(String[] args) {

        Hospital tomer=new Hospital("Tomer","Shlezinger","0546480003",true);
        tomer.addPetsToClient(1,"jana","dog",true);
        tomer.addPetsToClient(1,"odi","cat",true);
        tomer.addPetsToClient(1,"shimi","dog",true);
        Hospital orel=new Hospital("orel","aivas","0505554929",false);
        orel.addPetsToClient(2,"chief","dog",true);
        Hospital tom=new Hospital("tom","aivas","0546488888",true);
        tom.addPetsToClient(3,"jofri","wolf",true);
        tom.addPetsToClient(3,"jason","dog",true);
        tom.addPetsToClient(3,"pini","dog",true);
        tom.printPetList();
    }



}
