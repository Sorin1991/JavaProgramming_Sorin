package Sorin;


import java.util.Arrays;

public class Replit {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for(int i=1; i<=8; i++){
            int k=0;
            for(char j='a'; j<='h'; j++){
                chessBoard[i-1][k++]=""+i+j;
            }
        }
        //sorin



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }




    }




/*
Given a 8x8 two-dimensional array of strings named chessboard.
Initialize values inside an array accordingly to the chess board. So first element in the array,
 chessboard[0] should have a value "1a", and last element in the array, chessboard[7] should have a value "8h"
 */
