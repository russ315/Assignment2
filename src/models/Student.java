package models;

public class Student extends Person {

    public Student(String name,String surname,double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }
    private static final double stipend = 36660;
    private double gpa;
    @Override
    public String toString() {
        return "Student:" + getId() + ". " + getName() + " "+getSurname();
    }
    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        if(gpa>2.67)
            return stipend;
        return 0;
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
