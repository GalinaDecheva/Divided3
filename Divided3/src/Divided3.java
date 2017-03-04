import java.util.Scanner;
public class Divided3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int a;
	
	
		System.out.print("Enter Value: ");
		a = input.nextInt();
		
		for(int temp = 3; temp <= a; temp +=3){
			System.out.print((temp == 3 ? "" : ",")+ temp);
		}
				
   input.close();	
   	
	}
}


