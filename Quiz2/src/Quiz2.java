
public class Quiz2 {

	public static void main(String[] args) {
		
//Q1
		System.out.println("1.");
		int max = 5;
		for (int n = 1; n <= max; n++) {
			   System.out.println(n);
		}
		System.out.println();
			
//while
		int a=1;
		while(a<=5) {
			System.out.println(a);
			a++;
		}
		System.out.println(); 
			
//Q2
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		    total = total - number;
		    System.out.println(total + " " + number);
		}
		System.out.println();
			
//While
		int b = 25;
		int c = 1;
		while(c <= (b/2)) {
				b = b-c;
			System.out.println(b + " "+c);
			c++;
		}
		System.out.println();
			
//Q3
		System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
		    for (int j = 1; j <= 3; j++) {
		        for (int k = 1; k <= 4; k++) {
		            System.out.print("*");
		        }
		        System.out.print("!");
		    }
		    System.out.println();
		}
		System.out.println();
			
//While
		int x=1;
		while(x<=2) {
			int y=1;
			while(y<=3) {
				int z=1;
				while(z<=4) {
					System.out.print("*");
					z++;
				}
				System.out.print("!");
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println();
				
			
			
//Q4
		System.out.println("4.");
		int number = 4;
		for (int count = 1; count <= number; count++) {
		    System.out.println(number);
		    number = number / 2;
		}
			    
//While
		int e = 4;
		int f = 1;
		while(f <= e) {
			System.out.println(e);
				e = e/2;
				f++;
	    }
	}
}
