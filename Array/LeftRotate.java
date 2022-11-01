class LeftRotate{
	public static void main(String args[]){
		int arr[]={12,34,37,78,90};
		int n=2;
		int temp;
		for(int i=0;i<n;i++){
			temp=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	
	}
}