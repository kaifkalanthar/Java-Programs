package sorting;

import java.util.Arrays;

class BubbleSort{

    public void sort(int n[]){
        int count =0;
        boolean isSorted;

        for (var i=0;i<n.length;i++) {
            isSorted =true;
            for (var j = 1; j < n.length; j++)
                if (n[j] < n[j - 1]) {
                    swap(n, j, j - 1);
                    count++;
                    isSorted =false;
                }
            if (isSorted)
                return;
        }
        System.out.println(count);
    }
    private void  swap(int arr[],int index1,int index2){
        var temp =arr[index1];
        arr[index1] =arr[index2];
        arr[index2] =temp;
    }
}
public class Main {
    public static void main(String[] args) {
        int n []={4,3,1,2,5,3,4,6,78,45,54,34};
        var sorter = new BubbleSort();
        sorter.sort(n);
        System.out.println(Arrays.toString(n));

    }
}
