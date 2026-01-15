package com.gevernova.javaeightfeature.AddressBookProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBook {

    private final List<Person> persons = new ArrayList<>();

    /* ---------- UC07 ---------- */
    public boolean addPerson(Person person) {
        boolean exists = persons.stream().anyMatch(p -> p.equals(person));
        if (!exists) {
            persons.add(person);
            return true;
        }
        return false;
    }

    /* ---------- UC08 ---------- */
    public List<Person> searchByCityOrState(String value) {
        return persons.stream()
                .filter(p -> p.getCity().equalsIgnoreCase(value)
                        || p.getState().equalsIgnoreCase(value))
                .collect(Collectors.toList());
    }

    /* ---------- UC09 ---------- */
    public Map<String, List<Person>> viewByCity() {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getCity));
    }

    public Map<String, List<Person>> viewByState() {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getState));
    }

    /* ---------- UC10 ---------- */
    public Map<String, Long> countByCity() {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
    }

    public Map<String, Long> countByState() {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getState, Collectors.counting()));
    }

    /* ---------- UC11 ---------- */
    public List<Person> sortByName() {
        return persons.stream()
                .sorted(
                        Comparator.comparing(Person::getFirstName, String.CASE_INSENSITIVE_ORDER)
                                .thenComparing(Person::getLatName, String.CASE_INSENSITIVE_ORDER)
                )
                .collect(Collectors.toList());
    }

    /* ---------- UC12 ---------- */
    public List<Person> sortByCity() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getCity, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<Person> sortByState() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getState, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<Person> sortByZip() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getZip, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
}
