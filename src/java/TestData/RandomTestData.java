/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Random;




public class RandomTestData {
    private static String[] fNames = {"aa", "bb", "cc", "dd", "ff"};
    private static String[] lNames = {"aa", "bb", "cc", "dd", "ff"};
    private static int[] numbers =  {1,2,3,4,5};
    
    public static String getData(int n, String s) {

        String[] properties = s.split(",");
        
        JsonArray jsonArr = new JsonArray();

        for (int i = 0; i < n; i++) {
            JsonObject jsonObj = new JsonObject();
            
            for (String prop : properties) {
                switch (prop) {
                    case "fName":
                        jsonObj.addProperty("fName", getRandomFirstName());
                        break; 
                    case "lName":
                        jsonObj.addProperty("lName", getRandomLastName());
                        break;
                }
            }
           jsonArr.add(jsonObj); 
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        return gson.toJson(jsonArr);
    }

    public static String getRandomFirstName() {
        Random r = new Random();
        return fNames[r.nextInt(fNames.length)];
    }

    public static String getRandomLastName() {
        Random r = new Random();
        return lNames[r.nextInt(lNames.length)];
    }
    
    public static int getRandomNumber() {
        Random r = new Random();
        return numbers[r.nextInt(numbers.length)];
    }
 
}
