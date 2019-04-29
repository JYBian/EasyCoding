/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycoding.ch02;

import java.io.Serializable;

/**
 *
 * @author wliu
 */
public class Person {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;

    public Person() { }
    
    public Person(String name,  int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "name == " + name + ", age == " + age;
    }

}
