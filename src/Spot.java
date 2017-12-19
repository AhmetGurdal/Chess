public class Spot{
    boolean isAvaiable;
    boolean isWhite;
    boolean isBlack;
    int x;
    int y;

    public Spot(boolean a, boolean w,boolean b, int x, int y){
        isAvaiable = a;
        isWhite = w;
        isBlack = b;
        this.x = x;
        this.y = y;
    }

}
