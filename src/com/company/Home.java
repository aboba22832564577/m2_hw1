package com.company;

public class Home {
    private String Name;
    private String Address;

    public Home(String name, String address) {
        this.Name = name;
        this.Address = address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }


    public String getAddress() {
        return Address;
    }

}
