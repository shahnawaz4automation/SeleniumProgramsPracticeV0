package com.Practice.Selenium072024;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo1 {
	public static void main(String[] args) {
		Map<Integer, String> ht = new HashMap<Integer, String>();
        ht.put(101, "A");
        ht.put(102, "B");
        ht.put(103, null);
        ht.put(104, null);
        ht.put(105, "E");
        
        ht.size();
        for(Object i : ht.keySet()) {
        	System.out.println(i);
        }
        for(Object i : ht.values()) {
        	System.out.println(i);
        }
	}

}
