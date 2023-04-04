package OOP_HW_1;

import java.util.*;

public class Program {

    public static PrinterImple printer = new PrinterImple();
    public static boolean b;
    public static LinkedList<Person> family;

    public static void main(String[] args) {
        family = new LinkedList<>();
        b = true;
        Map<String, Command> dict_command = new HashMap<>();
        dict_command.put("1", new Command() {
            @Override
            public void runCommand() {
                Scanner sc = new Scanner(System.in);
                printer.print("Введите имя: ");
                String name = sc.nextLine();
                System.out.println("Введите возраст: ");
                Integer age = Integer.valueOf(sc.nextLine());
                printer.print("Введите статус члена семьи: ");
                String status = sc.next();
                status thisStatus1 = Person.setStatus(status);
                Person person = new Person(name, age, thisStatus1);
                family.add(person);
            }
        });
        dict_command.put("2", new Command() {
            @Override
            public void runCommand() {
                Scanner scanner = new Scanner(System.in);
                printer.print("Введите имя: ");
                String name = scanner.next();
                for (Person person : family
                ) {
                    if (Objects.equals(person.getName(), name)){
                        printer.print(person.toString());
                    }
                }
            }
        });
        dict_command.put("3", new Command() {
            @Override
            public void runCommand() {
                b = false;
            }
        });
        Scanner sc = new Scanner(System.in);
//        FamilyTree.relationship(family);


        System.out.println("Команды для работы со справочником : \n Добавление новой записи  - 1 \n Поиск по справочнику - 2 \n Выход - 3 ");

        while (b) {
            printer.print("Команда > ");
            String command = sc.next();
            if (dict_command.containsKey(command)) {
                dict_command.get(command).runCommand();
        }
            else {
                printer.print("Command error!!!");
            }
        }
    }
}