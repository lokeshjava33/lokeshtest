package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
import com.durgasoft.dao.EmployeeDao;

public class Test {

	/**
	 * @param args
	 */
//modified 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contest= new ClassPathXmlApplicationContext("applicationContest.xml");
		EmployeeDao dao= (EmployeeDao) contest.getBean("empDao");
		/*Employee emp = new Employee();
		//emp.setEno(111);
		emp.setEname("AAA");
		emp.setEsal("5000");
		emp.setEaddr("Hyd1");
		String status=dao.insertEmployee(emp);
		System.out.println(status);*/
		
		/*Employee emp= dao.searchEmployee(111);
		if(emp == null)
		{
			System.out.println("employee not exist");
		}
		else
		{
			System.out.println("employee exist");
			System.out.println("eno :"+emp.getEno());
		}*/
		
		Employee emp= new Employee();
		emp.setEno(111);
		emp.setEname("Sravan");
		emp.setEaddr("warangal");
		emp.setEsal("9000");
		
		String status = dao.updateEmployee(emp);
		System.out.println(status);
		
		/*String status= dao.deleteEmployee(111);
		System.out.println(status);*/
		

	}

}
