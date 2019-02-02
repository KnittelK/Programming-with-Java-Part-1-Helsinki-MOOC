/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinK
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> book = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.book.add(person);
    }
    
    public void printAll() {
        for (Person ele : this.book) {
            System.out.println(ele.toString());
        }
    }
    
    public String searchNumber(String name) {
        String num = "number not known";
        for (Person ele : this.book) {
            if (ele.getName() == name) {
                num = ele.getNumber();
            }
        }
        return num;
    }
}
