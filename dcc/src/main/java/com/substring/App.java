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
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Loop through each index anf check if there's an occurance of sub
        for (int i = 0; i < strSize; i++){
            if (strSize - i < strSize ){
                break;
            }
        }
    }
}
