package com.udemy.contectapp;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList();
        people.add(new Person("Salman Qadri", "0766134164646"));
        people.add(new Person("Salman Qadri", "0766134164646"));
        people.add(new Person("Arsalan Raza", "093684452609"));
        people.add(new Person("Arman Ansari", "095576340120"));
    }
}
