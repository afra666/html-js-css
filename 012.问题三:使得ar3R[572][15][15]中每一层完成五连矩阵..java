/**
问题一:初始化4个15x15的二维数组,将蓝色的元素赋值为true,其余元素为false.

问题二:将QQQQ中的每个首子元素存入ar3R[572][15][15]中(即ar3R[cnt][15][15]),使得每个蓝色小格子占据一层,
例如:ar3R[0]={
{t,f,f,f...},
{f,f,f…..},
…..
}

问题三:使得ar3R[572][15][15]中每一层完成五连矩阵.
 */
package p;

public class Main {
	public static void main(String[] args) {
		boolean [][]Q1=new boolean[15][15];
		boolean [][]Q2=new boolean[15][15];
		boolean [][]Q3=new boolean[15][15];
		boolean [][]Q4=new boolean[15][15];
		int cnt=0;
		boolean ar3R[][][]=new boolean[572][15][15];
		/**
		ht t t t t. direction
		 */
		System.out.println("cnt="+cnt);
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <=10; j++) {
				Q1[i][j]=true;
				ar3R[cnt][i][j]=Q1[i][j];
				//use for loop to complete five true in every ar3R[][][]
				for (int k = 1; k <=4; k++) {
					//列延长
					ar3R[cnt][i][j+k]=Q1[i][j];
				}
				cnt++;
			}
		}
		System.out.println("cnt="+cnt);
		/**
		ht
		 t 
		 t 
		 t 
		 t. direction
		 */
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <15; j++) {
				Q2[i][j]=true;
				ar3R[cnt][i][j]=Q2[i][j];
				for (int k = 1; k <=4; k++) {
					ar3R[cnt][i][j]=Q2[i][j];
				}
				cnt++;
			}
		}
		System.out.println("cnt="+cnt);
		/**
		ht
		 	t 
		 		t 
		 			t 
		 				t. direction
		 */
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <=10; j++) {
				Q3[i][j]=true;
				ar3R[cnt][i][j]=Q3[i][j];
				for (int k = 1; k <=4; k++) {
					ar3R[cnt][i+k][j+k]=Q3[i][j];
				}
				cnt++;
			}
		}
		System.out.println("cnt="+cnt);
		/**
							ht
		 				t
		 			t 
		 		t 
		 	t. direction
		 */
		for (int i = 0; i <=10; i++) {
			for (int j = 4; j <15; j++) {
				Q4[i][j]=true;
				ar3R[cnt][i][j]=Q4[i][j];
				for (int k = 1; k <=4; k++) {
					//i use plus to down
					ar3R[cnt][i+k][j-k]=Q4[i][j];
				}
				cnt++;
			}
		}
	
		System.out.println("cnt="+cnt);
/**
 * 以下输出四个二维矩阵QQQQ
 */
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (Q1[i][j]==true) {
					System.out.print("."+" ");
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
					System.out.print("."+" ");
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
					System.out.print("."+" ");
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
					System.out.print("."+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		/**
		 * 以下输出三维矩阵ar3R的两层
		 */
		System.out.println("开始输出ar3R[0]=");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (ar3R[0][i][j]==true) {
					System.out.print("."+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
		System.out.println("开始输出ar3R[571]=");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <15; j++) {
				if (ar3R[571][i][j]==true) {
					System.out.print("."+" ");
				}else {
					System.out.print("f"+" ");
				}
			}
			System.out.println();
		}
	
	}
}


/**
cnt=0
cnt=165
cnt=330
cnt=451
cnt=572
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 

. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
. . . . . . . . . . . . . . . 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 

. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
. . . . . . . . . . . f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 

f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f . . . . . . . . . . . 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
开始输出ar3R[0]=
. . . . . f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
开始输出ar3R[571]=
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f f 
f f f f f f f f f f f f f f . 
f f f f f f f f f f f f f . f 
f f f f f f f f f f f f . f f 
f f f f f f f f f f f . f f f 
f f f f f f f f f f . f f f f 


 */









