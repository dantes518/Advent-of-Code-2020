import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aoc2020_1_1 {
    public static void main(String []args) throws FileNotFoundException{
        ArrayList<Integer> inputNums = new ArrayList<>();
        File input = new File("input.txt");
        Scanner s = new Scanner(input);
        while(s.hasNextInt()){
            inputNums.add(s.nextInt());
        }
        
        int multi = 0;
        
        for(int i = 0; i < inputNums.size(); i++){
            for(int j = 1; j < inputNums.size(); j++){
                for(int k = 2; k < inputNums.size(); k++){
                    if(inputNums.get(i) + inputNums.get(j) + inputNums.get(k) == 2020){
                        multi = inputNums.get(i) * inputNums.get(j) * inputNums.get(k);
                    }
                }
            }
        }
        System.out.println("The answer is: " + multi);
    }
}
