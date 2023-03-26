package HomeWork_6;

public class Person {

    /*
     * Создать класс Person.
     * У класса должны быть поля:
     * 1. Имя (String)
     * 2. Фамилия (String)
     * 3. Возраст (продумать тип)
     * 4. Пол
     * 5*. Придумать свои собственные поля
     * 
     * Для этого класса
     * 1. Реализовать методы toString, equals и hashCode.
     * 2*. Придумать собственные методы и реализовать их
     * 
     * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
     * вывести их на экран.
     */

     String name;
     String surname;
     String age;
     String gender;
     String profession;
     String city;
 
     public Person(String SurName, String Name, String Age,
             String Gender, String Profession, String City) {
 
         this.surname = SurName;
         this.name = Name;
         this.age = Age;
         this.gender = Gender;
         this.profession = Profession;
         this.city = City;
     }
 

     public String toString() {
         return String.format("%s %s %s %s %s %s", surname, name, age, gender, profession, city);
     }
 
   
     public boolean equals(Object arg) {
         if (arg == null)
             return false;
         if (!(arg instanceof Person))
             return false;
         Person anotherPerson = (Person) arg;
         return surname.equals(anotherPerson.surname) && name.equals(anotherPerson.name)
                 && age.equals(anotherPerson.age) && gender.equals(anotherPerson.gender)
                 && profession.equals(anotherPerson.profession)
                 && city.equals(anotherPerson.city);
     }
 
     public int hashCode() {
         Object[] m = { name, surname, age, gender, profession, city };
         int res = 1;
         for (Object x : m) {
             res = 31 * res + x.hashCode();
         }
         return res;
     }
    
}
