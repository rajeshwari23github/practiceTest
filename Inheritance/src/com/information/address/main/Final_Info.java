package com.information.address.main;

import java.util.Scanner;

public class Final_Info {

	public static void main(String[] args) {
		Address  add = new  Address ();
		//Information  info  =  new  Information();
		Scanner  scanner  = new  Scanner(System.in);
		System.out.println("Enter Employee Full name = ");
          String name = scanner.nextLine();
          System.out.println("Enter Employee Id = ");
         int id = scanner.nextInt();
          System.out.println("Enter Employee mob number = ");
          String number = scanner.next();
          System.out.println("Enter Employee Add  = ");
          String add1 = scanner.nextLine();
          System.out.println("Enter Employee Street  = ");
          String street= scanner.nextLine();
          System.out.println("Enter Employee City  = ");
          String city = scanner.next();
          System.out.println("Enter Employee State  = ");
          String state = scanner.next();
          System.out.println("Enter Employee Country = ");
          String country = scanner.next();
          scanner.close(); 
          add.setName(name);
            add.setId(id);
            add.setMobnumber(number);
            add.setAddress(add1);
            add.setStreetNo(street);
            add.setCity(city);
            add.setState(state);
            add.setCountry(country);
            
            System.out.println("Name = "+ add.getName());
            System.out.println("Id = "+ add.getId());
            System.out.println("Number = "+ add.getMobnumber());
            System.out.println("Address = "+ add.getAddress()+","+ add.getStreetNo()+","+ add.getCity()+","+ add.getState()+","+ add.getCountry());
            
	}

}
