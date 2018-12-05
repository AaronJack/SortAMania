public class QuickSort {
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        int holder = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] <= pivot){
                i++;
                holder = arr[i];
                arr[i] = arr[j];
                arr[j] = holder;
                System.out.println(i);
            }
        }
        holder = arr[right];
        arr[right] = arr[i + 1];
        arr[i + 1] = holder;
        return i+1;
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot +1, right);
        }
    }
}
