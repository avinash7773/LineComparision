class EmpWage{
	public static  void main(String[] argv){
		int is_Full_Time = 1;
		int is_Part_time = 2;
		int total_hours;
		int wage_rate_per_hour = 20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int EmpWage;
		if(empCheck == is_Full_Time){
			System.out.println("Employee is Full Time");
			total_hours = 8;

		}else if(empCheck == is_Part_time){
			System.out.println("Employee is Part Time");
			total_hours = 4;
		}else{
			total_hours = 0;
			System.out.println(" Employee is absent");
		}
		EmpWage = wage_rate_per_hour * total_hours;
		System.out.println("Employee Wage="+EmpWage);

	}

}

