package oo.encapsulamento;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person("Pedro", "Amoedo", -45);
        person.setAge(230); // alterar

        System.out.println(person.getAge()); // ler
        System.out.println(person); // toString
        System.out.println(person.getFullName());
    }
}
