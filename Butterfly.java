import java.util.*;
class Butterfly{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        		for(int i=1;i<=n;i++){
			int j;
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=1;k<=(n-i)*2;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print( "*");
			}
			System.out.println();
		}
		// reverse
		for(int i=n-1;i>=1;i--){
			int j;
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=1;k<=(n-i)*2;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print( "*");
			}
			System.out.println();
		}
	}
}
