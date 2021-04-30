package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part2 {
    void p2(){
        String set ="The REPEATED statement is used to specify the matrix in the mixed model." +
                " Its syntax is different from " +
                "that of the REPEATED statement in PROC GLM. " +
                "If no REPEATED statement is specified, is assumed to be equal to .";
        Pattern pattern =Pattern.compile("to");
        Matcher matcher =pattern.matcher(set);

        while ( matcher.find()){
            System.out.println(matcher.group());
        }


        //to count the word
        int count =0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
