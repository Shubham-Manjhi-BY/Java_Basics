package com.PredicateFunctionIInterFace;


import com.LambdaWIthComparator.Person;
import javafx.scene.control.cell.TextFieldListCellBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest
{
    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate)
    {
        return predicate.test(person);
    }

    static ArrayList<Person> isPersonsEligibleForVoting(List<Person> persons){
        ArrayList<Person> booleans2 = new ArrayList<>();
        for (Person person:
                persons) {
            Predicate<Person> predicate3 = p -> p.getAge() >= 18 && p.getAge() <= 60;
            if(isPersonEligibleForVoting(person, predicate3))
            {
                booleans2.add(person);
            }
        }
        return booleans2;
    }

    static ArrayList<Person> isPersonsEligibleForRetirement(List<Person> persons){
        ArrayList<Person> booleans = new ArrayList<>();


        for (Person person:
                persons) {
            Predicate<Person> predicate3 = p -> p.getAge() > 60;
            if(isPersonEligibleForVoting(person, predicate3))
            {
                booleans.add(person);
            }

        }
        return booleans;
    }


    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Arjun",29,"India"));
        persons.add(new Person("Michael",25,"USA"));
        persons.add(new Person("Staffi",22,"Australia"));
        persons.add(new Person("Samantha",61,"Bhutan"));

        // Predicate test
        Predicate<Person> predicate = p -> p.getAge() >= 18 && p.getAge() <= 60;

        for (int i = 0; i < persons.size(); i++)
        {
            boolean eligible = isPersonEligibleForVoting(persons.get(i), predicate);
            System.out.println("Person is eligible for voting " +persons.get(i).getName() +" : "+ eligible);
        }


        System.out.println(" ");
        System.out.println(" ");


        // Predicate test
        Predicate<Person> predicate2 = p -> p.getAge() > 60;
        for (int i = 0; i < persons.size(); i++)
            {
                boolean eligible = isPersonEligibleForVoting(persons.get(i), predicate2);
                System.out.println("Person is eligible for Retirement : " +persons.get(i).getName() +" : "+ eligible);
            }

        System.out.println(" ");
        System.out.println(" ");




        for (Person person:  isPersonsEligibleForRetirement(persons)) {
            System.out.println("Person is eligible for Retirement : " +person.getName());
        }

        System.out.println(" ");
        System.out.println(" ");

        for (Person person: isPersonsEligibleForVoting(persons)) {
            System.out.println("Person is eligible for Voting : " +person.getName());
        }







    }
}
