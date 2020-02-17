package Appx.shape;


public class MyPoint {
    private int x;
    private int y;
    int print;
    private static int count=0;//一開始就存在在記憶體了 static 用private只能用別的找get一個count
    public static int getCount(){//開一個洞讓他存取count
    return count;
    }

//如果加了 void MyPoint 變成一般函式 印出變成(0:0)
//    MyPoint(int i,int j){//建構子 在NEW的時候就被呼叫 像是預設值 針對成員裡面的物件變數做初始化
//        //可以() 或是給使用著一開始就輸入他要的數字 (int i,int j)很方便
//        //參數區看狀況做調整
//        System.out.println("hello");
//        x = i;
//        y = j;
//        print();//都可以呼叫
//    }
    public MyPoint(int i){//先建構在改變
//        x=i;
//        y=i;
        this(i,i);//使用(int x, int y)用this 不可以用名字mypoint呼叫
        this.x=-11;//擺建構後的(基底) 後面可以 再度客製化
        System.out.println("in mypoint(int i)");
    }
    public MyPoint(){
        this(-1,-1);
        System.out.println("in mypoint()");
    }
    public MyPoint(int x,int y){// 因為彈性最大 所以()跟(int i)都用這個呼叫比較收斂
        //設定必經之路 客戶一定會改變 以後這裡就好 
        this.x = x;//沒有this 是0,0 用區域變數 成員變數字進不去
        this.y = y;
        System.out.println("in mypoint(int x,int y");
        //print();//都可以呼叫
        count++;//所以可以直接用
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
    
    public void print(){
        //System.out.print("(x,y)@("+getX()+","+getY()+")");//透過founction比較好 多一個控制
        System.out.println(toString());//成員變數XY 沒加this
         //也可以 他會去找成員變數
    }
    public String toString(){//包起來
    return "(x,y)@("+this.x+","+this.y+")";
    }
    
    @Override
    public boolean equals(Object obj){//核對字串內容
        if (this == obj) 
            return true;
            
        if (!(obj instanceof MyPoint)) 
                return false;
                
        MyPoint pp = (MyPoint)obj;
        if (this.getX()==pp.getX() && this.getY()==pp.getY()) 
            return true;
                    
        return false;
                
    }
                
    @Override
    public int hashCode(){//身分證
    new Object().hashCode();
    return new Integer(x).hashCode()+new Integer(y).hashCode();
    }
}
