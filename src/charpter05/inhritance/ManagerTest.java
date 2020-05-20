package charpter05.inhritance;

public class ManagerTest {
	
	public static void main(String[] args) {
		
		Manager manager=new Manager("Carl Cracker",8000,1987,12,15);
		manager.setBonus(5000);
		
		Employee[] staff=new Employee[3];
		staff[0]=manager;
		staff[1]=new Employee("Harry Hacker",5000,1989,10,1);
		staff[2]=new Employee("Tommy Tester",4000,1990,3,15);
		
		for(Employee e: staff) {
			System.out.println("name="+e.getName()+",Salary="+e.getSalary());
		}
		
	}

}
