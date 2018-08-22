import java.util.Objects;

public class Employee {

    int empId;
    String name;
    int salary;

    @Override
    public String toString() {
        return "{" +
                "empId=" + empId +
                ",name='" +name + '\'' +
                ",alary=" + salary +
                '}';
    }

    public  Employee(int empId , String name , int salary)
    {
        this.empId = empId;
        this.salary =salary;
        this.name =name;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, salary);
    }
}
