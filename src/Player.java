
public class Player{

    Piece[] pieces = new Piece[6];
    Memory avaiableMoves;

    public Player(Spot[][] board, boolean x){
        if(x){
            for(int i = 0; i < 6; i++){
                for(int k = 0; k < 6; k++) {
                    pieces[i] = new Piece(board[0][k].x, board[0][k].y,true);
                }
            }

        }

        else{
            for(int i = 0; i < 6; i++){
                for(int k = 0; k < 6; k++) {
                    pieces[i] = new Piece(board[0][k].x, board[0][k].y,false);
                }
            }

        }
    }
}
