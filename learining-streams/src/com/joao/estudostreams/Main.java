package com.joao.estudostreams;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person :people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        //Filter

        List<Person> females2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
        System.out.println("--------------------------");
        //Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
        System.out.println("--------------------------");
        //All match

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);
        System.out.println(allMatch);
        System.out.println("--------------------------");
        //ANy Match

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 8);
        System.out.println(anyMatch);
        System.out.println("--------------------------");

        //none match
        boolean noneMatch =people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(noneMatch);
        System.out.println("--------------------------");

        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println("--------------------------");

        //Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println("--------------------------");
        //Group
        Map<Gender, List <Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        //Getting the older person

        Optional<String> oldestFemaleAge =  people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);
    }


    private static List<Person> getPeople() {
        return List.of(
                new Person( "James Bond", 20, Gender.MALE),
                new Person( "Alina Smith", 33, Gender.FEMALE),
                new Person( "Helen White", 57, Gender.FEMALE),
                new Person( "Alex Boz", 14, Gender.MALE),
                new Person( "Jamie Goa", 78, Gender.MALE),
                new Person( "Anna Cook", 45, Gender.FEMALE),
                new Person( "Zelda Brown", 12, Gender.FEMALE)
        );
    }
}
