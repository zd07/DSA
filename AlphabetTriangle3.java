import java.util.*;
class AlphabetTriangle3{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        		char c='A';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				
				System.out.print(c);
				
			}
			c++;
			System.out.println();
		}
	}
}
