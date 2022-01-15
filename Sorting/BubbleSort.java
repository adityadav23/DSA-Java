package Sorting;
  static void BubbleSort(int[] arr){
      
      int length = arr.length;
     
         for(int i =0; i< length; i++){
             
             boolean swapped = false;
             for(int j =1; j< length-i ;j++){
                 if(arr[j]< arr[j-1]){
                     swap(arr, j, j-1);
                 
                     swapped = true;
                 }
                 
             }
             
             if(!swapped){
                 return ;
             }
         }
     }
     
private static void swap(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


