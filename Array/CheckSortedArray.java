class CheckSortedArray{
	public static void main(String args[]){
		int arr[]={23,24,25,22,26};
		int count=0;
		for(int i=0;i<arr.length;i++){
        		for(int j=0;j<arr.length-1;j++){
            			if(arr[j]>arr[j+1]){
					count++;
                		}
			}
            	}
		if(count==0){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
		
        }
}