package example3;

public class CompanySalary {
	public static void main(String[] args) {
		Employee [] employee = new Employee[29];
		for(int i=0;i<employee.length;i++){
			if(i%3==0)
				employee[i] = new WeekWorker();
			else if (1%3==1)
				employee[i] = new MonthWorker();
			else if(i%3==2)
				employee[i] = new YearWorker();
		}
		 Company company = new Company(employee);
		 System.out.println("��˾нˮ�ܶ�:"+company.salariesPay()+"Ԫ");
	}
}
