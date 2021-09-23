package binarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int a[], int key){
        int low = 0, high = a.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(key>a[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){

        BinarySearch ob = new BinarySearch();
        System.out.println("Enter n for the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = ob.binarySearch(arr,key);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }

}
