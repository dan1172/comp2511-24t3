package sol;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee {
    // a manager "is a" employee
    private LocalDate hireDate;

    public Manager(int salary, String name, LocalDate hireDate) {
        // we generally want to "delegate" repsonsibility to the 
        // superclasses constructor for initialisng the superclass fields
        super(salary, name);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager oth = (Manager) obj;
        return Objects.equals(this.hireDate, oth.hireDate);
    }
}
