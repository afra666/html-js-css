package p;

public class Main {
	public static void main(String[] args) {
		boolean [][]Q1=new boolean[15][15];
		boolean [][]Q2=new boolean[15][15];
		boolean [][]Q3=new boolean[15][15];
		boolean [][]Q4=new boolean[15][15];
		int cnt=0;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <=10; j++) {
				Q1[i][j]=true;
				cnt++;
			}
		}
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <15; j++) {
				Q2[i][j]=true;
				cnt++;
			}
		}
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <=10; j++) {
				Q3[i][j]=true;
				cnt++;
			}
		}
		for (int i = 0; i <=10; i++) {
			for (int j = 4; j <15; j++) {
				Q4[i][j]=true;
				cnt++;
			}
		}
	
		System.out.println("cnt="+cnt);
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (Q1[i][j]==true) {
					System.out.print("t"+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (Q2[i][j]==true) {
					System.out.print("t"+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (Q3[i][j]==true) {
					System.out.print("t"+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (Q4[i][j]==true) {
					System.out.print("t"+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	
	
	}
}

/**
cnt=572
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 

t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
t t t t t t t t t t t t t t t 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 

t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
t t t t t t t t t t t f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 

f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f t t t t t t t t t t t 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 


*/
