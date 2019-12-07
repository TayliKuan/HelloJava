package Intermediate;


public class MyPoint {
    int x;
    int y;
    int print;
    
    int getX() {
        return x;
    }

    void setX(int i) {
        x = i;
    }

    int getY() {
        return y;
    }

    void setY(int i) {
        y = i;
        
    }
    void print(){
        System.out.println("(x,y)@("+getX()+","+getY()+")");
        System.out.println("(x,y)@("+x+","+y+")");
    }
    
}
