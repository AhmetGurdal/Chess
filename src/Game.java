import java.util.Scanner;

public class Game {
    Board b;
    Player W;
    Player B;
    boolean isWhiteTurn = true;


    public Game(){
        b = new Board();
        for(int k = 0; k < 6; k++){
            for(int l = 0; l < 6; l++){
                if(k == 0){
                    b.board[k][l] = new Spot(false,true,false,l,k);
                }
                else if (k == 5){
                    b.board[k][l] = new Spot(false,false,true,l,k);
                }
                else{
                    b.board[k][l] = new Spot(true,false,false,l,k);
                }

            }
        }

        W = new Player(b.board,true);
        B = new Player(b.board, false);
    }

    public void play(){
        if(isWhiteTurn){
            System.out.println(W.avaiableMoves);
        }
        else{
            System.out.println(B.avaiableMoves);
        }
    }

    public void makeMove(String x ){
        int k = (int)x.charAt(0)-65;
        int l = new Integer(x.split("-")[1]);


    }

    public void printBoard(){
        for(int k = 5;k >= 0; k--){
            System.out.println("  - - - - - - - - - - - - -");
            System.out.print(k+" ");
            for(int l = 5;l >= 0; l--){

                if(!b.board[k][l].isAvaiable){
                    if(b.board[k][l].isWhite){
                        System.out.print("| W ");
                    }
                    else{
                        System.out.print("| B ");
                    }
                }
                else{
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  - - - - - - - - - - - - -");
        System.out.println("    A   B   C   D   E   F");
    }
}
