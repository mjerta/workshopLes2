package org.example;

public class Person{

  public String name;

  public Address livesAt;

  public void printShippingLabel(){
    livesAt.printAddress(name);
  }
}