package com.Commission_Calculator;

public class Commission_class {
	private String name="";	 	 //???????????
	private double salary=0; 	 //?????????
	private double sales_figure=0; 	 //??????
	private double compensation=0;       //?????????
	private double commission= 0;         //??????????
	
	public Commission_class(String name,double salary,double sales_figure) {
		this.name = name;
		this.salary = salary;
		this.sales_figure = sales_figure;
	}
	
	public  void Commission_calculation(){
		if(this.sales_figure >=1 && this.sales_figure <= 25000){
			this.commission = 0.01;
		}else if(this.sales_figure <=50000){
			this.commission = 0.02;
		}else if(this.sales_figure > 50000){
			this.commission = 0.03;
		}
		this.compensation = this.salary +(this.sales_figure * this.commission);
	}
	public  void Display_Calculation_Compensation_received(){
		System.out.println("---------------------------------------");
		System.out.println("Name is "+this.name+" compensation is "+commission+"  Bath");
	}

}

