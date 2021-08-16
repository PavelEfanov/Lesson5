import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ефанов Павел", "Дежурный системный инженер", "efanovpavel@gmail.com", "89030028400", 120000, 24);
        emplArray[1] = new Employee("Иванов Иван", "Консультант", "ivanovivan@gmail.com", "88005553535", 10000, 34);
        emplArray[2] = new Employee("Петров Петьр", "Сантехник", "-", "+79165341820", 60000, 52);
        emplArray[3] = new Employee("Тепфер Алла", "Инженер 2к", "TepherAlla@yant.ru", "+79165346780", 10000, 114);
        emplArray[4] = new Employee("Каннуников Илья", "Начальничек", "kanunjerk@cius.ees.ru", "+75341234521", -30000, 42);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                emplArray[i].printEmpl();
            }
        }
    }
}
