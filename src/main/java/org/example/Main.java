package org.example;

public class Main {
  public static void main(String[] args) {

    Address novi = new Address("Newtonlaan", 247, "3583 BH", "Utrecht");

    Address addressKing = new Address("'s-Gravenhaagse Bos", 10, "2594 BD", "Den Haag");

    Person king = new Person();
    king.name = "W.A.";
    king.livesAt = novi;

    novi.printAddress();
    novi.printAddress("frans");

    king.printShippingLabel();

  }
}