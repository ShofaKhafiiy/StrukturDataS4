package org.demo1.versi1;

public class Passenger <T>{
    private String name;
    private T identityNumber;

    public Passenger(String name, T identityNumber){
        this.name = name;
        this.identityNumber = identityNumber;
    }

    public String getName(){
        return name;
    }
    public T getIdentityNumber(){
        return identityNumber;
    }
   /* public String getIdentityType(){
        return "Integer";
    }*/
    public String getIdentityType(){
        return identityNumber.getClass().getSimpleName();
    }
}
