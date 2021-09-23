package sorting;

import java.util.Scanner;

public class SortingAndFindDuplicate {
    static void swap(int a[], int i, int j){
        a[i] = a[i]^a[j];
        a[j] = a[i]^a[j];
        a[i] = a[i]^a[j];
    }
    static void bubbleSorting(int a[]){
        for(int i =0; i<a.length; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j+1]<a[j]){
                    swap(a,j+1,j);
                }
            }
        }
    }
    static void duplicate(int a[]){
        boolean if_present = false;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    if_present = true;
                }
            }
        }
        if(if_present==true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[]args){
        SortingAndFindDuplicate ob = new SortingAndFindDuplicate();
        System.out.println("Enter n for array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        ob.bubbleSorting(a);
        ob.duplicate(a);
        ob.print(a);
    }
}
