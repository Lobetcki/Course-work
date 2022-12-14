public class Main {

    private Employee[] employee;
    static int count = 0; // Переменная счетчик
    public void main() {
        this.employee = new Employee[10];    // Создали базу данных на 10 мест
    }

    // ВЫВОД ВСЕХ ДАННЫХ
    public static void printAllEmployees(Employee wocker[]) {
        for (int i = 0; i < wocker.length; i++) {
            Employee employee = wocker[i];
            System.out.println(employee);
        }
    }

    // Зарплата всех сотрудников
    public static int countingSumSalaru(Employee wocker[], int sumSalary) {
        sumSalary = 0;
        for (int i = 0; i < wocker.length; i++) {
            if (wocker[i] != null) {
                sumSalary += wocker[i].getSalary();
            }
        }
        System.out.println("Зарплата всех сотрудников составит: " + sumSalary + " руб.");
        return sumSalary;
    }

    // Средний оклад
    public static void averageSalary(Employee wocker[]) {
        int sumSalary = 0;
        int average = countingSumSalaru(wocker, sumSalary) / count;
        System.out.println("Средняя зарплата: " + average);
    }


    // Работник с МIN ЗП и с МAX ЗП
    public static void findMinMaxSalary(Employee wocker[]) {
        int minSalary = wocker[0].getSalary();
        int maxSalary = wocker[0].getSalary();
        for (int i = 0; i < wocker.length; i++) {
            if (wocker[i] != null &&  minSalary > wocker[i].getSalary()) {
                minSalary = wocker[i].getSalary();
            }
            if (wocker[i] != null && maxSalary < wocker[i].getSalary()) {
                maxSalary = wocker[i].getSalary();
            }
        }
        System.out.println("Самый МАЛЕНЬКИЙ оклад: " + minSalary + " руб.");
        System.out.println("Самый БОЛЬШОЙ оклад: " + maxSalary + " руб.");
    }

    public static void printFullName(Employee wocker[]) {
        for (int i = 0; i < wocker.length; i++) {
            if (wocker[i] != null) {
                System.out.println(wocker[i].getFullName());
            }
        }
    }



    public static void main(String[] args) {
        Employee wocker[] = new Employee[10];

        // добавляем работников
        wocker[0] = new Employee("asd asdas asd", 2, 55000);
        wocker[1] = new Employee("Ник Ник Горбунков", 5, 60000);
        wocker[5] = new Employee("Ник Ник Николаев", 5, 50000);
        wocker[6] = new Employee("Вова Вова Вовавич", 3, 60000);
        wocker[8] = new Employee("Ваня Ваня Иванов", 2, 65000);
        wocker[9] = new Employee("Иван Иванович Сидоров", 1, 55000);
        wocker[3] = new Employee("Петя Петя Петров", 4, 35000);

       // Распечатываем ВСЕе ДАННЫЕ
        printAllEmployees(wocker);
        System.out.println();

        // ОБШАЯ ЗАРПЛАТА
        int sumSalary = 0;
        countingSumSalaru(wocker, sumSalary);
        System.out.println();

        // Работник с МIN ЗП и с МAX ЗП
        findMinMaxSalary(wocker);
        System.out.println();

        // СРЕДНЯЯ ЗП
        averageSalary(wocker);
        System.out.println();

        // ИМЕНА СОТРУДНИКОВ
        printFullName(wocker);







    }
}
