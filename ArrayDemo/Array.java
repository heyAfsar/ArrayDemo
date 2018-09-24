package ArrayDemo;
import java.util.Scanner;

public class Array {
	
	static{
		System.out.println("gfjewf,f");
	}
	
	public static void x(){
		System.out.println("fasar");
	}
	
	public static void main(String[] args){
		
		String arr[] = new String[3];
		String fruits[] = {"Apple","Mango","Banana","Peach"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Names...\n");
		//get
		for(int i = 0; i<arr.length;i++){
			arr[i] = sc.nextLine();
		}
		//disp
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		//foreach
		for(String element:fruits){	//specify the element and specify its value from array
			System.out.print(element+"\t");
		}
		
		
	}
}
