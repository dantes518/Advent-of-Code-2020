import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class aoc2020_5_1 {
    public static void main(String[] args) throws FileNotFoundException{
        File input = new File("input.txt");
        Scanner s = new Scanner(input);
        int highestID = 0;
        int curID = 0;
        int higher = 127;
        int lower = 0;
        int row = 0;
        int col = 0;
        int[][] planeSeats = new int[128][8];
        int yourSeat = 0;
        boolean a = false;
        
        //seat ID = (Row * 8) + Column
        
        while(s.hasNextLine()){
            String boardingPass = "";
            boardingPass = s.nextLine();
            
            higher = 127;
            lower = 0;
            
            for(int i = 0; i < 7; i++){
                if(boardingPass.charAt(i) == 'F'){
                    higher = (higher + lower) / 2;
                }else{
                    lower = (higher + lower) / 2 + 1;
                }
            }
            row = lower;
            higher = 7;
            lower = 0;
            for(int i = 7; i < 10; i++){
                if(boardingPass.charAt(i) == 'L'){
                    higher = (higher + lower) / 2;
                }else{
                    lower = (higher + lower) / 2 + 1;
                }
            }
            col = higher;
            curID = (row * 8) + col;
            if(curID > highestID){
                highestID = curID;
            }
            planeSeats[row][col] = 1;
        }
        
        for(int i = 0; i < planeSeats.length; i++){
            for(int j = 0; j < planeSeats[0].length; j++){
                if(planeSeats[i][j] == 0){
                    if(j > 0){
                        if(planeSeats[i][j - 1] == 1){
                            yourSeat = (i * 8) + j;
                            System.out.println(yourSeat);
                            a = true;
                            break;
                        }
                    }else if(j < 7){
                        if(planeSeats[i][j + 1] == 1){
                            if(yourSeat == 0){
                                yourSeat = (i * 8) + j;
                            }
                        }
                    }
                }
            }
            if(a){
                break;
            }
        }
        
        System.out.println("Your seat ID is: " + yourSeat);
        
        System.out.println("The highest seat ID on a boarding pass is: " + highestID);
    }
}
