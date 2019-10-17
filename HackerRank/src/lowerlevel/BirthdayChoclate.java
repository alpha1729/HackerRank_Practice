package lowerlevel;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class BirthdayChoclate {

	    // Complete the birthday function below.
	    static int birthday(List<Integer> s, int d, int m) {
	    	int sum=0;int count=0;
	    	for(int i=0;i<=s.size()-m;i++) {
	    		sum = subarraysum(s, i,m);
	    		if(sum==d)
	    			count++;
	    	}
	    	return count;
	    }

	  private static int subarraysum(List<Integer> s,int index, int m) {
	    int sum=0;
		for(int i=0;i<m;i++)
			sum +=s.get(index + i);
		return sum;
		}

		public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> s = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int sItem = Integer.parseInt(sItems[i]);
	            s.add(sItem);
	        }

	        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int d = Integer.parseInt(dm[0]);

	        int m = Integer.parseInt(dm[1]);

	        int result = birthday(s, d, m);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

