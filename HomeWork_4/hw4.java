package HomeWork_4;

import java.util.ArrayList;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        System.out.println("Введите строку и номер под которым хотите её сохранить через дефис (-): ");
        System.out.println("Для выхода введите: exit");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("-")[1]);
                func(text, listData);
            } catch (Exception e) {
                System.out.println("Ошибка, проверьте вводимые данные!");
                // break;
            }
        }
    }
    
    static void func(String text, ArrayList<String> listData) {
        String[] consData = text.split("-");
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
            for (int i = 0; i <= localSize; i++) {
                listData.add(null);
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } else {
                listData.set(num, consData[0]);
            }
    }
}
 

