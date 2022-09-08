package com.PredicateFunctionIInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class supplierget
{
    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate)
    {
        return predicate.test(supplier.get());
    }

    public static void main(String args[])
    {

        Supplier<Person> supplier = new ArrayList<>();
        supplier.add(new Person("Arjun",29,"India"));
        supplier.add(new Person("Michael",25,"USA"));
        supplier.add(new Person("Staffi",22,"Australia"));
        supplier.add(new Person("Samantha",61,"Bhutan"));



        //Supplier<Person> supplier = () -> new Person("Arjun",29,"India");
        Predicate<Person> predicate = (p) -> p.getAge() >18;

        for(Person person : supplier)
        {
            boolean eligible = isPersonEligibleForVoting(person,predicate);
            System.out.println("Person is Eligible for Voting "+person.getName()+" : "+eligible);
        }

    }
}
