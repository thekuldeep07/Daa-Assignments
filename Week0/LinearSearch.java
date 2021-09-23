package linearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==key){
               return true;
            }
        }
        return false;
    }

    public static void main(String [] args){

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
        if(linearSearch(arr,key)){
            System.out.println(key+" is found in array ");
        }
        else{
            System.out.println("Key not found in array");
        }
    }
}
