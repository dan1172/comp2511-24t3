package sol;

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
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
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
