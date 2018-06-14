/**
 * @Project: HelloController
 * @Author: liming
 * @Date: 2018年05月08日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaclient02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: HelloController
 *
 * @author liming
 * @Description: HelloController
 * @date 2018年05月08日
 */
@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/hello")
    public String hello() {
        List<String> services =
                discoveryClient.getServices();
        logger.info("service port {} ", 9003);
        return "hello 9003";
    }

    public static void main(String[] args) {
        List<Person> javaProgrammers = Person.javaProgrammers();
        List<Person> phpProgrammers = Person.phpProgrammers();
       // javaProgrammers.stream().filter(e -> e.getAge() >30).limit(2).forEach(c -> System.out.println(c.getFirstName()+"..."+c.getAge()));
       List<Integer> list = Arrays.asList(1,2,3,4,5);
       TestInferFace c = (x)->  System.out.println(1);
       c.sayHello(3);
    }
}

 class Person {

     private String firstName, lastName, job, gender;
     private int salary, age;

     public Person(String firstName, String lastName, String job,
                   String gender, int age, int salary) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.gender = gender;
         this.age = age;
         this.job = job;
         this.salary = salary;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getJob() {
         return job;
     }

     public void setJob(String job) {
         this.job = job;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public  static  List<Person> javaProgrammers(){
         List<Person> javaProgrammers = new ArrayList<Person>() {
             {
                 add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                 add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                 add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                 add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                 add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                 add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                 add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                 add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                 add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                 add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
             }
         };
         return  javaProgrammers;


     }

     public  static  List<Person> phpProgrammers(){
         List<Person> phpProgrammers = new ArrayList<Person>() {
             {
                 add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                 add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                 add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                 add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                 add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                 add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                 add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                 add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                 add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                 add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
             }
         };
         return  phpProgrammers;
     }


     @Override
     public String toString() {
         return "Person{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", job='" + job + '\'' +
                 ", gender='" + gender + '\'' +
                 ", salary=" + salary +
                 ", age=" + age +
                 '}';
     }
 }
