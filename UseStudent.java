package Collection1;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("vijay",25,"XII","vairamuthu",true);
		Student s2=new Student("kamal",23,"VI","kamalf",false);
		Student s3=new Student("muthu",25,"XI","muthuf",true);
		Student s4=new Student("sathish",22,"VII","sathishf",false);
		Student s5=new Student("hari",25,"Xiii","harif",true);
		
		ArrayList<Student>stds=new ArrayList<>();
		stds.add(s1);
		stds.add(s2);
		stds.add(s3);
		stds.add(s4);
		stds.add(s5);
		System.out.println(stds);
		
		ArrayList<Student>male=new ArrayList<>();
		ArrayList<Student>female=new ArrayList<>();
		
		stds.forEach(i-> {
			if(i.isMale()==true) {
				male.add(i);
				
			}
			else {
				female.add(i);
			}
			
		});
		System.out.println(male);
		System.out.println(female);
		
		Student max=male.get(0);
		
		for(int i=0;i<male.size();i++) {
		if(male.get(i).getAge()>max.getAge()) {
			max=male.get(i);
		}
			
		}
		System.out.println(max);
		Student maxx=female.get(0);
		for(Student i:female) {
			if(i.getAge()>maxx.getAge()) {
				maxx=i;
			}
		}
		System.out.println(maxx);
		for(int i=0;i<stds.size();i++) {
			System.out.println(stds.get(i).getName().concat(stds.get(i).getFatherName()));
		}
		
		
	}

}
