package sorting;

public class MergeSorting {
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
    static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
    public static void main(String[]args){
        int a[] = {10,7,8,9,1,5};
        MergeSorting ob = new MergeSorting();
        ob.mergeSort(a,0,a.length-1);
        System.out.println("Sorted array : ");
        ob.print(a);
    }
}
