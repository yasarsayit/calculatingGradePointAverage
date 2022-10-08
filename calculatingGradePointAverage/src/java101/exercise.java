package java101;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int math , physics , chemistry  , turkish , history , music ;
		
		Scanner inp = new Scanner(System.in);
		
			System.out.print("math point:");
			math = inp.nextInt();
			
			System.out.print("physics point:");
			physics = inp.nextInt();
			
			System.out.print("chemistry point:");
			chemistry = inp.nextInt();
			
			System.out.print("turkish point:");
			turkish = inp.nextInt();
			
			System.out.print("history point:");
			history = inp.nextInt();
			
			System.out.print("music point:");
			music = inp.nextInt();
			
			int total = (math + physics + chemistry + turkish + history + music);
			double result = total / 6.0;
			System.out.println("result:" + result);
			
			String sonuc = result >= 60 ? "sınıfı gecti" : "sınıfta kaldı";
            System.out.print("öğrencinin derslerinin ortalaması:" + result + "\nÖğrenci " + sonuc + ".");
        
			
	}

}
