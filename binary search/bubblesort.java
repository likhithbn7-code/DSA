public class bubblesort{
    public static void main(String[] args){

    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i <arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-1; j++ ){
                if (arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true
                }
            }
             if (!swapped){
                break;
             }
        }
    }
}        