package sorting;

public class SelectionSorting {

    static void swap(int a[], int min, int i){

        a[i] = a[i]^a[min];
        a[min] = a[i]^a[min];
        a[i] = a[i]^a[min];

    }
    static void sorting(int a[]){
        int n = a.length;
        for(int i=0 ; i<n-i ; i++) {
            int min=i;
            for(int j=i+1 ; j<n ; j++) {
                if(a[j]<a[min]) {
                    min=j;
                }
            }
            swap(a ,i , min);
        }
    }
    static void print(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[]args){
        int a[] = {23,12,65,57,3,91,11};
        SelectionSorting ob = new SelectionSorting();
        ob.sorting(a);
        ob.print(a);
    }
}
