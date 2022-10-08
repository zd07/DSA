import java.util.*;
class AlphabetTriangle2{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=n;i>=1;i--){
		char c='A';
			for(int j=1;j<=i;j++){
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}
