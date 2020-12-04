import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class aoc2020_2_1 {
    public static void main(String[] args) throws FileNotFoundException{
        File input = new File("input.txt");
        Scanner s = new Scanner(input);
        int valid = 0;
        String[] curPassword = new String[3];
        String[] curRange = new String[2];
        char curCharacter = 'a';
        int[] range = new int[2];
        int count = 0;
        
        while(s.hasNextLine()){
            curPassword = s.nextLine().split(" ", 3);
            curRange = curPassword[0].split("-", 2);
            range[0] = Integer.parseInt(curRange[0]);
            range[1] = Integer.parseInt(curRange[1]);
            curCharacter = curPassword[1].charAt(0);
            for(int i = 0; i < curPassword[2].length(); i++){
                if(curPassword[2].charAt(i) == curCharacter){
                    count++;
                }
            }
            if(count >= range[0] && count <= range[1]){
                valid++;
            }
            count = 0;
        }
        
        System.out.println("The number of valid passwords is: " + valid);
    }
}
