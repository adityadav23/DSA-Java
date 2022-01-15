  static void SelectionSort(int[] arr){
      int length = arr.length;
      
      for(int i=0; i<length; i++){
          int last = arr.length -1 -i;
          int maxIndex = maxIndex(arr, last);
          
          swap(arr, maxIndex, last);
      }
  }
     
 static int maxIndex(int[] arr, int last){
     int max = 0;
     
     for(int i = 0 ; i<=last; i++){
         if(arr[max]< arr[i]){
             max = i;
         }
     }
     return max;
 }
     

private static void swap(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

