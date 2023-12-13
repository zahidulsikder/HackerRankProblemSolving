
package hackerrankproblemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HackerRankProblemSolving {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i<=10; i ++){
            System.out.println(N+ " x " +i + " = " + i*N);
        }
        

        bufferedReader.close();
        
    }
    
    
    
}
