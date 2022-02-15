package com.company;

public class Father extends GrandFather{
    private Home home;
    private String Wife;
    private EnumFamily enumfamily;


    public Father(String name, int age, Home home, String wife, EnumFamily enumfamily) {
        super(name, age);
        this.home = home;
        Wife = wife;
        this.enumfamily = enumfamily;
    }



    public String getInfo(){
        return "\nWiveName: " + Wife +
                "\nHomeAddress: " + home.getAddress() +
                "\nHomeName: " + home.getName() +
                "\nHobbies: " + enumfamily;

    }

}
