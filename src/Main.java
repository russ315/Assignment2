import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Student("Ruslan","Bolatbekuly",4));
        people.add(new Student("Dauren","Zhexenov",2.2));
        people.add(new Student("Nurkhan","Orazbai",2.0));

        people.add(new Employee("George","Harrison","Position",50000));
        people.add(new Employee("John","Lennon","junior", 27045.78));

        Collections.sort(people);
        printData(people);

    }

    static void printData(Iterable<Person> people){
        for(Payable person:people){
            System.out.println(person+" earns "+person.getPaymentAmount());
        }

    }

}