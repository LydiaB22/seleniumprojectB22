package com.cybertek.utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        Faker faker = new Faker();

        String fullName = faker.name().fullName();

        System.out.println("fullName = " + fullName);

    }

}
