package com.LambdaWIthComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonServices
{
    public static List<Person> getPersons(List<Person> persons)
    {
        Collections.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return persons;
    }
}
