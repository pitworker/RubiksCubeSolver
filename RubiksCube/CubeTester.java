<<<<<<< HEAD
import java.util.Scanner;

public class CubeTester extends Cube{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String cmd = "";
        Cube rubiksCube = new Cube();
        while(!cmd.equals("-1")){
            if(cmd.equals("R"))
                rubiksCube.turn(R);
            else if(cmd.equals("R'"))
                rubiksCube.turn(RI);
            else if(cmd.equals("R2"))
                rubiksCube.turn(R2);
            else if(cmd.equals("L"))
                rubiksCube.turn(L);
            else if(cmd.equals("L'"))
                rubiksCube.turn(LI);
            else if(cmd.equals("L2"))
                rubiksCube.turn(L2);
            
            rubiksCube.printCube();
            cmd = in.nextLine();
        }
    }
=======
import java.util.Scanner;

public class CubeTester extends Cube{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String cmd = "";
        Cube rubiksCube = new Cube();
        while(!cmd.equals("-1")){
            if(cmd.equals("R"))
                rubiksCube.turn(R);
            else if(cmd.equals("R'"))
                rubiksCube.turn(RI);
            else if(cmd.equals("R2"))
                rubiksCube.turn(R2);
            else if(cmd.equals("L"))
                rubiksCube.turn(L);
            else if(cmd.equals("L'"))
                rubiksCube.turn(LI);
            else if(cmd.equals("L2"))
                rubiksCube.turn(L2);
            
            rubiksCube.printCube();
            cmd = in.nextLine();
        }
    }
>>>>>>> 729d667b9c00f41832c7957aea713b023124684d
}