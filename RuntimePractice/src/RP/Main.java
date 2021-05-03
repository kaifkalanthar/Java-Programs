package RP;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
         StrAndChar sc =new StrAndChar();

          long startTime =System.currentTimeMillis();
        System.out.println(sc.findTheRepV1("owyruggbkjcbaeuiytoiernvkni",'g'));
          long endTime =System.currentTimeMillis();
          long duration =endTime -startTime;
        System.out.println("Time "+duration+" Ms");

        char chars [] ={'d','e','o'};

        long StartTime =System.currentTimeMillis();
        System.out.println(sc.findTheRepV2("ehroyepoibnnnnoe8fwn oiw",chars));
        long EndTime =System.currentTimeMillis();
        long Duration =EndTime-StartTime;
        System.out.println("Duration "+Duration+" Ms");



    }
}
