package keyPairSum;


import java.util.Scanner;

public class KeyPairSum {
    static void mergeSort(int a[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    static void merge(int a[], int l, int mid, int r){
        int b[] = new int[r-l+1];
        int i= l;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=r){
            if (a[i]<a[j]){
                b[k]=a[i];
                k++;
                i++;
            }
            else {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        while (j<=r) {
            b[k] = a[j];
            k++;
            j++;
        }
        while (i<=mid){
            b[k]=a[i];
            k++;
            i++;
        }
        for (i=l; i<=r; i++){
            a[i]=b[i-l];
        }
    }
    static void findPair(int a[], int l, int r, int sum){
        boolean bool = false;
        System.out.println("Sum : "+sum);
        for (l=0; l<a.length; l++){
            for (r=a.length-1; r>=0; r--){
                if (a[l]+a[r]==sum){
                    System.out.println(a[l]+","+a[r]);
                    bool = true;
                }
                if (bool = false){
                    System.out.println("Not Exist");
                }
            }
        }
    }
    static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
    public static void main(String[]args){
        int a[] = {12,44,6,60,32,41,61};
        KeyPairSum ob = new KeyPairSum();
        ob.mergeSort(a,0,a.length-1);
        System.out.println("Sorted array : ");
        ob.print(a);
        ob.findPair(a,0,a.length-1,50);
    }
}