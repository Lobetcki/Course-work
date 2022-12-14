public class Employee {
    //static int count; // Переменная счетчик
    private int id;         // Поля ДАННЫХ сотрудников
    private String fullName;
    private int department;
    private int salary;
    //private Employee[] wocker;  // Объявили массив Employee, реализуемый в классе Employee

    // КОНСТРУКТОР
    public Employee(String fullName, int department, int salary) {
        //this.wocker = new Employee[10]; // Создали базу данных на 10 мест

        this.id = Main.count++;         // Заполнение полей данных
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // ГЕТТЕРЫ
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public int getDepartment() { return department; }
    public int getSalary() { return salary; }
    // СЕТТЕРЫ
    public void setId(int id) { this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDepartment(int department) { this.department = department; }
    public void setSalary(int salary) { this.salary = salary; }

    // toString
    @Override
    public String toString() {
        return "Employee{" + "id = " + id + ", fullName = '" + fullName + '\'' +
                ", department = " + department + ", salary = " + salary + '}';
    }

//    // ВЫВОД ВСЕХ ДАННЫХ
//    public static void printAllEmployees(Employee wocker[]) {
//        for (int i = 0; i < wocker.length; i++) {
//            Employee employee = wocker[i];
//            System.out.println(employee);
//        }
//    }
//
//    // Зарплата всех сотрудников
//    public static int countingSumSalaru(Employee wocker[], int sumSalary) {
//        sumSalary = 0;
//        for (int i = 0; i < wocker.length; i++) {
//            if (wocker[i] != null) {
//                sumSalary += wocker[i].salary;
//            }
//        }
//        System.out.println("Зарплата всех сотрудников составит: " + sumSalary + " руб.");
//        return sumSalary;
//    }
//
//    // Средний оклад
//    public static void averageSalary(Employee wocker[]) {
//        int sumSalary = 0;
//        int average = countingSumSalaru(wocker, sumSalary) / count;
//        System.out.println("Средняя зарплата: " + average);
//    }
//
//
//    // Работник с МIN ЗП и с МAX ЗП
//    public static void findMinMaxSalary(Employee wocker[]) {
//        int minSalary = wocker[0].salary;
//        int maxSalary = wocker[0].salary;
//        for (int i = 0; i < wocker.length; i++) {
//            if (wocker[i] != null &&  minSalary > wocker[i].salary) {
//                minSalary = wocker[i].salary;
//            }
//            if (wocker[i] != null && maxSalary < wocker[i].salary) {
//                maxSalary = wocker[i].salary;
//            }
//        }
//        System.out.println("Самый МАЛЕНЬКИЙ оклад: " + minSalary + " руб.");
//        System.out.println("Самый БОЛЬШОЙ оклад: " + maxSalary + " руб.");
//    }
//
//    public static void printFullName(Employee wocker[]) {
//        for (int i = 0; i < wocker.length; i++) {
//            if (wocker[i] != null) {
//                System.out.println(wocker[i].fullName);
//            }
//        }
//    }






    //метод для Добавления работникав
//    public void addWocker(String fullName, int department, float salary) {
//        if (counter >= wocker.length) {
//            System.out.println("Нельзя добавить работника, закончилось место");
//        }
//        Employee newEmployee = new Employee(fullName, department, salary, counter);
//        wocker[counter++] = newEmployee;
//    }



}