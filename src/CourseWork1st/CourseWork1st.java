package CourseWork1st;

public class CourseWork1st {
//    Employee[] wocker = new Employee[10];
//
//    this.wocker = new Employee[10]; // Создали базу данных на 10 мест

    public static void main(String[] args) {
        Employee[] wocker = new Employee[10];

        // добавляем работников
        wocker[0] = new Employee("asd asdas asd", 2, 55000);
        wocker[1] = new Employee("Ник Ник Горбунков", 5, 60000);
        wocker[5] = new Employee("Ник Ник Николаев", 5, 50000);
        wocker[6] = new  Employee("Вова Вова Вовавич", 3, 60000);
        wocker[8] = new  Employee("Ваня Ваня Иванов", 2, 65000);
        wocker[9] = new  Employee("Иван Иванович Сидоров", 1, 55000);
        wocker[3] = new  Employee("Петя Петя Петров", 4, 35000);

       // Распечатываем ВСЕе ДАННЫЕ
        Employee.printAllEmployees(wocker);
        System.out.println();

        // ОБШАЯ ЗАРПЛАТА
        int sumSalary = 0;
        Employee.countingSumSalaru(wocker, sumSalary);
        System.out.println();

        // Работник с МIN ЗП и с МAX ЗП
        Employee.findMinMaxSalary(wocker);
        System.out.println();

        // СРЕДНЯЯ ЗП
        Employee.averageSalary(wocker);
        System.out.println();

        // ИМЕНА СОТРУДНИКОВ
        Employee.printFullName(wocker);







    }
}
