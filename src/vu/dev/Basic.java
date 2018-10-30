package vu.dev;

import java.util.Scanner;

public class Basic {
	
  public static void main(String[] args) {    
 	 operatorBasic();
 	 giaiPtrinhBac2();
     sumFor();
 	 sumWhile();
 	 randomEnglish();
  }
  
  private static void operatorBasic() {
	    int a = 6;
		int b = 2;
		int tong = a+b;
		System.out.println("Tong 2 so a + b = " + tong);
		
		int hieu = a-b;
		System.out.println("Hieu 2 so a - b = " + hieu);
		
		int tich = a*b;
		System.out.println("Tich 2 so a + b = " + tich);
		
		int thuong = a/b;
		System.out.println("Thuong 2 so a / b = " + thuong);
		
		int chiaLayDu = a%b;
		System.out.println("Chia lay du a % b = " + chiaLayDu);
   }
  //	GIAI PHUONG TRINH BAC 2
  private static void giaiPtrinhBac2()
  {
		 Scanner sc = new Scanner(System.in);
	     float a, b, c;
	     
	     System.out.println("Nhap so a :");
	     a = sc.nextInt();
	     
	     System.out.println("Nhap so b :");
	     b = sc.nextInt();
	     
	     System.out.println("Nhap so c :");
	     c = sc.nextInt();
	     
	    float delta = b*b - 4*a*c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PHuong trinh co nghiem la : "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
  }
  
  private static void sumFor() {
	  int sum = 0;
	  for(int i=0; i<=100; i++){  
		  sum += i;
	  } 
	  System.out.println("Tong cua 100 so tu nhien dau tien bang vong lap for = " + sum);  
  }
  
  private static void sumWhile() {
	// TODO Auto-generated method stub
    int sum = 0;
    int i = 0;
    while(i <= 100){  
    	sum += i;
    	i++;  
    }  
    System.out.println("Tong cua 100 so tu nhien dau tien bang vong lap While = " + sum);  
  }
  
  private static void randomEnglish() {
	Scanner scn = new Scanner(System.in);
	int n;
	
	System.out.println("Nhap so n tu 0 den 10 :");
	n = scn.nextInt();
    switch (n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Thriew");
			break;
		case 4:
			System.out.println("For");
			break;
		case 5:
			System.out.println("Fine");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Ten");
			break;
	}
  }
  
}
