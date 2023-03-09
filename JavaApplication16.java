
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,ort,top=0,sayac=0;
        System.out.println("sayi:");
        sayi=input.nextInt();
        
        for(int i =0;i<=sayi;i++ ){
            if(i%3==0&&i%4==0){
                top+=i;
                sayac++;
            }
        }
        ort=top/sayac;
        System.out.println(sayi+"   sayisina kadar 3 ve 4e tam bolunen sayiların ortalamasi: "+ort);
        
    }
    
}
