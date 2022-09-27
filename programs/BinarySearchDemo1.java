import java.util.Arrays;
class BinarySearchDemo1
{ 	public static void binarySearch(int first, int last, int arr[], int key){ 
int mid = (first + last)/2; 
while( first <= last ){ 
if ( arr[mid] < key ){
first = mid + 1;
}else if ( arr[mid] == key ){
System.out.println("Element found at index: " + mid);
break;
}else{
last = mid - 1;
}
mid = (first + last)/2;
}
if ( first > last ){
System.out.println("Element not found!"); } }
public static void main(String args[]) {
	int arr[] = { 18, 19, 13, 12, 15, 17, 16};
	Arrays.sort(arr); 
	System.out.println(Arrays.toString(arr));
	int key = 15;
	int last=arr.length-1;
binarySearch(0,last,arr,key); }
}