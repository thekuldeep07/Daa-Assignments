package sorting;

import java.util.Scanner;

public class CountSort {

    public static void countSort(int a[], int min, int max){
        int range = max-min+1;
        int freq[] = new int[range];
        for (int i=0; i<a.length; i++){
            int idx = a[i] - min;
            freq[idx]++;
        }
        for (int i=1; i<freq.length; i++){
            freq[i] = freq[i] + freq[i-1];
        }
        int ans[] = new int[a.length];
        for(int i=a.length-1; i>=0; i--){
            int value = a[i];
            int pos = freq[value-min];
            ans[pos-1] = value;
            freq[value-min]--;
        }
        for (int i=0; i<ans.length; i++){
            a[i]= ans[i];
        }
    }
    public static void print(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the array : ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        countSort(a,min,max);
        print(a);
    }


}
