package Week2;

public class Problem1 {

    void merge(int arrk[], int l, int m, int r, int arrv[]) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];
        int Lk[] = new int[n1];
        int Rk[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arrk[l + i];
            Lk[i] = arrv[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arrk[m + 1 + j];
            Rk[j] = arrv[m + 1 + j];
        }
        int i = 0, j = 0;

        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arrk[k] = L[i];
                arrv[k] = Lk[i];

                i++;
            }
            else {
                arrk[k] = R[j];
                arrv[k] = Rk[j];

                j++;
            }

            k++;
        }
        while (i < n1) {
            arrk[k] = L[i];
            arrv[k] = Lk[i];

            i++;
            k++;
        }
        while (j < n2) {
            arrk[k] = R[j];
            arrv[k] = Rk[j];

            j++;
            k++;
        }
    }
    void sort(int arrk[], int l, int r, int arrv[])
    {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arrk, l, m, arrv);
            sort(arrk, m + 1, r, arrv);
            merge(arrk, l, m, r, arrv);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n; ++i)

            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arrk = { 5, 1, 4, 6, 8, 0, 6, 6, 5, 5 };
        int[] arrv = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Problem1 ob = new Problem1();

        ob.sort(arrk, 0, n - 1, arrv);

        System.out.print("Keys: ");
        printArray(arrk);

        System.out.println();

        System.out.print("Values: ");
        printArray(arrv);
    }
}
