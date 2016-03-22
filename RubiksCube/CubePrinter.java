import java.util.Scanner;

public class CubeTester extends Cube{
    public void printCube(Cube cube){
        char[][] uFace = cube.getFace(U);
        char[][] dFace = cube.getFace(D);
        char[][] rFace = cube.getFace(R);
        char[][] lFace = cube.getFace(L);
        char[][] fFace = cube.getFace(F);
        char[][] bFace = cube.getFace(B);
        System.out.print("   ");
        System.out.println(uFace[0][0] + uFace[0][1] + uFace[0][2]);
    }
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String cmd = "";
        Cube rubiksCube = new Cube();
        while(cmd != "-1"){
            printCube(rubiksCube);
        }
    }
}