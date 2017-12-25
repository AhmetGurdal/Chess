
public class Player{

    Piece[] pieces = new Piece[6];
    Memory avaiableMoves;

    public Player(Spot[][] board, boolean x){
        if(x){
            for(int i = 0; i < 6; i++){
                pieces[i] = new Piece(board[0][i]);

            }

        }

        else{
            for(int i = 0; i < 6; i++){
                pieces[i] = new Piece(board[5][i]);
            }

        }
    }
}
