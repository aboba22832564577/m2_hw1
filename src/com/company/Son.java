package com.company;

public final class Son extends Father {
    private int Height;
    private Home home;
    private EnumFamily enumFamily;

    public Son(String name, int age, Home home, String wife, EnumFamily enumfamily, int height) {
        super(name, age, home, wife, enumfamily);
        Height = height;
        this.home = home;
        this.enumFamily = enumfamily;
    }

    public int getHeight() {
        return Height;
    }


    @Override
    public String getInfo() {
        return "\nHomeAddress: " + home.getAddress() +
                "\nHomeName: " + home.getName() +
                "\nHobbies: " + enumFamily +
                "\nHeight: " + getHeight();
    }
}

