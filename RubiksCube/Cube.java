<<<<<<< HEAD
public class Cube
{
    public static final byte R = 1;
    public static final byte RI = -1;
    public static final byte R2 = 12;

    public static final byte L = 2;
    public static final byte LI = -2;
    public static final byte L2 = 22;

    public static final byte U = 3;
    public static final byte UI = -3;
    public static final byte U2 = 32;

    public static final byte D = 4;
    public static final byte DI = -4;
    public static final byte D2 = 42;

    public static final byte F = 5;
    public static final byte FI = -5;
    public static final byte F2 = 52;

    public static final byte B = 6;
    public static final byte BI = -6;
    public static final byte B2 = 62;

    private char[][] uFace = new char[3][3];
    private char[][] dFace = new char[3][3];
    private char[][] rFace = new char[3][3];
    private char[][] lFace = new char[3][3];
    private char[][] fFace = new char[3][3];
    private char[][] bFace = new char[3][3];
    
    
    public Cube(){
        for(byte row = 0; row < 3; row++){
            for(byte col = 0; col < 3; col++){
                uFace[row][col] = 'w';
                dFace[row][col] = 'y';
                rFace[row][col] = 'r';
                lFace[row][col] = 'o';
                fFace[row][col] = 'g';
                bFace[row][col] = 'b';
            } 
        }
    }

    public void turn(byte dir){
        char[][] newFace = new char[3][3];
        char[][] newLayer = new char[3][4];

        if(dir == R){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                uFace[row][2] = newLayer[row][0];
                bFace[row][0] = newLayer[row][1];
                dFace[row][2] = newLayer[row][2];
                fFace[row][2] = newLayer[row][3];
            }
        }
        else if(dir == RI){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                dFace[row][2] = newLayer[row][0];
                fFace[row][2] = newLayer[row][1];
                uFace[row][2] = newLayer[row][2];
                bFace[row][0] = newLayer[row][3];
            }
        }
        else if(dir == R2){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                bFace[row][0] = newLayer[row][0];
                dFace[row][2] = newLayer[row][1];
                fFace[row][2] = newLayer[row][2];
                uFace[row][2] = newLayer[row][3];
            }
        }

        else if(dir == L){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = lFace[col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][0];
                newLayer[row][1] = uFace[row][0];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][0];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    lFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                dFace[row][0] = newLayer[row][0];
                fFace[row][0] = newLayer[row][1];
                uFace[row][0] = newLayer[row][2];
                bFace[row][2] = newLayer[row][3];
            }
        }
        else if(dir == LI){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = lFace[2 - col][row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][0];
                newLayer[row][1] = uFace[row][0];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][0];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    lFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                uFace[row][0] = newLayer[row][0];
                bFace[row][2] = newLayer[row][1];
                dFace[row][0] = newLayer[row][2];
                fFace[row][0] = newLayer[row][3];
            }
        }
        else if(dir == L2){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = lFace[2 - col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][0];
                newLayer[row][1] = uFace[row][0];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][0];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    lFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                bFace[row][2] = newLayer[row][0];
                dFace[row][0] = newLayer[row][1];
                fFace[row][0] = newLayer[row][2];
                uFace[row][0] = newLayer[row][3];
            }
        }
    }
    
    public char[][] getFace(byte face){
        char[][] returnFace = new char[3][3];
        if(face == R)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = rFace[row][col];
        else if(face == L)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = lFace[row][col];
        else if(face == U)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = uFace[row][col];
        else if(face == D)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = dFace[row][col];
        else if(face == F)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = fFace[row][col];
        else if(face == B)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = bFace[row][col];
        else
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = 'x';
        return returnFace;
    }

    public void printCube(){
        for(byte i = 0; i < 3; i++)
            System.out.println("    " + uFace[i][0] + uFace[i][1] + uFace[i][2]);

        System.out.println();
        
        for(byte i = 0; i < 3; i++){
            System.out.print("" + lFace[i][0] + lFace[i][1] + lFace[i][2]);
            System.out.print(" " + fFace[i][0] + fFace[i][1] + fFace[i][2]);
            System.out.print(" " + rFace[i][0] + rFace[i][1] + rFace[i][2]);
            System.out.println(" " + bFace[i][0] + bFace[i][1] + bFace[i][2]);
        }

        System.out.println();

        for(byte i = 0; i < 3; i++)
            System.out.println("    " + dFace[i][0] + dFace[i][1] + dFace[i][2]);
    }
=======
public class Cube
{
    public static final byte R = 1;
    public static final byte RI = -1;
    public static final byte R2 = 12;

    public static final byte L = 2;
    public static final byte LI = -2;
    public static final byte L2 = 22;

    public static final byte U = 3;
    public static final byte UI = -3;
    public static final byte U2 = 32;

    public static final byte D = 4;
    public static final byte DI = -4;
    public static final byte D2 = 42;

    public static final byte F = 5;
    public static final byte FI = -5;
    public static final byte F2 = 52;

    public static final byte B = 6;
    public static final byte BI = -6;
    public static final byte B2 = 62;

    private char[][] uFace = new char[3][3];
    private char[][] dFace = new char[3][3];
    private char[][] rFace = new char[3][3];
    private char[][] lFace = new char[3][3];
    private char[][] fFace = new char[3][3];
    private char[][] bFace = new char[3][3];
    
    
    public Cube(){
        for(byte row = 0; row < 3; row++){
            for(byte col = 0; col < 3; col++){
                uFace[row][col] = 'w';
                dFace[row][col] = 'y';
                rFace[row][col] = 'r';
                lFace[row][col] = 'o';
                fFace[row][col] = 'g';
                bFace[row][col] = 'b';
            } 
        }
    }

    public void turn(byte dir){
        char[][] newFace = new char[3][3];
        char[][] newLayer = new char[3][4];

        if(dir == R){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                uFace[row][2] = newLayer[row][0];
                bFace[row][0] = newLayer[row][1];
                dFace[row][2] = newLayer[row][2];
                fFace[row][2] = newLayer[row][3];
            }
        }
        else if(dir == RI){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                dFace[row][2] = newLayer[row][0];
                fFace[row][2] = newLayer[row][1];
                uFace[row][2] = newLayer[row][2];
                bFace[row][0] = newLayer[row][3];
            }
        }
        else if(dir == R2){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][0];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                bFace[row][0] = newLayer[row][0];
                dFace[row][2] = newLayer[row][1];
                fFace[row][2] = newLayer[row][2];
                uFace[row][2] = newLayer[row][3];
            }
        }

        else if(dir == L){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                uFace[row][2] = newLayer[row][0];
                bFace[row][2] = newLayer[row][1];
                dFace[row][2] = newLayer[row][2];
                fFace[row][2] = newLayer[row][3];
            }
        }
        else if(dir == LI){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                dFace[row][2] = newLayer[row][0];
                fFace[row][2] = newLayer[row][1];
                uFace[row][2] = newLayer[row][2];
                bFace[row][2] = newLayer[row][3];
            }
        }
        else if(dir == L2){
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    newFace[row][col] = rFace[2 - col][2 - row];
                }
            }

            for(byte row = 0; row < 3; row++){
                newLayer[row][0] = fFace[row][2];
                newLayer[row][1] = uFace[row][2];
                newLayer[row][2] = bFace[row][2];
                newLayer[row][3] = dFace[row][2];
            }
            
            for(byte row = 0; row < 3; row++){
                for(byte col = 0; col < 3; col++){
                    rFace[row][col] = newFace[row][col];
                }
            }

            for(byte row = 0; row < 3; row++){
                bFace[row][2] = newLayer[row][0];
                dFace[row][2] = newLayer[row][1];
                fFace[row][2] = newLayer[row][2];
                uFace[row][2] = newLayer[row][3];
            }
        }
    }
    
    public char[][] getFace(byte face){
        char[][] returnFace = new char[3][3];
        if(face == R)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = rFace[row][col];
        else if(face == L)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = lFace[row][col];
        else if(face == U)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = uFace[row][col];
        else if(face == D)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = dFace[row][col];
        else if(face == F)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = fFace[row][col];
        else if(face == B)
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = bFace[row][col];
        else
            for(byte row = 0; row < 3; row++)
                for(byte col = 0; col < 3; col++)
                    returnFace[row][col] = 'x';
        return returnFace;
    }

    public void printCube(){
        for(byte i = 0; i < 3; i++)
            System.out.println("    " + uFace[i][0] + uFace[i][1] + uFace[i][2]);

        System.out.println();
        
        for(byte i = 0; i < 3; i++){
            System.out.print("" + lFace[i][0] + lFace[i][1] + lFace[i][2]);
            System.out.print(" " + fFace[i][0] + fFace[i][1] + fFace[i][2]);
            System.out.print(" " + rFace[i][0] + rFace[i][1] + rFace[i][2]);
            System.out.println(" " + bFace[i][0] + bFace[i][1] + bFace[i][2]);
        }

        System.out.println();

        for(byte i = 0; i < 3; i++)
            System.out.println("    " + dFace[i][0] + dFace[i][1] + dFace[i][2]);
    }
>>>>>>> 729d667b9c00f41832c7957aea713b023124684d
}