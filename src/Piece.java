public class Piece {
    Spot spot;
    boolean isPieceAvaiable;
    Piece(Spot x){
        this.spot = x;
        isPieceAvaiable = true;

    }

    public boolean canEat(Spot x) {

        if (x.isWhite) {

            if (spot.y > 0 && spot.x < 5) {
                if (x.isAvaiable || (!x.isAvaiable && !x.isWhite)) {
                    return false;
                }
                return true;
            }

            return false;

        } else {

            if (spot.y < 5 && spot.x > 0) {

                if (x.isAvaiable || (!x.isAvaiable && x.isWhite)) {
                    return false;
                }
                return true;
            }

            return false;
        }


    }

    public boolean canMoveAhead(Spot x){


        if(spot.isWhite){
            if(spot.y >= 0 && spot.y < 5){
                if(x.isAvaiable){

                return true;}
           }
            return false;
        }


        else{
            if(spot.y > 0 && spot.y <= 5) {
                if(x.isAvaiable){

                return true;}
            }
            return false;
        }
    }

}
