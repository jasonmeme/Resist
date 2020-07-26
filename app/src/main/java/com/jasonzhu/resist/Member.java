package com.jasonzhu.resist;

public class Member {
    private String Name;
    private String Email;
    private String PhoneNumber;
    private String Password;

    public Member(){
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email){
        Email = email;
    }

    public String getNumber() {
        return PhoneNumber;
    }
    public void setNumber(String phonenumber){
        PhoneNumber = phonenumber;
    }

    public String getPassword() {
        return Password;
    }
    public void setPassword(String password){
        Password = password;
    }

}
