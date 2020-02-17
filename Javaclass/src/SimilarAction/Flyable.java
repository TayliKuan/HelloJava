/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimilarAction;
//static 記憶體先後順序亦一早就存在 跟共用一份 所以這邊不行 static 這個特性不會被繼承 在這裡不能用this 也不會被子類別複製用下去
public interface Flyable {//為了讓後面的人要可以用 都會偷加public
    int i=10;
    //public static final int i =10;
    void fly();
    //public abstract void fly();
    
}
interface jumpable extends Flyable{//可以繼承多個interface
void jump();
}