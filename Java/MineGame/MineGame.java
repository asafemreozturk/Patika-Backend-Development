import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineGame {
    static void mineGame(int row,int col){
        String matrix[][]=new String[row][col];
        String board[][]=new String[row][col];
        Scanner sc=new Scanner(System.in);
        int sldx=0, sldy=0,count=0;

        for(int a=0;a<matrix.length;a++){
            for(int b=0;b<matrix[a].length;b++){
                matrix[a][b]=" - ";
                board[a][b]=" - ";
            }
        }

        int bombNumber = (int) ((row*col)/4), x = 0, y= 0, gameTurn = ((row*col) -bombNumber);

        for(;bombNumber>0;bombNumber--){
            x=(int)(Math.random()*row);
            y=(int)(Math.random()*col);
            if(matrix[x][y]!=" * ") matrix[x][y]=" * ";
            else bombNumber++;
        }

        //print info
        toString(matrix);
        toString(board);

        while(true){
            System.out.print("Please enter row index between 0-" + (row - 1) + " and enter column index between 0-" + (col - 1) + " : ");

            sldx=sc.nextInt();
            sldy=sc.nextInt();

            if(sldx<=row-1 && sldy<=col-1){

                if(matrix[sldx][sldy]==" * "){
                    System.out.println("========================================================================");
                    System.out.println("========================================================================");
                    System.out.println("                              GAME OVER                                 ");
                    System.out.println("========================================================================");
                    System.out.println("========================================================================");
                    break;
                } else if(board[sldx][sldy]==" - "){
                    if (sldx - 1 >= 0 && sldy - 1 >= 0) {
                        if (matrix[sldx - 1][sldy - 1] == " * ") count++;
                    }
                    if (sldy - 1 >= 0) {
                        if (matrix[sldx][sldy - 1] == " * ") count++;
                    }
                    if (sldx + 1 < row && sldy - 1 >= 0) {
                        if (matrix[sldx + 1][sldy - 1] == " * ") count++;
                    }
                    if (sldx - 1 >= 0) {
                        if (matrix[sldx - 1][sldy] == " * ") count++;
                    }
                    if (sldx + 1 < row) {
                        if (matrix[sldx + 1][sldy] == " * ") count++;
                    }
                    if (sldx - 1 >= 0 && sldy + 1 < col) {
                        if (matrix[sldx - 1][sldy + 1] == " * ") count++;
                    }
                    if (sldy + 1 < col) {
                        if (matrix[sldx][sldy + 1] == " * ") count++;
                    }
                    if (sldx + 1 < row && sldy + 1 < col) {
                        if (matrix[sldx + 1][sldy + 1] == " * ") count++;
                    }
                    board[sldx][sldy] = " " + count + " ";
                    count = 0;
                    gameTurn--;
                } else System.out.println("You have already try this cell. Make your choice again please.");

                toString(matrix);
                toString(board);
                if (gameTurn == 0) {
                    System.out.println("========================================================================");
                    System.out.println("========================================================================");
                    System.out.println("               Congratulations!!! You won the game.........             ");
                    System.out.println("========================================================================");
                    System.out.println("========================================================================");
                    break;
                }
            }
            else System.out.println("You entered a number out of bounds for length! Try Again");
        }

    }

    static void toString(String array[][]){

        for(String[] row:array){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("========================================================================");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mine Sweeper Game!");
        System.out.println("========================================================================");
        Scanner sc = new Scanner(System.in);
        int y=0, x=0;
        while (true) {
            System.out.print("Number of columns between 2 and 100 : ");
            y = sc.nextInt();
            System.out.print("Number of rows between 2 and 100 : ");
            x = sc.nextInt();
            if (x>1 && y>1 && x<101 && y<101) break;
            else System.out.println("Game board needs to be bigger than 1x1(at least 2x2) and smaller than 101x101(max 100x100)");
        }
        mineGame(x, y);

    }
}



