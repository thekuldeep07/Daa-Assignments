package common;

public class common {
    static void common(int a[], int b[]){
        System.out.println("Common elements are : ");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if (a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();
    }
    static void print(int a[], int b[]){
        System.out.println("1st array : ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("2nd array : ");
        for (int i=0; i<b.length; i++){
            System.out.print(+b[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int a[] = {10,10,34,39,55,76,85};
        int b[] = {10,10,11,30,30,34,55,69,75,89};
        print(a,b);
        common(a,b);
    }
}
