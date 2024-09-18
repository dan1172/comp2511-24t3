package employee;

public class Employee {
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    /**
     * Getter for the employees salary
     * @return the employees salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Setter for the salary
     * @param salary - salary in $AUD
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // a formatted string printing out the varialbes
        // System.out.println("Hi we are in toString");
        return "Employee : [salary = " + salary + ", name = " + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        // we want to make sure that the  variable values ar ethe same
        // we need to make sure theyre of hte same class type
        if (this.getClass() != obj.getClass()) return false;
        Employee othEmployee = (Employee) obj;
        return othEmployee.salary == this.salary && othEmployee.name.equals(this.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee(10, "Johanson");
        Employee e2 = new Employee(10, "Johanson");

        System.out.println(e == e2);
    }
}
