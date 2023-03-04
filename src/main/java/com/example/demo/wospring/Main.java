package com.example.demo.wospring;

import com.example.demo.wospring.model.Person;
import com.example.demo.wospring.repository.MapStorage;
import com.example.demo.wospring.service.AtomicCounter;
import com.example.demo.wospring.service.PersonService;
import com.example.demo.wospring.service.PersonServiceImpl;
import com.example.demo.wospring.service.SettingsCounter;

public class Main {
    public static void main(String[] args) {

        var settingsCounter = new SettingsCounter(2, 4);
        var counter = new AtomicCounter(settingsCounter);

        var storage = new MapStorage(counter);

        var service = new PersonServiceImpl(storage);

        System.out.println(service.getbyId(1));
        System.out.println(service.save(new Person("a", 1)));
        System.out.println(service.getbyId(6));

    }
}
