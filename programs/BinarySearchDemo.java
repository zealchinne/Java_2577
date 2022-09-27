class BinarySearchDemo
{
	public static void binarySearch(int first, int last, int arr[], int key){ // 1  2  3  4  5----//
int mid = (first + last)/2; //3
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
System.out.println("Element not found!");
}
}
public static void main(String args[]) {
	int arr[] = {1,2,3,4,5};
	int key = 3;
	int last=arr.length-1;
binarySearch(0,last,arr,key);
}
}