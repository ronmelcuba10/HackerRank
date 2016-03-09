import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = Integer.valueOf(input.nextLine());
        LinkedList<String> nums = new LinkedList<String>();
        String[] str = input.nextLine().split("\\s+");
        for(int i = 0; i<N; i++)nums.add(str[i]);
        int Q = Integer.valueOf(input.nextLine());
        for(int i=0; i<Q; i++){
            String inst = input.nextLine();
            if (inst.indexOf("Insert")==0) {
                String[] ops = input.nextLine().split(" ");
                nums.add((int)Integer.valueOf(ops[0]),ops[1]);
            }
            if(inst.indexOf("Delete")==0) nums.remove((int)Integer.valueOf(input.nextLine()));
        }
        String result = "";
        for(String num : nums) result = result.concat(num + " ");                              
        System.out.println(result.trim());                              
    }
}
