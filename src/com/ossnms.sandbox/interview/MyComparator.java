package com.ossnms.sandbox.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {

        MyComparator x = new MyComparator();
        x.go();
    }

    private void go() {
        List<Employee> employees = getEmployees();
        Comparator<Employee> c = Comparator.<Employee, String>comparing(a -> a.name).thenComparing(a -> a.age)
                                                                                    .thenComparing(a -> a.empId);
        employees.sort(c);
        System.out.println(employees);
    }

    private List<Employee> getEmployees() {

        List<Employee> col = new ArrayList<>();

        col.add(new Employee(5, "Frank", 28));
        col.add(new Employee(1, "Jorge", 19));
        col.add(new Employee(11, "Jorge", 18));
        col.add(new Employee(6, "Bill", 34));
        col.add(new Employee(3, "Michel", 10));
        col.add(new Employee(7, "Simpson", 8));
        col.add(new Employee(4, "Clerk",16 ));
        col.add(new Employee(8, "Lee", 40));
        col.add(new Employee(2, "Mark", 30));

        return col;
    }

    class Employee implements Comparable<Employee> {

        private int empId;

        private String name;

        private int age;

        Employee(int empId, String name, int age) {
            this.empId = empId;
            this.name = name;
            this.age = age;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Employee o) {
            return empId - o.empId;
        }

        @Override
        public String toString() {
            return String.valueOf(empId) + ": " + name + "("+ age+")";
        }
    }
}
