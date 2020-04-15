/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author OS
 */
public class MyToys {
    //class này chứa các hàm tiện ích dùng chung cho mọi dự án, nơi nó sẽ
    //nó sẽ là static
    //cf: là compute Factorial, tính n giai thừa
    //trong đó n >= 0, 0! = 1 
    public static long cF(int n) {
        if (n < 0 ||  n > 15)
            throw new IllegalArgumentException("n must be between 0...15");
        if (n == 0)
            return 1;
        long product = 1; // biến nhân dồn , gom, tích lũy, accummulation
        for (int i = 1; i < 10; i++) {
            product *= i;
        }
           return product; 
    }
}



