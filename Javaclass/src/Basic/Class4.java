package Basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
import java.lang.System;//可以不用打 已經內建了
import java.lang.Math;//但只有lang的才可以
//基本型態int 等等 都可以直接用
//import java.net.URL;
/*
//樂透號碼
public class Class4 {
    public static void main(String[] args) {
        
        //System.out.println("d = "+d);//0.0<=Math.random()<1
       // URL yahoo;
        for (int i = 1; i < 7; i++) {
            double d = Math.random()*42+1;
            //System.out.printf("樂透號碼="+ "%.0f", d);
            //int a=(int)d;
            //System.out.println("樂透號碼=" + a);
            int b=(int)(Math.random()*42+1);
            System.out.println("樂透號碼=" + b);
        }
        int[]data =new int[8];//會給int初始值 0 布林值給false
            data[0]=10;
            data[1]=10;
            
            System.out.println("data[0]="+data[0]);
            data[0]++;
            System.out.println("++,data[0]="+data[0]);
            System.out.println(data[5]);//沒給值印出0
            //data[6]=10;//編譯會過 但是要執行才會錯 runtime exception 陣列超出類別
            //error java.lang.ArrayIndexOutOfBoundsException: 6
            for (int j = 0; j < data.length; j++) {//這樣new改多少都沒關西 不限制6 收斂!
                //data[j]=(int)(Math.random()*42+1);
                //System.out.println("幸運數字="+data[j]);
            data[j]=j*10+10;//如果要印10,20,30,40,50,60
                System.out.println(data[j]);
            for (int a :data)
            {System.out.println(">>"+a);}//a都是從陣列元素 每一回合複製出來
        }
    }       
}//寫程式要自己好修改的 越難的越要思考 而不是先寫
            //發散要改成收斂 很省工 發散就是一直複製貼上 複製貼上會解決眼前的問題 但是會在後面造成更多問題
*///未解
/*
public class Class4 {
    public static void main(String[] args) {
        int[] data = new int[6];
        for (int i=0; i<data.length; i++) {
            int b = (int)(Math.random()*42+1);
            data[i] = b;
        }
        
      //排序 九九乘法的概念
        for (int i = 0; i < 6; i++) {
          for (int j = i+1; j < 6; j++) {
              if (data[i] > data[j]){
                int box;
                box = data[j];
                data[j] = data[i];
                data[i] = box;
              }
        }
           if(data[i]==data[i]){
           data[i]=Math.random()};
    }
        for (int a : data) {
            System.out.println(a);
            // System.out.println(data[i]);
        }
    }
}
        //不重複 號碼 如果重複就在亂數一次
//放在FUNCTION 呼叫看看
//未解
*/

public class Class4 {
    public static void main(String[] args) {
        
    //int [][]xyz=new int[2][];
   // xyz[0]=new int[3];
    //xyz[1]=new int[5];
    String river = "Mississippi";
        System.out.println("river.length()"+river.length());//印出Mississippi長度
        System.out.println(river.charAt(2));//字元第幾個字是甚麼 從0開始
        System.out.println(river.indexOf("M"));//索引位置 如果找不到 ex 輸入a 就傳-1 取出字串中你要的字
        System.out.println(river.lastIndexOf("s"));//右邊開始
        System.out.println(river.replace("s", "$"));//替代
        System.out.println(river.substring(2));//前面從2開始印
        System.out.println(river.substring(2, 5));//印出從2開始不包含5
        
////求一個名字 FRANK 要印出KNAEF
//java.util.Scanner sc = new java.util.Scanner(System.in);
//        System.out.println("請輸入英文姓名");
//        System.out.print("name=");
//        String name = sc.nextLine();
//        System.out.println(name.length());
//        //用長度先判斷 再來用CharAt 一個一個從後面開始接著印
//        //如果是@ 用indexod 找
//       
    }}//未解
