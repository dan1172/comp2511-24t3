package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Employee constructor
     * @param name the full legal name of this employee
     * @param salary salary in $aud
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return this.salary == employee.salary && this.name.equals(employee.name);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Franco", 1);
        System.out.println(e1);
        // Employee e2 = new Employee("Franco", 1);
        // System.out.println(e1.equals(e2));
        // System.out.println(e1 == e2);
        // e1.equals(new ArrayList<>());
    }
}
