/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author idpacheco
 */
public class Dog {
    private String name;
    private int age;
    private String raza;

    public Dog(String name, int age, String raza) {
        this.name = name;
        this.age = age;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + ", raza=" + raza + '}';
    }
    
    

    
}
