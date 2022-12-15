public class Main {
    private static final Employee[] employees = new Employee[10];

    // ВЫВОД ВСЕХ ДАННЫХ
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Зарплата всех сотрудников
    public static int countingSumSalaru() {
        int sumSalary = 0;
        for (Employee value : employees) {
            if (value != null) {
                sumSalary += value.getSalary();
            }
        }
        return sumSalary;
    }

    // Средний оклад
    public static int calculationAverageSalary() {
        //int sumSalary = 0;
        int average = countingSumSalaru();
        System.out.println("Зарплата всех сотрудников составит: " + average + " руб.");
        average = average / Employee.count;

        return average;
    }

    // Работник с МIN ЗП
    public static Employee findMinSalary() {
        int minSalary = employees[0].getSalary();
        Employee minSalaryWocker = null;
        for (Employee value : employees) {
            if ((value != null) && (minSalary > value.getSalary())) {
                minSalary = value.getSalary();
                minSalaryWocker = value;
            }
        }
        return minSalaryWocker;
    }

    // Работник с МAX ЗП
    public static Employee findMaxSalary() {
        int maxSalary = employees[0].getSalary();
        Employee maxSalaryWocker = null;
        for (Employee value : employees) {
            if (value != null && maxSalary < value.getSalary()) {
                maxSalary = value.getSalary();
                maxSalaryWocker = value;
            }
        }
        return maxSalaryWocker;
    }

    // ИМЕНА СОТРУДНИКОВ
    public static void printFullName() {
        for (Employee value : employees) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }


    public static void main(String[] args) {

        // добавляем работников
        employees[0] = new Employee("asd asdas asd", 2, 55000);
        employees[1] = new Employee("Ник Ник Горбунков", 5, 60000);
        employees[5] = new Employee("Ник Ник Николаев", 5, 50000);
        employees[6] = new Employee("Вова Вова Вовавич", 3, 60000);
        employees[9] = new Employee("Иван Иванович Сидоров", 1, 55000);
        employees[3] = new Employee("Петя Петя Петров", 4, 35000);
        employees[2] = new Employee("Саня Саня Петров", 5, 30000);

        // Распечатываем ВСЕе ДАННЫЕ
        printAllEmployees();
        System.out.println(employees);

        // ОБШАЯ ЗАРПЛАТА
        countingSumSalaru();
        System.out.println();

        // Работник с МIN ЗП
        Employee minSalary = findMinSalary();
        System.out.println("Самый МАЛЕНЬКИЙ оклад у " + minSalary);
        System.out.println();

        // Работник с МAX ЗП
        Employee maxSalary = findMaxSalary();
        System.out.println("Самый БОЛЬШОЙ оклад у " + maxSalary);
        System.out.println();


        // СРЕДНЯЯ ЗП
        int averageSalary = calculationAverageSalary();
        System.out.println("Средняя зарплата: " + averageSalary);
        System.out.println();

        // ИМЕНА СОТРУДНИКОВ
        printFullName();
        System.out.println();

    }
}
//        // ИНДЕКСАЦИЯ ЗП
//        int percent = 10;
//        indexingSalary(wocker, percent);
//        System.out.println();
//
//        // параметр № отдела: Сотрудник с МИН ЗП
//        int department = 5;
//        findDepartmtMinSalary(wocker, department);
//        System.out.println();
//
//        // параметр № отдела: Сотрудник с МАКС ЗП
//        findDepartmtMaxSalary(wocker, department);
//        System.out.println();
//
//        // Зарплата всех сотрудников ОТДЕЛА
//        countingDepartmSalaru(wocker, department);
//        System.out.println();
//
//        // Средний оклад в ОТДЕЛЕ
//        calculationDepartAverageSalary(wocker, department);
//        System.out.println();
//
//        // ИЗМЕНЕНИЕ ЗП в ОТДЕЛЕ на %
//        int procent = 15;
//        indexingeDepartSalary(wocker, department, procent);
//        System.out.println();
//
//        // ИМЕНА СОТРУДНИКОВ ОТДЕЛА
//        printDepartrEmployee(wocker, department);
//        System.out.println();
//
//        // Сотрудники с зарплатой выше или ниже X
//        int x = 63250;
//        findMoreLess(wocker, x);






//    // ИЗМЕНЕНИЕ ЗП на %
//    public static void indexingSalary(Employee[] wocker, int percent) {
//       for (Employee value : wocker) {
//            if (value != null) {
//                value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
//                System.out.println("Измененная ЗП на " + percent + "% - " + value.getSalary());
//            }
//        }
//    }
//
//    // параметр № отдела: Сотрудник с МИН ЗП
//    public static void findDepartmtMinSalary(Employee[] wocker, int department) {
//        int min = wocker[0].getSalary();
//        Employee minim = null;
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department && min > value.getSalary()) {
//                min = value.getSalary();
//                minim = value;
//            }
//        }
//        System.out.println("Минимальный оклад в отделе №" + department + " у:");
//        System.out.println(minim);
//    }
//
//    // параметр № отдела: Сотрудник с МАКС ЗП
//    public static void findDepartmtMaxSalary(Employee[] wocker, int department) {
//        int max = wocker[0].getSalary();
//        Employee maxim = null;
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department && max < value.getSalary()) {
//                max = value.getSalary();
//                maxim = value;
//            }
//        }
//        System.out.println("Максимальный оклад в отделе №" + department + " у:");
//        System.out.println(maxim);
//    }
//
//    // Зарплата всех сотрудников ОТДЕЛА
//    public static int countingDepartmSalaru(Employee[] wocker, int department) {
//        int departmentSum = 0;
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department) {
//                departmentSum += value.getSalary();
//            }
//        }
//        return departmentSum;
//    }
//
//    // Средний оклад в ОТДЕЛЕ
//    public static void calculationDepartAverageSalary(Employee[] wocker, int department) {
//        int counter = 0;
//        int average = countingDepartmSalaru(wocker, department);
//        System.out.println("Зарплата отдела № " + department + " составит: " + average + " руб.");
//
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department) {
//               counter++;
//            }
//        }
//        System.out.println("Средняя зарплата отдела №: " + department + " - " + average/counter + " руб.");
//    }
//
//    // ИЗМЕНЕНИЕ ЗП в ОТДЕЛЕ на %
//    public static void indexingeDepartSalary(Employee[] wocker, int department, int percent) {
//        //newSalary = 0;
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department) {
//                value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
//                System.out.println("Измененная ЗП на " + percent + "% в отделе № " + department + ": " + value.getSalary());
//            }
//        }
//    }
//
//    // ИМЕНА СОТРУДНИКОВ ОТДЕЛА
//    public static void printDepartrEmployee(Employee[] wocker, int department) {
//        for (Employee value : wocker) {
//            if (value != null && value.getDepartment() == department) {
//                System.out.println("Сотрудник отдела: id = " + value.getId() + ", "  + value.getFullName() + ", " + value.getSalary());
//            }
//        }
//    }
//
//    // Сотрудники с зарплатой выше или ниже X
//    public static void findMoreLess(Employee[] wocker, int x) {
//        for (Employee value : wocker) {
//            if (value != null && value.getSalary() < x) {
//                System.out.println("Работник с ЗП меньше " + x + " - id " + value.getId() + ", " + value.getFullName() + ", " + value.getSalary() + " руб.");
//            }
//        }
//        System.out.println();
//        for (Employee value : wocker) {
//            if (value != null && value.getSalary() >= x) {
//                System.out.println("Работник с ЗП больше " + x + " - id " + value.getId() + ", " + value.getFullName() + ", " + value.getSalary() + " руб." );
//            }
//        }
//    }