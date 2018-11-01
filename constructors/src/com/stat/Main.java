package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail@bob.com", "(818 123 - 4567" );
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(818) 123 - 4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());





        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);



        System.out.println(bobsAccount.getBalance());

        Account timsAccount = new Account("Tim", "Tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());



        vipPerson person1 = new vipPerson();
        System.out.println(person1.getName());

        vipPerson person2 = new vipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        vipPerson person3 = new vipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());

    }
}
