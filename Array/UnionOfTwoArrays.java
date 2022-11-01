import java.util.*;
class UnionOfTwoArrays{
	public static void main(String []args){
		ArrayList<Integer> list= new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first arrry.");
		int n=sc.nextInt();
		System.out.println("Enter size of second arrry.");
		int m=sc.nextInt();
		int arr1[]= new int[n];
		int arr2[]= new int[m];
		System.out.println("Enter elements of first arrry.");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second arrry.");
		for(int j=0;j<m;j++){
			arr2[j]=sc.nextInt();
		}
		int i=0,j=0;
		while(i<n && j<m){
			if(arr1[i]==arr2[j]){
				if(list.size()>0 && list.get(list.size()-1)!=arr1[i]){
					list.add(arr1[i]);
				}
				else if(list.size()==0){
					list.add(arr1[i]);	
				}
				i++;j++;
			}
			else if(arr1[i]<arr2[j]){
				if(list.size()>0 && list.get(list.size()-1)!=arr1[i]){
					list.add(arr1[i]);
				
				}
				else if(list.size()==0){
					list.add(arr1[i]);	
				}
				i++;
			}
			else{
				if(list.size()>0 && list.get(list.size()-1)!=arr2[j]){
					list.add(arr2[j]);
				}
				else if(list.size()==0){
					list.add(arr2[j]);	
				}
				j++;
			}
		}
		while(i<n){
			if(arr1[i]!=arr2[j-1]){
				if(list.size()>0 && list.get(list.size()-1)!=arr1[i]){
					list.add(arr1[i]);
				
				}
				i++;
			}
		}
		while(j<m){
			if(arr1[i-1]!=arr2[j]){
				if(list.size()>0 && list.get(list.size()-1)!=arr2[j]){
					list.add(arr2[j]);
				}
				j++;
			}
		}
		System.out.println(list);
	}
}
			