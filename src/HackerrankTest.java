import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HackerrankTest {
	
	// Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int totCharged = 0;
    	int totActual = 0;
    	
    	for(int i = 0; i < bill.size(); i++) {
    		totCharged += bill.get(i);
    		if(i != k)
    			totActual += bill.get(i);
    	}
    	
    	totCharged /= 2;
    	totActual /= 2;
    	
    	if(totActual == b) {
    		System.out.println("Bon Appetit");
    	} else {
    		System.out.println(totCharged - totActual);
    	}
    	
    }
	
	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int[] record = new int[2];

		int min = scores[0];
		int max = scores[0];

		int cMin = 0;
		int cMax = 0;

		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				cMin++;
				min = scores[i];
			}

			if (scores[i] > max) {
				cMax++;
				max = scores[i];
			}
		}

		// Max Score
		record[0] = cMax;
		record[1] = cMin;

		return record;
	}

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int p = 0;
		
		for (int i = 0; i < s.size(); i++) {
			int c = 0;
			int somma = 0;
			
			if (i + m <= s.size()) {
				while (c < m) {
					somma = somma + s.get(i + c);
					c++;
				}
				
				if(somma == d)
					p++;
			}

		}

		return p;
	}
	
	// Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	Map<Integer, Integer> map = new HashMap();
    	
    	for(int bird : arr) 
    		map.put(bird, map.getOrDefault(bird, 0) + 1);
    	
    	int minValue = Integer.MAX_VALUE;
    	int count = Integer.MIN_VALUE;
    	
    	for(Entry<Integer, Integer> entry : map.entrySet()) {
    		if(entry.getValue() > count) {
    			minValue = entry.getKey();
    			count = entry.getValue();
    		} else {
    			if(entry.getValue() == count) {
    				if(entry.getKey() < minValue) {
    					minValue = entry.getKey();
    					count = entry.getValue();
    				}
    			}
    		}
    	}
    	
		return minValue;
    }
    
    static int pageCount(int n, int p) {
    	int count = 0;
    	
    	if(n % 2 == 0) {
    		if(p == n - 1 || p == n - 2) 
    			return 0;
    		if(p == 1)
    			return 0;
    	} else {
    		if(p == 1)
    			return 0;
    		if(p == n - 1)
    			return 0;
    	}
    	
    	
    	
		return count;
    }
    
    public static void main(String [] args) throws IOException {
    	int pc = pageCount(6,2);
    	System.out.print(pc);
    }
}
