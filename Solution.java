package com.common;

public class Solution {

	  public int solution(int number) {
	   int sum=0;
	    
	    for(int i=3; i< number;i++){
	      if(i % 3 == 0 || i % 5==0)
	        sum +=i;
	      System.out.println(sum);
	    }
	   return sum;
	   
	  }
	  public static void main (String args[]){
	    
	    Solution sol =new Solution();
	    sol.solution(10);
	  }
	}
