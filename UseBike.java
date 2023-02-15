package Collection1;
import java.util.ArrayList;
public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike("yamaha",30000,"black",false);
		Bike bike2=new Bike("Honda",45000,"white",true);
		Bike bike3=new Bike("Royal",80000,"red",false);
		Bike bike4=new Bike("hero",30000,"blue",false);
		Bike bike5=new Bike("ty",50000,"yello",true);
		ArrayList<Bike>bike=new ArrayList<>();
		bike.add(bike1);
		bike.add(bike2);
		bike.add(bike3);
		bike.add(bike4);
		bike.add(bike5);
		System.out.println(bike);
		System.out.println(bike.get(3));
		for(int i=0;i<bike.size();i++) {
		System.out.println(bike.get(i));
		}
		int max=bike.get(0).getPrice();
		Bike all=bike.get(0);
		for(Bike i:bike) {
			if(i.getPrice()>max) {
				max=i.getPrice();
				all=i;
			
			}
			
		}
		System.out.println(all);
		bike.forEach(x-> {
			if(x.isImported()==true) {
				System.out.println(x.getBrand()+" is imported");
			}
			else {
				System.out.println(x.getBrand()+" is local brand");
			}
		});
		String name="VIJAY";
		System.out.println(name.concat("vairamuthu"));
		
		
	}

}
