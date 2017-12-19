public class Piece {
    boolean isWhite;
    int x;
    int y;

    Piece(int x, int y, boolean w){
        this.x = x;
        this.y = y;
        isWhite = w;

    }

    public boolean eatRight(){
        if(isWhite){
            if (y < 5 && x < 5){
                x++;
                y++;
                return true;
            }

            return false;
        }
        else{
            if (y > 0 && x > 0){
                x--;
                y--;
                return true;
            }

            return false;

        }
    }

    public boolean eatLeft(){
        if(isWhite){
            if (y < 5 && x > 0){
                x--;
                y++;
                return true;
            }

            return false;
        }
        else{
            if (y < 5 && x > 0){
                x--;
                y++;
                return true;
            }

            return false;

        }
    }

    public boolean moveAhead(){
        if(isWhite){
            if(y >= 0 && y < 5){
                y++;
                return true;
            }
            return false;
        }

        else{
            if(y > 0 && y <= 5){
                y--;
                return true;
            }
            return false;
        }
    }
}
