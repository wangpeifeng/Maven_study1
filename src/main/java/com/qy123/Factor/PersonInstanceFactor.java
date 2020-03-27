package com.qy123.Factor;

import com.qy123.bean.Person;

public class PersonInstanceFactor {
    private Person getPerson(String name) {
        Person person = new Person();
        person.setId(1);
        person.setAge(22);
        person.setName(name);
        return person;
    }
}