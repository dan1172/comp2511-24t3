package employee;

import java.time.LocalDate;
import java.util.Objects;

public class Lecturer extends Employee {
    private LocalDate hireDate;

    public Lecturer(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Lecturer oth = (Lecturer) obj;
        return Objects.equals(this.hireDate, oth.hireDate);
    }
}
