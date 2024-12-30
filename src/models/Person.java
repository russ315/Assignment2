package models;

public abstract class Person implements Payable,Comparable<Person> {
    private static  int staticId = 1;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        setId();
    }

    public Person() {
        setId();
    }

    private void setId() {
        this.id = staticId++;
    }
    public abstract String getPosition();


    private int id;

    public int getId() {
        return id;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String surname;
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id+". "+name+" "+surname;
    }
}
