package lab_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




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
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort first = new SelectionSort();
        
        assertEquals( Sortedarr, first.basicSelectionSort(arr));
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
    	
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort first = new SelectionSort();
        
        assertEquals( Sortedarr, first.basicSelectionSort(arr));
    }
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        SelectionSort first = new SelectionSort();
        
        assertEquals( Sortedarr, first.basicSelectionSort(arr));
    	
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        SelectionSort first = new SelectionSort();
        
        assertEquals( Sortedarr, first.basicSelectionSort(arr));
        /** Test data contains duplicates **/
    }


}
