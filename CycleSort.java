import java.util.Arrays;


public class CycleSort{
  public static void main(String args[]) {
    

    int[] arr = {5,3,2,4,1};
   
    cycleSort(arr);
     System.out.println(Arrays.toString(arr));
    
 }   

  static  void cycleSort(int[] arr){

    int end = arr.length -1;
    int i =0;
    while(i<=end){
    
        int correctIndex = arr[i] -1;
        if(arr[i] != arr[correctIndex]){
          swap(arr, i , correctIndex);
        }
        i++;
    }

 }

   static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
 }
}
