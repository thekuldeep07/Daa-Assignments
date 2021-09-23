package sorting;

public class QuickSorting {
    static void swap(int a[],int i, int j){
        a[i] = a[i]^a[j];
        a[j] = a[j]^a[i];
        a[i] = a[i]^a[j];
    }
    static int parition(int a[], int l, int h){
        int pivot = a[h];
        int i = l-1;
        for (int j=l; j<=h-1; j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,h);
        return i+1;
    }
    static void quickSort(int a[],int l, int h){
        if (l<h){
            int pivot = parition(a,l,h);
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,h);
        }
    }
    static void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
    public static void main(String[]args){
        int a[] = {10,7,8,9,1,5};
        QuickSorting ob = new QuickSorting();
        ob.quickSort(a,0,a.length-1);
        System.out.println("Sorted array : ");
        ob.printArray(a);
    }
}
