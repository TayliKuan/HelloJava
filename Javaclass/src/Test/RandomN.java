/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author 小官
 */
public class RandomN {

    public static void main(String[] args) {
//        int []array = new int[4];
//        HashSet<Integer> set = new HashSet();
//        for (int i = 0; i < 4; i++) {
//            int Num = (int) (Math.random() * 10);
//            set.add(new Integer(Num));
//            System.out.println(set);
        
        
        //https://codertw.com/%E7%A8%8B%E5%BC%8F%E8%AA%9E%E8%A8%80/457053/
//https://stackoverflow.com/questions/8115722/generating-unique-random-numbers-in-java/31656679
    }
    private static final Random RANDOM = new Random();

    public Set<Integer> pickRandom(int n, int k) {
        final Set<Integer> picked = new HashSet<>();
        while (picked.size() < 10) {
            picked.add(RANDOM.nextInt(10 + 1));
        }
        return picked;
    }
}
