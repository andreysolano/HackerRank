//https://www.hackerrank.com/challenges/time-conversion/problem
// Andrey Solano
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    char[] ch = new char[s.length()-2];
    int number  = Integer.parseInt(""+s.charAt(0)+s.charAt(1));
        for(int i=0;i<= 7;i++){
                 ch[i] = s.charAt(i);  
        }
       
        char [] chars = {'0','0'};
        
        if(number == 12){
            if(s.charAt(8) == 'P'){
                    chars = String.valueOf(number).toCharArray();
            } else if(s.charAt(8) == 'A'){
                    chars[0]='0';
                    chars[1]='0'; 
            }
        }else if(s.charAt(8) == 'P'){
                chars = String.valueOf(number+12).toCharArray();
        }else if(s.charAt(8) == 'A'){
                chars[0]='0';
                chars[1]=(char)(number+'0');
        }
        
                for (int i=0;i<2;i++){
                ch[i] = chars[i];   
                }
        System.out.println(ch[0]);
        System.out.println((char)(number+'0'));
        String rta = String.valueOf(ch);
        return rta;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
