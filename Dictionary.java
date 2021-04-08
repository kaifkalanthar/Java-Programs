package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,String> EnglishToSpanish =new HashMap<>();
        EnglishToSpanish.put("Monday","Lunes");
        EnglishToSpanish.put("Tuesday","Martes");
        EnglishToSpanish.put("Wednesday","Miercoles");
        EnglishToSpanish.put("Thursday","Jueves");
        EnglishToSpanish.put("Friday","Viernes");

        System.out.println(EnglishToSpanish.get("Monday"));
        System.out.println(EnglishToSpanish.get("Tuesday"));
        System.out.println(EnglishToSpanish.get("Wednesday"));
        System.out.println(EnglishToSpanish.get("Thursday"));
        System.out.println(EnglishToSpanish.get("Friday"));

        //To print all Use .keySet()
        System.out.println(EnglishToSpanish.keySet());
        //TO print all values
        System.out.println(EnglishToSpanish.values());


        //Create a Food List

        Map <String,Boolean> FoodList =new HashMap<>();

        FoodList.put("Kebab",true);
        FoodList.put("Chicken Rice",false);
        FoodList.put("Shawarma",true);
        FoodList.put("Grill Chicken",false);
        FoodList.put("Burger",true);

        System.out.println(FoodList.isEmpty());

        System.out.println(FoodList.get("Kebab"));

        System.out.println(FoodList.replace("Grill Chicken",true));

        System.out.println(FoodList.toString());

        System.out.println(FoodList.remove("Grill Chicken"));

        System.out.println(FoodList.toString());

        FoodList.clear();

        System.out.println(FoodList.isEmpty());
    }
}

