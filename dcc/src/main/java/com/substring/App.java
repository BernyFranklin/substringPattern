package com.substring;

import java.util.LinkedList;

/**
 * Given a string and a pattern, 
 * find the starting indices of all occurrences of the pattern in the string. 
 * For example, given the string "abracadabra" and the pattern "abr", 
 * you should return [0, 7].
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creating local variables
        String str = "abracadabra";
        String sub = "abr";
        int strSize = str.length();
        int subSize = sub.length();
        // List to store beginning indices
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Loop through each index anf check if there's an occurance of sub
        for (int i = 0; i < strSize; i++){
            // If reaching end of word
            if (strSize - i < subSize ){
                break;
            }
            // Check each index to see if substr exists
            if (str.substring(i, (i+subSize)).compareTo(sub) == 0){
                // Add beginning index to list
                list.add(i);
            }
        }
        for(Integer item: list){
            System.out.println(item);
        }
    }
}
