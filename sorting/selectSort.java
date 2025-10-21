package sorting;

public class selectSort {
    public static void main(String[] args){
    int[] a={64,34,25,5,22,11,90,12};
    int n=a.length;

    for(int i=0; i<n-1; i++){
        int min_index=i;
    //find the minimum element in remaining array
    for(int j=i+1; j<n;j++){
        if(a[j]<a[min_index]){
            min_index=j;
        }
    }

    //Swap only if a smaller element wasfound
if(min_index!=i){
    int temp=a[i];
    a[i]=a[min_index];
    a[min_index]=temp;
}
    }
    System.out.print("Sorted array:");
    for(int i=0;i<n;i++){
        System.out.print(a[i]+ " ");

    }
    System.out.println();
}
}
