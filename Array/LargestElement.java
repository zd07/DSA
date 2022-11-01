class LargestElement{
	public static void main(String args[]){
		int arr[]={25,40,45,32,12};
		int largest =arr[0];
		for(int i=1;i<arr.length;i++){
			if(largest<arr[i]){
				largest=arr[i];
			}
		}
		System.out.println(largest);


	}
}
			
			