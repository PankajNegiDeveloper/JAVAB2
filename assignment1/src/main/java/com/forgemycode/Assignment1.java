package com.forgemycode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.forgemycode.beans.Person;
import com.forgemycode.config.ProjectConfig;

public class Assignment1 {

    public static void main(String[] args) {

       
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

        //Vehicle veh = context.getBean(Vehicle.class);
        Person per = context.getBean(Person.class);
        
        System.out.println(per);
        
        }
        
        
       
    }
}