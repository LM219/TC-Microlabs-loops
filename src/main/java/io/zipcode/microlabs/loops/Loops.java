package io.zipcode.microlabs.loops;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Loops {

    public static String printArray(String[] input){
        String response = "*** Output ***";
        for(int x=0; x< input.length; x++){
            response +="\n" + input[x];
        }
        return response;
    }

    
    public static String lastElement(String[] input){
        String response = "*** Output ***\n";
        String output = input[input.length-1];
        response += output;
        
        return response;
    }
    
    public static String secondLastElement(String[] input){
        String response = "*** Output ***\n";
        String output = input[input.length-2];
        response += output;
        
        return response;
    }
    
    public static String reverseArray(String[] input){
        String response = "*** Output ***";
       
        List<String> list = Arrays.asList(input);
        Collections.reverse(list);
        input = (String[])list.toArray();
        
        for(int x=0; x< input.length; x++){
            response +="\n" + input[x];
       
        }
        return response;
    }
        
    public static String reverseArray2(String[] input){
            String response = "*** Output ***";
            int position = 0;
            String reverse[] = new String[input.length];
            
            for (int x= input.length-1; x>=0; x--) {
            	reverse[position]= input[x];
            	position++;
            }
            	
            for(int x=0; x< input.length; x++){
            response += "\n" + reverse[x];
            }
            return response;
            	
            }
    
    
    public static String palindrome(String[] input, String [] palindromeInput){
    	// A loop that checks if the 1st and so on variable of 
    	String test[] = new String[input.length];
    	String response = "*** Output ***";
    	for (int x=0; x<input.length; x++){
    		if (input[x] == palindromeInput[x])
    		{
    			test[x]= "True";
    		}
    		else 
    		{
    			test[x]= "False";
    		}
    	}
    	
    	for(int x=0; x< test.length; x++){
            response += "\n" + test[x];
            }
    	
            return response;
    }
    
    public static String conDuplicates(int[] input){
    	String output = "*** Output ***";
    	String response= output + "\n" + String.valueOf(input[0]);
    	for (int x=1; x<=input.length-1; x++){
    			if (input[x-1]!=input[x]) {
    				response += "\n" + input[x];
    			}
    	}
    	return response;
    }
    
    public static String packDuplicates(char[] input)
    {
    	String output = "*** Output ***";
    	String response = output + "\n" + input[0];
    	for (int x=1; x<=input.length-1; x++)
    	{
    	if(input[x-1]!=input[x])
    	{
    		response += ", ";
    	}
    	response += input[x];
    		
    	}
    	return response;
    }
    	

}

    	
   
    	
    				
    				
    			
    
   
     
        
    