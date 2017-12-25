import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
                    b.board[k][l] = new Spot(false,true,l,k);
                }
                else if (k == 5){
                    b.board[k][l] = new Spot(false,false,l,k);
                }
                else{
                    b.board[k][l] = new Spot(true,false,l,k);
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

    public Spot control(String x ){
        return b.board[new Integer(x.split("-")[0])][new Integer(x.split("-")[1])];


    }

    public void moveAhead(Piece x){
        int s = 0;
        if(x.spot.isWhite){
            for(int i = 0; i < W.pieces.length;i++) {
                if (x == W.pieces[i])
                    s = i;

            }
            if(x.spot.y < 5 && x.canMoveAhead(b.board[x.spot.y+1][x.spot.x])){

                b.board[x.spot.y][x.spot.x].isAvaiable=true;
                b.board[x.spot.y][x.spot.x].isWhite=false;
                b.board[x.spot.y+1][x.spot.x].isWhite=true;
                b.board[x.spot.y+1][x.spot.x].isAvaiable=false;
                W.pieces[s].spot =  b.board[x.spot.y+1][x.spot.x];
                W.pieces[s].spot.isWhite=true;


            }
        }

        else{
            for(int i = 0; i < B.pieces.length;i++) {
                if (x == B.pieces[i])
                    s = i;

            }
            if(x.spot.y > 0 && x.canMoveAhead(b.board[x.spot.y-1][x.spot.x])){

                b.board[x.spot.y][x.spot.x].isAvaiable=true;
                b.board[x.spot.y][x.spot.x].isWhite=false;
                b.board[x.spot.y-1][x.spot.x].isWhite=false;

                b.board[x.spot.y-1][x.spot.x].isAvaiable=false;
                B.pieces[s].spot = b.board[x.spot.y-1][x.spot.x];
                B.pieces[s].spot.isWhite=false;

            }
        }
        isWin(x);
    }
    public boolean isWin(Piece x){
        if(x.spot.isWhite){
            if(x.spot.y == 5){
                System.out.println("White wins");
                return true;
            }
            return false;

        }
        else{
            if(x.spot.y == 0){
                System.out.println("Black wins");
                return true;
            }
            return false;
        }


    }
    public void eatLeft(Piece x){
        int s = 0;
        if(x.spot.isWhite){
            for(int i = 0; i < W.pieces.length;i++) {
                if (x == W.pieces[i])
                    s = i;

            }
            System.out.println(x.canEat(b.board[x.spot.y+1][x.spot.x-1]));
            if(x.spot.y < 5 && x.spot.x > 0 && x.canEat(b.board[x.spot.y+1][x.spot.x-1])){
                b.board[x.spot.y][x.spot.x].isAvaiable=true;
                b.board[x.spot.y][x.spot.x].isWhite=false;
                b.board[x.spot.y+1][x.spot.x-1].isWhite=true;
                b.board[x.spot.y+1][x.spot.x-1].isAvaiable=false;

                W.pieces[s].spot = b.board[x.spot.y+1][x.spot.x-1];
                W.pieces[s].spot.isWhite = true;
            }

        }

        else{
            for(int i = 0; i < B.pieces.length;i++) {
                if (x == B.pieces[i])
                    s = i;

            }

            if(x.spot.y > 0 && x.spot.x < 5 && x.canEat(b.board[x.spot.y-1][x.spot.x+1])){
                b.board[x.spot.y][x.spot.x].isAvaiable=true;
                b.board[x.spot.y][x.spot.x].isWhite=false;
                b.board[x.spot.y-1][x.spot.x+1].isWhite=false;
                b.board[x.spot.y-1][x.spot.x+1].isAvaiable=false;

                B.pieces[s].spot = b.board[x.spot.y-1][x.spot.x+1];
                B.pieces[s].spot.isWhite = true;
            }

        }
        isWin(x);

    }

    public void printBoard(){
        for(int k = 5;k >= 0; k--){
            System.out.println("  - - - - - - - - - - - - -");
            System.out.print(k+" ");
            for(int l = 0;l < 6; l++){

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
