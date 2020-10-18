package example3;

public class Company {
	Employee [] employees;
	 double salaries = 0;
	 public Company(Employee[] employee) {
		// TODO Auto-generated constructor stub
		 this.employees = employee;
	}
	 public double salariesPay(){
		 salaries = 0;
		 for(int i =0;i<employees.length;i++){
			 salaries = salaries +employees[i].earnings();
		 }
		 return salaries;
	 }
}
