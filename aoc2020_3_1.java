import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class aoc2020_3_1 {
    public static void main(String[] args) throws FileNotFoundException{
        //# = tree, . = empty spot
        
        File input = new File("input.txt");
        Scanner s = new Scanner(input);
        ArrayList<String> geology = new ArrayList<>();
        int treesHit = 0;
        int location = 3;
        
        //part 2 variables
        int treesHitA = 0; //right 1, down 1
        int treesHitB = 0; //right 5, down 1
        int treesHitC = 0; //right 7, down 1
        int treesHitD = 0; //right 1, down 2
        
        int locationA = 1; //same as above
        int locationB = 5;
        int locationC = 7;
        int locationD = 1;
        
        while(s.hasNextLine()){
            geology.add(s.nextLine());
        }
       
       for(int i = 1; i < geology.size(); i++){
           if(geology.get(i).charAt(location) == '#'){
               treesHit++;
           }
           location += 3;
           if(location >= geology.get(0).length()){
               location -= geology.get(0).length();
           }
       }
       
       for(int i = 1; i < geology.size(); i++){
           if(geology.get(i).charAt(locationA) == '#'){
               treesHitA++;
           }
           locationA += 1;
           if(locationA >= geology.get(0).length()){
               locationA -= geology.get(0).length();
           }
       }
       
       for(int i = 1; i < geology.size(); i++){
           if(geology.get(i).charAt(locationB) == '#'){
               treesHitB++;
           }
           locationB += 5;
           if(locationB >= geology.get(0).length()){
               locationB -= geology.get(0).length();
           }
       }
       
       for(int i = 1; i < geology.size(); i++){
           if(geology.get(i).charAt(locationC) == '#'){
               treesHitC++;
           }
           locationC += 7;
           if(locationC >= geology.get(0).length()){
               locationC -= geology.get(0).length();
           }
       }
       
       for(int i = 1; i < geology.size(); i++){
           if(i % 2 == 0 && geology.get(i).charAt(locationD) == '#'){
               treesHitD++;
           }
           if(i % 2 == 0){
               locationD += 1;
           }
           if(locationD >= geology.get(0).length()){
               locationD -= geology.get(0).length();
           }
       }
       
       System.out.println("The number of hit trees is: " + treesHit);
       System.out.println("The amount of trees hit on each slope are: " + treesHitA + ", " + treesHit + ", " + treesHitB + ", " + treesHitC + ", " + treesHitD);
    }
}
