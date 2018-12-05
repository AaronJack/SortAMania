public class Merge {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 5, 4, 6, 8, 7, 9, 10};
        int[] empty = new int[10];
        sort(numbers);
        for(int a = 0; a < numbers.length; a++){
            System.out.println(numbers[a]);
        }
    }
    public static void sort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        sortBuilder(elements, 0, n - 1, temp);
    }
    public static void sortBuilder(int[] elements, int from, int to, int[] temp) {
        if(from < to){
            int middle = (from + to) / 2;
            sortBuilder(elements, from, middle, temp);
            sortBuilder(elements, middle + 1, to, temp);
            sorter(elements, from, middle, to, temp);
        }
    }
    public static void sorter(int[] elements, int from, int mid, int to, int[] temp){
        int i = from;
        int j = mid + 1;
        int k = from;
        while(i <= mid && j <= to){
            if(elements[i] < elements[j]){
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = elements[i];
            i++;
            k++;
        }
        while(j <= to){
            temp[k] = elements[j];
            j++;
            k++;
        }
        for(k = from; k <= to; k++){
            elements[k] = temp[k];
        }
    }
}
