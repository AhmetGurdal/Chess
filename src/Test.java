public class Test {
    public static void main(String[] args) {
        Game newGame = new Game();

        newGame.moveAhead(newGame.B.pieces[2]);
        newGame.moveAhead(newGame.B.pieces[2]);
        newGame.moveAhead(newGame.B.pieces[2]);
        newGame.moveAhead(newGame.B.pieces[2]);
        newGame.eatLeft(newGame.W.pieces[3]);
        newGame.moveAhead(newGame.W.pieces[3]);
        newGame.moveAhead(newGame.W.pieces[3]);
        newGame.moveAhead(newGame.W.pieces[3]);
        newGame.moveAhead(newGame.W.pieces[3]);








        for(int i=0;i<=5;i++){
            System.out.print(newGame.B.pieces[i].spot.x+"-");
            System.out.print(newGame.B.pieces[i].spot.y);
            System.out.println("-" +newGame.B.pieces[i].spot.isWhite);
        }

        newGame.printBoard();



        newGame.moveAhead(newGame.W.pieces[3]);
    }
}
