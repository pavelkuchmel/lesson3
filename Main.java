package com.company;
import java.util.Scanner;
/*
урок 05.06.2022 Кучмель П.В.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Boolean1.
        //Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        boolean res=a>0;
        System.out.println("Введенное число является положительным: "+res);
        */
        /*
---------------------------------------------------------------------------------------------------------------------
         */
        //Boolean2
        //Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        int a1=a%2;
        boolean res=a1!=0;
        System.out.println("Введенное число является нечетным: "+res);
        */
        /*
---------------------------------------------------------------------------------------------------------------------
         */
        //Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3».
        //Логическое И && - "Логическое умножение"
        //Логическое ИЛИ || - "Логическое сложение"
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        System.out.print("Введите число: ");
        int b=in.nextInt();
        boolean res=a>2 && b<=3;
        System.out.println(res);
        */
        //Boolean6. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean spnr=a<b&&b<c;
        System.out.println("Двойное неравенство А<B<C справедливо: "+spnr);
        */
        //Boolean7. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Число B находится между числами A и C».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean spnr=a<b&b<c;
        boolean spnro=c<b&b<a;
        boolean finsr=spnr^spnro;
        System.out.println("Число В находится медлу числами А и С: "+finsr);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //Boolean8. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Каждое из чисел A и B нечетное»
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1!=0;
        int b1=b%2;
        boolean srb=b1!=0;
        boolean ressr=sra&&srb;
        System.out.println("Верно ли, что каждое из введеных чисел нечетное: "+ressr);
        */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //Boolean9. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1!=0;
        int b1=b%2;
        boolean srb=b1!=0;
        boolean ressr=sra||srb;
        System.out.println("Верно ли, что хотя бы одно из введеных чисел нечетное: "+ressr);
        */
        /*
---------------------------------------------------------------------------------------------------------------------
         */
        //Boolean10. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1!=0;
        int b1=b%2;
        boolean srb=b1!=0;
        boolean ressr=sra^srb; //bolean res=(a%2!=0&&b%2==0)||(a%2==0&&b%2!=0)
        System.out.println("Ровно одно из введеных чисел нечетное: "+ressr);
         */
        //Boolean11. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».
        /*
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число В: ");
        int b = in.nextInt();
        int a1 = a % 2;
        boolean sra = a1 != 0;
        int b1 = b % 2;
        boolean srb = b1 != 0;
        boolean ressr = sra == srb;
        System.out.println("Числа А и В имеют одинаковую четность: " + ressr);
        //System.out.println("Числа А и В имеют одинаковую четность: "+((a%2)==(b%2)));
        */
        /*
--------------------------------------------------------------------------------------------------------------------
         */
        //Boolean12. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean res=a>0&&b>0&&c>0;
        System.out.println("Каждое из чисел А, В, С положительное: "+res);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean14◦
        //Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean pra=a>0;
        boolean prb=b>0;
        boolean prc=c>0;
        //boolean res=(a>0&&<0&&c<0)||()||()
        boolean prall=pra^prb^prc;
        System.out.println("Ровно одно из чисел положительное: "+prall);
        */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Boolean16. Дано целое положительное число.
        //Проверить истинность высказывания: «Данное число является четным двузначным».
        /*
        System.out.print("Введите целое число: ");
        int num=in.nextInt();
        boolean dz=(9<num)&(num<100);
        int chetn=num%2;
        boolean chet1=chetn==0;
        System.out.println("Данное число является четным двузначным: "+(dz&chet1));
        */
        //Boolean18. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        /*
        System.out.print("Введите целое число: ");
        int a=in.nextInt();
        System.out.print("Введите целое число: ");
        int b=in.nextInt();
        System.out.print("Введите целое число: ");
        int c=in.nextInt();
        boolean res=(a==b)|(b==c)|(a==c);
        System.out.println("Среди введенных чисел есть повторяющиеся: "+res);
         */
        /*
--------------------------------------------------------------------------------------------------------------------
         */
        //Boolean19. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».
        /*
        System.out.print("Введите целое число: ");
        int a=in.nextInt();
        System.out.print("Введите целое число: ");
        int b=in.nextInt();
        System.out.print("Введите целое число: ");
        int c=in.nextInt();
        int otrA=a*(-1);
        int otrB=b*(-1);
        int otrC=c*(-1);
        boolean srav=(a==otrB)|(b==otrC)|(a==otrC);
        System.out.println("Среди введенных чисел есть хотя бы одна пара взаимно противоположных: "+srav);
        */
        //Boolean20. Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».
        /*
        System.out.print("Введите целое трехзначное число: ");
        int num=in.nextInt();
        int sot=num/100;
        int des=num/10%10;
        int ed=num%10;
        //boolean sotIdes=sot!=des;
        //boolean desIed=des!=ed;
        //boolean sotdesIdesed=sotIdes&&desIed;
        //boolean sotIed=sot!=ed;
        //boolean sotdesidesedIsotied=sotdesIdesed&&sotIed;
        //System.out.println(sotdesidesedIsotied);
        boolean res=(sot!=des)&&(des!=ed)&&(sot!=ed);
        System.out.println(res);
        */
        /*
--------------------------------------------------------------------------------------------------------------------
         */
    }
}
