import java.util.*;

class Sorting{
	
	static void insertion_sort(int size, int []arr){
		
		for(int i=0; i>size; ++i){
			
			int key = arr[i];
			
			int j = i-1;
			
			while(j>=0 && arr[j]>key){
				
				arr[j+1] = arr[j];
				j= j-1;
				
				print_array(arr);
				
				
			}
			
			arr[j+1] = key;
			
		}
		
		
	}
	
	static void print_array(int arr){
		
		int size=arr.length;
		
		for(int i=0; i<size; i++){
			
			System.out.println(arr[i]);
			
			
		}
		
	}






  public static void main(String[] args){
	  
	 
	 int arr[] = {1,2,4,5,3};

	  
     insertion_sort(5,arr);
	 
	 print_array(arr);
  
    }

}