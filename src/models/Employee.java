package models;

public class Employee extends Person {
    private String position;

    private double salary;

    @Override
    public String toString() {
        return "Employee:" + getId() + ". " + getName() + " "+getSurname();
    }
    public Employee(String name, String surname, String position,double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        if(o.getPaymentAmount()>this.getPaymentAmount())
            return -1;
        if(o.getPaymentAmount()<this.getPaymentAmount())
            return 1;
        return 0;
    }
}
