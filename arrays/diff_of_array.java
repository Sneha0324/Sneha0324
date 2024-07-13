package arrays;

import java.util.ArrayList;

public class diff_of_array {

	public static void main(String[] args) {
		int[] x = {1,2,4,3};
		int[] y = {1,5,7,4};
		int a = x.length;
		int b = y.length;
		ArrayList<Integer> s = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		
		for (int i = 0; i < a; i++)
            s.add(y[i]);
		
		for (int i = 0; i < a; i++)
            r.add(x[i]);
         
        for (int i = 0; i < b; i++)
            if (!s.contains(x[i]))
                System.out.print(x[i] + " ");
        
        for (int j = 0; j < a; j++)
            if (!r.contains(y[j]))
                System.out.print(y[j] + " ");
	}
}
