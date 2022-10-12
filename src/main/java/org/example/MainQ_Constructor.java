package org.example;

public class MainQ_Constructor {
    String firstName;
    String middleName;
    String lastName;
    int age;
    public MainQ_Constructor(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        MainQ_Constructor mainQ_constructor = new MainQ_Constructor("Ridwan", "ABI", "SHO", 18);
        System.out.println(mainQ_constructor.age);
        System.out.println(mainQ_constructor.firstName);
        System.out.println(mainQ_constructor.lastName);
        System.out.println(mainQ_constructor.middleName);
    }
}
