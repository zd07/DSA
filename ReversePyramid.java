import java.util.*;
class ReversePyramid{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        		for(int i=n;i>=1;i--){
            		for(int j=n-i;j>=1;j--){
                			System.out.print(" ");
            		}
            		for(int j=1;j<=(i*2)-1;j++){
                			System.out.print("*");
            		}
            		System.out.println();
		}
	}
}
