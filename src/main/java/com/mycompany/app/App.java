package com.mycompany.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean method1(Integer[] intArr, 
            ArrayList<Integer> arrListInteger,
            int start, int end) {

		if (start < 0 || end >= intArr.length || start > end)
			return false;

		Set<Integer> set = new HashSet<>();
		for (int i = start; i <= end; i++) {
			set.add(intArr[i]);
		}
	
	
		for (Integer num : arrListInteger) {
			if (!set.contains(num))
				return false;
		}
	
		return true;
		}

}
