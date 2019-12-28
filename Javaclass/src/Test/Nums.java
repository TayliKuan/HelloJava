/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author 小官
 */
public class Nums {
    public static void main(String[] args) {
    int [] randomnumber = new int[4];  
    int [] array ={0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 10; i++) {
            int select = (int) (Math.random() * 10); //隨機產生0~9的亂數
            //隨機選出的位子不能等於i
            int swaptemp=0;
            if(select!=i){
                swaptemp=array[i];
                array[i]=array[select];
                array[select]=swaptemp;
            }
        }
        //洗牌好的前四個數字塞回我們要回傳的陣列
        for (int i = 0; i < randomnumber.length; i++) {
            randomnumber[i]=array[i];
        } 
        System.out.print(randomnumber[0]);
        System.out.print(randomnumber[1]);
        System.out.print(randomnumber[2]);
        System.out.print(randomnumber[3]);
    }
}
