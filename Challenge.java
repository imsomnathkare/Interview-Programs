package com.java8.practice;

import java.util.*;
import java.util.stream.*;
public class Challenge {
    public static String firstNonRepeatingLetter(String str) {
      Map<Character,Integer> map=new LinkedHashMap();
      
      for(Character ch:str.toCharArray()){
        map.put(ch,map.containsKey(ch) ? map.get(ch) + 1:1);
      }
     
      char nonrepetedchar =map.entrySet().stream().
    	        filter( x -> x.getValue()==1).
    	        findFirst().get().getKey();
      String nonRepetedCharinStr =Character.toString(nonrepetedchar);
      System.out.println(nonRepetedCharinStr);
      return nonRepetedCharinStr;
      
    }
  
  public static void main(String args[]){
    String str="stress";
    String ch =firstNonRepeatingLetter(str);
  }
}
