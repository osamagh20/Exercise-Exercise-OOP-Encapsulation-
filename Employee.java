public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {

    }

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSalary() {
        return salary ;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary *12 ;
    }
    public double raiseSalary(double percentage) {
         return salary = (salary * percentage) / 100 + salary ;
    }
    public String toString() {
        return "Name: " + name + " ID: " + id + " Salary: " + getSalary() + " Annual Salary: " + getAnnualSalary();
    }

}
