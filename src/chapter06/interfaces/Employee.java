package chapter06.interfaces;

public class Employee implements Comparable<Employee>{

    private String name;
    private double salary;

    public Employee(String n,double s){
        name=n;
        salary=s;
    }

    public void raiseSalary(double byPercent){
        double raise= salary * byPercent/100;
        salary+=raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.getSalary());
    }
}
