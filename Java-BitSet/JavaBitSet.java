import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        int N = Integer.valueOf(str[0]);
        int M = Integer.valueOf(str[1]);
        BitSet[] b = { null,new BitSet(N), new BitSet(N)};
        for(int i=0; i<M ;i++){
            String[] op = input.nextLine().split(" ");
            int att1 = Integer.valueOf(op[1]);
            int att2 = Integer.valueOf(op[2]);
            if(op[0].indexOf("A")==0){b[att1].and(b[att2]);}
            if(op[0].indexOf("O")==0){b[att1].or(b[att2]);}
            if(op[0].indexOf("X")==0){b[att1].xor(b[att2]);}
            if(op[0].indexOf("F")==0 && att2>=0)
                {b[att1].flip(att2);}
            if(op[0].indexOf("S")>=0 && att2>=0)
                {b[att1].set(att2);}
            System.out.println(b[1].cardinality() + " " + b[2].cardinality());
        }
        
    }
}
