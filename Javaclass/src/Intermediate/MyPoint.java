package Intermediate;


public class MyPoint {
    private int x;
    private int y;
    int print;
    
    //如果加了 void MyPoint 變成一般函式 印出變成(0:0)
//    MyPoint(int i,int j){//建構子 在NEW的時候就被呼叫 像是預設值 針對成員裡面的物件變數做初始化
//        //可以() 或是給使用著一開始就輸入他要的數字 (int i,int j)很方便
//        //參數區看狀況做調整
//        System.out.println("hello");
//        x = i;
//        y = j;
//        print();//都可以呼叫
//    }
    MyPoint(int i){
        x=i;
        y=i;
    }
    MyPoint(){
        System.out.println("ya");
    }
    MyPoint(int x,int y){
       
        this.x = x;//沒有this 是0,0 用區域變數 成員變數字進不去
        this.y = y;
        print();//都可以呼叫
    }
    int getX() {
        return this.x;
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
        //System.out.println("(x,y)@("+getX()+","+getY()+")");//透過founction比較好 多一個控制
        System.out.println("(x,y)@("+this.x+","+this.y+")");//成員變數XY 沒加this
         //也可以 他會去找成員變數
    }
    
}
