/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimilarAction;

public class Bird implements jumpable{//每一個都要實做出來
    @Override//因為有override 不能static 互相違背 共用原本一份
    public void fly(){//一定要public 因為繼承來的不可以比上面嚴謹
        System.out.println("fly in bird");
    }
    public static void fly(int i){
    System.out.println("fly in bird");
    }
    
    
    @Override
    public void jump() {
        System.out.println("jump()");
    }
}
