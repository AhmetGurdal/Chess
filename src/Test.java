public class Test {
    public static void main(String[] args) {
        Game newGame = new Game();

        System.out.println(newGame.moveAhead(newGame.W.pieces[3]));
        System.out.println(newGame.moveAhead(newGame.W.pieces[3]));
        System.out.println(newGame.moveAhead(newGame.W.pieces[3]));
        System.out.println(newGame.moveAhead(newGame.W.pieces[3]));
        System.out.println(newGame.eatLeft(newGame.W.pieces[3]));








        System.out.println("White   ---   Black");

        for(int i=0;i<=5;i++){

            System.out.print(newGame.W.pieces[i].spot.x + "-" + newGame.W.pieces[i].spot.y + "-" +  (newGame.W.pieces[i].isPieceAvaiable?"T":"F"));
            System.out.print("   ---   ");
            System.out.println(newGame.B.pieces[i].spot.x + "-" + newGame.B.pieces[i].spot.y + "-" +  (newGame.B.pieces[i].isPieceAvaiable?"T":"F"));
        }

        newGame.printBoard();



        newGame.moveAhead(newGame.W.pieces[3]);
    }
}
