package com.switchfully.api;

import com.google.common.collect.Lists;
import com.swtichfully.domain.person.Person;

import java.util.ArrayList;

public class MyAPI {

    public static void main(String[] args) {
        ArrayList<Person> people = Lists.newArrayList(
                new Person("Tommy"),
                new Person("Timmy"));

        people.forEach(person -> System.out.println(String.format("Hello %s", person.getName())));
    }

}
