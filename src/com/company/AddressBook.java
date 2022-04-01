package com.company;

public class AddressBook {
    //properties of AddressBook
    private String firstName;
    private String lastName;
    private String phoneNumber; // might need an int
    private String userEmail;

    public void AddressBook(String firstName, String lastName, String phoneNumber, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userEmail = userEmail;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    // print all the contents of the AddressBook
    public void getAllInfo() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getPhoneNumber());
        System.out.println(getUserEmail());
    }
}
