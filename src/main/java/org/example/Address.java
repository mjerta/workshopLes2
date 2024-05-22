package org.example;

public class Address {
  public int number;
  public String street;
  public String zipCode;
  public String city;

    public Address(String street,int number, String zipCode, String city) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

  public void printAddress() {
    printFirstAddressLine();
    printSecondAddressLine();
    System.out.println();
  }

  public void printSecondAddressLine() {
    System.out.println(zipCode + " " + city);
  }

  public void printFirstAddressLine() {
    System.out.println(street + " " + number);
  }

  public void printAddress(String name) {
    System.out.println(name);
    printAddress();
  }
}