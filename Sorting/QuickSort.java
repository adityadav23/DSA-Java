package Sorting;
import java.util.Arrays;

public class QuickSort{

     public static void main(String []args){
        
       int[] arr ={235,32,5,4,56,563};
       
       quickSort(arr, 0, arr.length-1);
                 System.out.println(Arrays.toString(arr));
                

     }
 
    static void quickSort(int[] arr, int start, int end){
        
        if(start<end){
            int pIndex = partition(arr, start, end);
            
            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
            
        }
    }
    
    private static int partition(int[] arr, int start, int end){
        
        int pivot = arr[end];
        int pIndex = start;
        
        
        for(int i = start; i< end; i++){
            if(arr[i]<pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     
}