package RP;

import java.util.HashMap;

public class StrAndChar {
     public  int  findTheRepV1(String s, char c){
         int sum=0;
         for (int i=0;i < s.length();i++){
             if (s.charAt(i)==c){
                 sum++;
             }
         }
         return sum;
     }

      public int [] findTheRepV2(String s,char []c){
         int sum[] =new int[c.length];
         for (int i =0;i<s.length();i++){
             for (int j =0;j<c.length;j++){
                 if (s.charAt(i)==c[j]){
                     sum[j]=sum[j]+1;
                 }
             }
         }
         return sum;
      }




}
