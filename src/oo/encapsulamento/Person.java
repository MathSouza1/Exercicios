package oo.encapsulamento;

public class Person {
    private String name;
    private String middleName;
    private int age;

    public Person(String name, String middleName, int age){
        setName(name);
        setMiddleName(middleName);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return getName() + " " + getMiddleName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = Math.abs(age);
        if(age >= 0 && age <= 120){
            this.age = age;
        }
    }

    @Override
    public String toString(){
        return "Hello, I am " + getName() + " and I have " + getAge() + " years old.";
    }
}
