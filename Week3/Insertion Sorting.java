package sorting;

public class InsertionSorting {
    static void sorting(int a[]){
        int n = a.length;
        for(int i=1; i<n; i++){
            int temp = a[i];
            int j = i-1;
            while (j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    static void print(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[]args){
        int a[] = {12,121,513,5,66,55,9};
        InsertionSorting ob = new InsertionSorting();
        ob.sorting(a);
        print(a);
    }
}
