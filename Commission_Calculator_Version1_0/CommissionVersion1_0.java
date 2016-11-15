package com.Commission_Calculator;

public class CommissionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Plase input name : ");
		String name = input.next();
		System.out.print("Plase input salary : ");
		double salary = input.nextDouble();
		System.out.print("Plase input sales figure : ");
		double sales_figure = input.nextDouble();
		Commission_class obj = new Commission_class(name, salary, sales_figure);
		obj.Commission_calculation();
		obj.Display_Calculation_Compensation_received();
	}

}
