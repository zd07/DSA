import java.util.*;
class AlphabetTriangle4{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        		char a='A';
        		for(int i=1;i<=n;i++){
		    		a+=n-1;
				for(int j=1;j<=i;j++){
					System.out.print(a-- +" ");
				}
				a='A';
				System.out.println();
	   	 }
	}
}
