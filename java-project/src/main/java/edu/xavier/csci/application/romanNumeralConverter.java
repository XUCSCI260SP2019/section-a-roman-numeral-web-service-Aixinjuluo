package edu.xavier.csci;
import java.util.Scanner;

public class RomanNumeralApplication {
    public static void main(String[] args){


        Scanner scanner = new Scanner (System.in);
        System.out.println("Encode choose 1 or Decode choose 2: ");
        int choose = scanner.nextInt();
        if (choose == 1){
            Scanner scanner2 = new Scanner (System.in);
            System.out.println("Enter a string of Roman Numeral: ");
            String str1;
            str1 = scanner2.nextLine();
            System.out.println(encode(str1));
            scanner2.close();
        }
        if (choose == 2){
            Scanner scanner3 = new Scanner (System.in);
            System.out.println("Enter a number which lower than 5000: ");
            int num1;
            num1 = scanner3.nextInt();
            System.out.println(decode(num1));
            scanner3.close();
        }
        scanner.close();
    }

public static String decode(int num1){
        int q;
        int w;
        int e;
        int r;
        int t;
        int y;
        int u;

        String S1;
        String S2;
        String S3;
        String S4;
        S1 = "";
        S2 = "";
        S3 = "";
        S4 = "";
        q = num1/1000;
        w = num1 - q*1000;
        e = w/100;
        t = w - e*100;
        y = t/10;
        u = t - y*10;
        r = u%10;

        if (q != 0){
        //String S1;
        for (int i =0; i <q; i++){
        S1 = S1 + "M";
        }
        }
        if (w != 0 && e != 0){
        //String S2;
        int i =e;
        if (i == 1 ){
        S2 = "C";
        }
        if (i == 2){
        S2 ="CC";
        }
        if  (i ==3){
        S2 ="CCC";
        }
        if (i == 4 ){
        S2 = "CD";
        }
        if (i == 4 ){
        S2 = "CD";
        }
        if (i == 5) {
        S2 = "D";
        }
        if (i == 6) {
        S2 = "DC";
        }
        if (i == 7 ){
        S2 = "DCC";
        }
        if (i == 8) {
        S2 = "DCCC";
        }
        if (i == 9) {
        S2 = "CM";
        }
        }
        if (t != 0 && y != 0 ) {
        //String S3;
        int f = y;
        if (f == 1) {
        S3 = "X";
        }
        if (f == 2) {
        S3 = "XX";
        }
        if (f == 3) {
        S3 = "XXX";
        }
        if (f == 4) {
        S3 = "XL";
        }
        if (f == 5 ){
        S3 = "L";
        }
        if (f == 6){
        S3 = "LX";
        }
        if (f == 7){
        S3 = "LXX";
        }
        if (f == 8){
        S3 = "LXXX";
        }
        if (f == 9){
        S3 = "XC";
        }

        }
        if (u != 0 && r != 0 ) {
        //String S4;
        int x =r;
        if (x == 1) {
        S4 = "I";
        }
        if (x == 2) {
        S4 = "II";
        }
        if (x == 3) {
        S4 = "III";
        }
        if (x == 4 ){
        S4 = "IV";
        }
        if (x == 5) {
        S4 = "V";
        }
        if (x == 6){
        S4 = "VI";
        }
        if (x == 7){
        S4 = "VII";
        }
        if (x == 8){
        S4 = "VIII";
        }
        if (x == 9){
        S4 = "IX";
        }

        }

        //System.out.println (S1+S2+S3+S4);
        return S1+S2+S3+S4;
        }

public static int encode(String str1){

        int num = 0;
        if(str1.contains("IV")){
        num = num + 4;
        str1 = str1.replace("IV", "");
        System.out.println(str1);
        }
        if(str1.contains("IX")){
        num = num + 9;
        str1 = str1.replace("IX", "");
        }
        if(str1.contains("XL")){
        num = num + 40;
        str1 = str1.replace("XL", "");
        }
        if(str1.contains("XC")){
        num = num + 90;
        str1 = str1.replace("XC", "");
        }
        if(str1.contains("CD")){
        num = num + 400;
        str1 = str1.replace("CD", "");
        }
        if(str1.contains("CM")){
        num = num + 900;
        str1 = str1.replace("CM", "");
        }
        //System.out.println(str1);
        int c1 =0;
        int c2 =0;
        int c3 =0;
        int c4 =0;
        int c5 =0;
        int c6 =0;
        int c7 =0;
        for (int i =0; i < str1.length(); i++){
        if (str1.charAt(i) == 'M'){
        c1 ++;
        }
        if (str1.charAt(i) == 'D'){
        c2 ++;
        }
        if (str1.charAt(i) == 'C'){
        c3 ++;
        }
        if (str1.charAt(i) == 'L'){
        c4 ++;
        }
        if (str1.charAt(i) == 'X'){
        c5 ++;
        }
        if (str1.charAt(i) == 'V'){
        c6 ++;
        }
        if (str1.charAt(i) == 'I'){
        c7 ++;
        }
        }
        num = num + c1*1000+ c2*500 + c3*100 + c4*50 +c5 *10 + c6*5 + c7*1;


        //System.out.println(num);

        return num;
        }
