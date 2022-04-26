package ty;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 1;
        arr[4] = 10;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 6;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        int[] result = new SelectionSort().basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, result);
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = -9;
         arr[2] = -6;
         arr[3] = -1;
         arr[4] = -10;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -10;
         Sortedarr[1] = -9;
         Sortedarr[2] = -8;
         Sortedarr[3] = -6;
         Sortedarr[4] = -1;
         int[] result = new SelectionSort().basicSelectionSort(arr);
         assertArrayEquals(Sortedarr, result);
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
    	 int[] arr = new int[5];
         arr[0] = -9;
         arr[1] = -7;
         arr[2] = 2;
         arr[3] = 8;
         arr[4] = 10;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -9;
         Sortedarr[1] = -7;
         Sortedarr[2] = 2;
         Sortedarr[3] = 8;
         Sortedarr[4] = 10;
         int[] result = new SelectionSort().basicSelectionSort(arr);
         assertArrayEquals(Sortedarr, result);
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
    	 int[] arr = new int[5];
         arr[0] = 2;
         arr[1] = 6;
         arr[2] = 6;
         arr[3] = 8;
         arr[4] = 10;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = 2;
         Sortedarr[1] = 6;
         Sortedarr[2] = 6;
         Sortedarr[3] = 8;
         Sortedarr[4] = 10;
         int[] result = new SelectionSort().basicSelectionSort(arr);
         assertArrayEquals(Sortedarr, result);
        /** Test data contains duplicates **/
    }
}
