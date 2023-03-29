/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodup;
import java.io.FileReader;
import java.io.*;
import java.util.*;

/**
 *
 * @author Hlsmith1
 */
public class NoDup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        FileReader file = new FileReader("E:\\DataStructures\\200IntsNoDups.txt");
        int[] integers = new int [200];
        int a=0;
        
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                integers[a] = input.nextInt();
                a++;
               
            }
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(integers));
            
}
    
    
}
