class MoveZero{
	public static void main(String args[]){
		int arr[]={3,5,0,0,0,8,0,9};
		int count=0,j=0;
		int temp[]=new int[arr.length];
		for(int i=0;i<8;i++){
			if(arr[i]!=0){
			temp[j++]=arr[i];
			}
		}
		for(int i=0;i<8;i++){
			if(i<j){
				arr[i]=temp[i];
			}
			else{
				arr[i]=0;
			}
		}
		for(int i=0;i<8;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
			
		