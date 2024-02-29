package Stringpgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String1 {
	
	public static void main(String[] args) {
//				
//		String str="java is is easy easy";
//		String[] arr=str.split(" ");
//		
//		Map<String, Integer>map1=new HashMap<String, Integer>();
//		
//		for(String s:arr)
//		{
//			
//			if (map1.containsKey(s)) {
//				
//				map1.put(s, map1.get(s)+1);
//				
//			} else {
//				map1.put(s, 1);
//
//			}
//		}
//		
//		
//		Set<Map.Entry<String, Integer>>set1=map1.entrySet();
//		for(Map.Entry<String, Integer> mm:set1)
//		{
//			if(mm.getValue()>1)
//			{
//				System.out.println(mm.getKey() + " " +mm.getValue());
//			}
//		}
//		
		
		
		/*
		
		String str="pragtippg";
		
		char[] arr=str.toCharArray();
		
		
		Map<Character, Integer>map1=new HashMap<Character, Integer>();
		
		for(Character ch:arr)
		{
			if(map1.containsKey(ch))
			{
				map1.put(ch,  map1.get(ch)+1);				
				
			}
			
			else
			{
				map1.put(ch,  1);
			}
			
		}
		
		System.out.println(str + ":" +map1);
		
		*/
		
		
		
		
		//String str="Pragti Gupta Sharma Gaurav Hunsaurabh Testing";    //6
		String str="PragtiGuptaSharmaGauravHunsaurabhTesting";
	      int count =0;
	    
	      for(int i=0;i<=str.length()-1;i++)
	      {
	          if(str.charAt(i)>=65 && str.charAt(i)<=90)
	          {
	              //System.out.println(str.charAt(i));
	              count++;
	          }
	      }
	    System.out.print(count);
	    
	  	    
	   
	}
		
		
	
	
	
	

		
	}


