package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part3 {
    public void p3(){
       String set ="English is simple language to learn";
        Pattern p=Pattern.compile("learn$");
        Matcher m =p.matcher(set);
        while (m.find()){
            System.out.println(m.group());
        }
        /*Pattern p1=Pattern.compile("^English");
        Matcher m1 =p.matcher(set);
        while (m1.find()){
            System.out.println(m1.group());
        }
        //^,$,[abc],[^abc],[0 - 9],||
         */
        Pattern p2=Pattern.compile("i || a");
        Matcher m2 =p.matcher(set);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
