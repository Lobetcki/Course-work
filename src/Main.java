import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

       Employee[] employees = new Employee[10];

        // Переменная класса EmployeeBook
       EmployeeBook employeeBook = new EmployeeBook(employees);
       // добавляем работников
        employees[0] = new Employee("Ник Ник Горбунков", 5, 60000);
        employees[1] = new Employee("asd asdas asd", 2, 65000);
        employees[5] = new Employee("Ник Ник Николаев", 5, 30000);
        employees[6] = new Employee("Вова Вова Вовавич", 3, 70000);
        employees[9] = new Employee("Иван Иванович Сидоров", 1, 35000);
        employees[3] = new Employee("Петя Петя Петров", 4, 65000);
        employees[2] = new Employee("Саня Саня Петров", 5, 45000);


     // Распечатываем ВСЕ ДАННЫЕ
        employeeBook.printAllEmployees();
        System.out.println();

        // причесали массив
        employeeBook.arrClean();
        System.out.println();

        // ОБШАЯ ЗАРПЛАТА
        employeeBook.countingSumSalaru();
        System.out.println();

        // Работник с МIN ЗП
        Employee minSalary = employeeBook.findMinSalary();
        System.out.println("Самый МАЛЕНЬКИЙ оклад у " + minSalary);
        System.out.println();

        // Работник с МAX ЗП
        Employee maxSalary = employeeBook.findMaxSalary();
        System.out.println("Самый БОЛЬШОЙ оклад у " + maxSalary);
        System.out.println();


        // СРЕДНЯЯ ЗП
        System.out.println("Зарплата всех сотрудников составит: " + employeeBook.countingSumSalaru() + " руб.");
        System.out.println("Средняя зарплата: " + employeeBook.calculationAverageSalary() + " руб.");
        System.out.println();

        // ИМЕНА СОТРУДНИКОВ
        employeeBook.printFullName();
        System.out.println();

         // ПОВЫШЕННАЯ СЛОЖНОСТЬ
        System.out.println();
        System.out.println("2я сложность");
        System.out.println();

        // ИНДЕКСАЦИЯ ЗП
        int percent = 1;
        employeeBook.indexingSalary(percent);
        System.out.println();

      int department = 5;
      employeeBook.department(department);


     // параметр № отдела: Сотрудник с МИН ЗП
        employeeBook.findDepartmtMinSalary(department);
        System.out.println();

        // параметр № отдела: Сотрудник с МАКС ЗП
        employeeBook.findDepartmtMaxSalary(department);
        System.out.println();

        // Зарплата всех сотрудников ОТДЕЛА
        employeeBook.countingDepartmSalaru(department);
        System.out.println();

        // Средний оклад в ОТДЕЛЕ
        employeeBook.calculationDepartAverageSalary(department);
        System.out.println();

        // ИЗМЕНЕНИЕ ЗП в ОТДЕЛЕ на %
        int procent = 1;
        employeeBook.indexingeDepartSalary(department, procent);
        System.out.println();

        // ИМЕНА СОТРУДНИКОВ ОТДЕЛА
        employeeBook.printDepartrEmployee(department);
        System.out.println();

        // Сотрудники с зарплатой выше или ниже X
        int x = 55000;
        employeeBook.findLess(x);
        System.out.println();
        employeeBook.findMore(x);
        System.out.println();


        // САМОЕ СЛОЖНОЕ

     // Добавление работников
        employeeBook.addWocker("fdds fdds fdss", 5, 45600);
        System.out.println();

        // Распечатываем ВСЕ ДАННЫЕ
        employeeBook.printAllEmployees();
        System.out.println();

     // Удаление работников
     employeeBook.deleteWocker("fdds fdds fdss",0);
     System.out.println();

     // Изменить данные сотрудника
     employeeBook.changeEmployeeData("asd asdas asd",1,45000);
     System.out.println();

     // Вывод данных по отделам
     employeeBook.printDepsrtaments();

    }

}