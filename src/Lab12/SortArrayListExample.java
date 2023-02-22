package Lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class SortArrayListExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Jane"));
        employees.add(new Employee(3, "Bob"));

        System.out.println("Before sorting (by name):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort the ArrayList using Comparable
        Collections.sort(employees);
        System.out.println("\nAfter sorting (by name using Comparable):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort the ArrayList using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });

        System.out.println("\nAfter sorting (by id using Comparator):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}