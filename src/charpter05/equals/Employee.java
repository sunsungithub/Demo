package charpter05.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
	private String name;
	private Date hireDay;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee (String name,double salary, int year, int month, int day) {
		this.name=name;
		this.salary=salary;
	    GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		this.hireDay=calendar.getTime();
	}
	
	public void raiseSalary(double byPercent) {
		
		double raise=salary*byPercent/100;
		salary+=raise;
	}
	
	
	public boolean equals(Object otherObj) {
		
		if(this==otherObj) {
			return  true; 
		} 
		
		if(otherObj==null) {
			return false;
		}
		if(getClass()!=otherObj.getClass()) {
			return false;
		}
		
		Employee e=(Employee)otherObj;
		
		return Objects.equals(name, e.name) && salary==e.salary && Objects.equals(hireDay, e.getHireDay());

	}
	
	public int hashCode() {
		return  Objects.hash(name,salary,hireDay);
	}
	
	public String toString() {
		return  getClass().getName()+"[name="+name+", salary="+salary+", hireDay="+hireDay+"]";
		
	}
	

}
