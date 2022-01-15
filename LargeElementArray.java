package proyek_latihan;

/**
 *
 * @author singg
 */
public class LargestElement_array {
    public static void main(String[]args){
        int [] arr= new int[]{205,11,7,75,96};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.print("Largest element present in given array: "+max);
    }
    
}
