/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

/**
 *
 * @author 小官
 */
public class Singleton {
    private Singleton(){//不給人家看這建構子內容
    //加上些付款機制 之類的在這
    }
    
    public static Singleton getInstance(){//用getInstance() 讓他開通到進去用
        int instanceCount = 0;//用一次就扣錢
        if(true){//輸入卡號 之類的 會員號碼進去使用
        instanceCount++;
        return new Singleton();//建一個新的來用
        }
        return null;
    }
}
