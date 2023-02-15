package Collection1;


import java.util.ArrayList;
public class EmployeeId {
	public static void main(String[]args) {
		int empId1=101;
		int empId2=102;
		int empId3=110;
		int empId4=501;
		int empId5=360;
		ArrayList<Integer>emp=new ArrayList<>();
		emp.add(empId1);
		emp.add(empId2);
		emp.add(empId3);
		emp.add(empId4);
		emp.add(empId5);
		emp.add(3,500);
		emp.remove(2);
		emp.set(2, 100);
	    System.out.println(emp);
		System.out.println(emp.get(0));
	    System.out.println(emp.size());
	    
	    for(int i=0;i<emp.size();i++) {
	    	System.out.println(emp.get(i));
	    }
	    System.out.println("***********************");
	    for (Integer i:emp) {
	    	System.out.println(i);
	    }
	    System.out.println("//////////////////");
	   emp.forEach(i->System.out.println(i));
	   
	   System.out.println("--------------------------");
	    emp.forEach(i->{
	    	if(i%2==0) {
	    		System.out.println(i+"is even");
	    	}
	    	else {
	    		System.out.println(i+"is odd");
	    		
	    	}
	    });
	    }
	    
		
		
		
	}


