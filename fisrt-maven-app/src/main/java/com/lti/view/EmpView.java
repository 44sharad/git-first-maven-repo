package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	public static void main(String[] args){
	
	Employee e=new Employee();
	e.setEmpId(1001);
	e.setEmpName("SHARAD");
	System.out.println(e.getEmpId()+" "+e.getEmpName());
	
	}
}
