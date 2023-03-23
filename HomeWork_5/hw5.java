package HomeWork_5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;

import javax.sound.sampled.AudioFormat.Encoding;
public class hw5 {
     /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String text = sc.nextLine();
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] splitText = text.split(" ");
        Map<Integer, Collection<String>> collText = new TreeMap<>();

        for (int i = 0; i < splitText.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : splitText) {
                if (splitText[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            collText.put(splitText[i].length(), lenText);
        }
        // System.out.println(collText);
        for (Collection<String> s : collText.values()) {
            System.out.println(s);
        }
    }
    
}
