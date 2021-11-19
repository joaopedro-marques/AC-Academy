package com.joao.estudobasico;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        // Ternary operator
        int age = 17;
        String message = age >= 18 ? "Hooray... I am an adult" : "I am underage";
        System.out.println(message);

        //switch statement, switching on single values
        String gender  = "FEMALE";
        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("Im am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }

        //Arrays and indexes

//        int zero = 0 ;
//        int one = 1;

        int [] numbers = {0, 2, 5, 7, 5, 10};
        String [] names = {"JOão", "Maria"};

//        int [] numbers = new int[3];
//        numbers[0] = zero;
//        numbers[1] = one;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        int five = numbers [4];
        System.out.println(five);

        System.out.println("Enhances for loop");

        for (int number : numbers) {
            System.out.println(number);
        }

        //while loop

        int count = 0 ;

        while (count <= 20) {
            System.out.println("count " + count);
            count++;
        }

        //do while

        do {
            System.out.println("count " + count);
            count++;

        } while (count <= 20);

        //Scanner class
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//
//        System.out.println("How old are you?");
//        int age2 = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age2).getYear();
//        System.out.println("Your were born in " + year);
//
//        System.out.println(age >= 18 ? "You're an adult" : "You're a minor");

        //Methods

        String brand = "Motorola";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("M"));
        System.out.println(brand.endsWith("s"));

        char[] letters = {'A', 'B', 'A', 'B', 'D', 'D', 'C', 'C'};
        int counter = countOccurrences(letters, 'Z');
        System.out.println(counter);

        //Classes and Objects
        Lens lensOne = new Lens("Sony",
                "50mm",
                true);

        Lens lensTwo = new Lens("Nikkon",
                "30mm",
                true);

        Lens lensThree = new Lens("Canon",
                "15mm",
                true);

        Passport ukPassPort = new Passport(
                "1253",
                "UK",
                LocalDate.of(2026, 1 ,25));
        Passport usPassPort = new Passport(
                "564",
                "USA",
                LocalDate.of(2005, 8 ,14));

        //Java Streams




    }

    public static int countOccurrences(
            char [] letters, char searchLetter) {
        int count = 0 ;
        for (char letter : letters ){
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;

    }
    //Classes and Objects

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }


}
