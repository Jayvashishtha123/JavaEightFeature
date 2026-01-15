package com.gevernova.javaeightfeature.AddressBookProblem;

public class Main {
    static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addPerson(new Person("Jay", "Vardhan", "Agra", "UP", "283124"));
        book.addPerson(new Person("Aman", "Singh", "Delhi", "Delhi", "983124"));
        book.addPerson(new Person("Ravi", "Sharma", "Hyderabad", "Telangana", "500032"));
        book.addPerson(new Person("Suraj", "Shankar", "Ahmedabad", "Gujarat", "837463"));
        System.out.println();

        // UC8.....
        System.out.println("----------Seaching by City Or State----------");
        book.searchByCityOrState("Delhi").forEach(System.out::println);
        System.out.println();

        // UC9....
        System.out.println("----------View the person By their City----------");
        System.out.println(book.viewByCity());
        System.out.println();

        // UC10.....
        System.out.println("----------Count the person By their City----------");
        System.out.println(book.countByCity());
        System.out.println();

        System.out.println("----------Count the person By their State----------");
        System.out.println(book.countByState());
        System.out.println();

        // UC11....
        System.out.println("----------Sorting by their Names----------");
        book.sortByName().forEach(System.out::println);
        System.out.println();

        // UC12.....
        System.out.println("----------Sorting by their Zip-Code----------");
        book.sortByZip().forEach(System.out::println);
        System.out.println();
    }
}
