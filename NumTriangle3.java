import java.util.*;
class NumTriangle3{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        		for(int i=1;i<=n;i++){
			int j;
			for(j=1;j<=i;j++){
				System.out.print(j + " ");
			}
			for(int k=1;k<=(n-i)*2;k++){
				System.out.print("  ");
			}
			j--;
			for(;j>=1;j--){
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}
}
