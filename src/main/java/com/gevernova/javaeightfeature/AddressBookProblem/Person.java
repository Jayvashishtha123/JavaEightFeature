package com.gevernova.javaeightfeature.AddressBookProblem;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;

    public Person(String firstName, String lastName, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFirstName() { return firstName; }
    public String getLatName() { return lastName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    /* UC07 Duplicate check by name */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return firstName.equalsIgnoreCase(p.firstName) &&
                lastName.equalsIgnoreCase(p.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    /* UC11 printing */
    @Override
    public String toString() {
        return firstName + " " + lastName + " : " + city + ", " + state + " - " + zip;
    }
}
