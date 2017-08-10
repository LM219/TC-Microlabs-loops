package io.zipcode.microlabs.loops;


import org.junit.Assert;
import org.junit.Test;

public class LoopsTest {

    @Test
    public void printArrayTest(){
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";
        //:when
        String actual =Loops.printArray(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void secondLastElement(){
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nTomatoes";
        //:when
        String actual =Loops.secondLastElement(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void reverseArray(){
        // :Given
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n"
        		+"Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        //:when
        String actual =Loops.reverseArray(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
   
    
    @Test
    public void reverseArray2(){
        // :Given
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n"
        		+"Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        //:when
        String actual = Loops.reverseArray2(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void palindrome(){
        // :Given
    	  String [] palindrome = {"Sausage", "Eggs", "Beans",
                  "Bacon", "Tomatoes", "Mushrooms"};
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tom", "Mushrooms"};
        String expected = "*** Output ***\n"
        		+"True\n" +
                "True\n" +
                "True\n" +
                "True\n" +
                "False\n" +
                "True";
        //:when
        String actual = Loops.palindrome(breakfast, palindrome);

        //:Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void conDuplicates()
    {
        // :Given
    	int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
    	
        String expected = "*** Output ***\n"
        		+"1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";
        //:when
        String actual = Loops.conDuplicates(nums);

        //:Then
        Assert.assertEquals(expected, actual);
    }
        
        
     @Test
     public void packDuplicates()
     {
            // :Given
    	 char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        	
            String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee"; 
            //:when
            String actual = Loops.packDuplicates(letters);

            //:Then
            Assert.assertEquals(expected, actual);
    
    
     }
}

