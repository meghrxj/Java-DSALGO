public class BubbleSort{
    public static void main(String[] args){

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        
    }

    public static void swap(int[] array, int i, int j){

        // there's no element to swap if they're equal
        //so return the value
        if (i == j){
            return;
        }
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
