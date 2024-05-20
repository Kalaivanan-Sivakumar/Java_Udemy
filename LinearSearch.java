
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int arr[]= {44,33,22,11,99,88,77,66,55};
            int a[]=new int[0];
            int target=99;
            int result;
//            result= linearSearch(arr,target);
           result=linearSearch(a,target);
           
           if(result==-1) {
        	   System.out.println("Element not found");
           }else {
        	   System.out.println(result);
           }
            
            
	}
	
	public static int linearSearch(int[] arr,int target) {
		if(arr.length==0)
			return -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return i;
		}
		
		return -1;
		
	}

}
