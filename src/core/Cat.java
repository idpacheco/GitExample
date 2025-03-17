/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author idpacheco
 */
public class Cat {

    private String name;
    private int age;
    private String razaG;

    public Cat(String name, int age, String razaG) {
        this.name = name;
        this.age = age;
        this.razaG = razaG;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", age=" + age + ", razaG=" + razaG + '}';
    }
    
    

}
