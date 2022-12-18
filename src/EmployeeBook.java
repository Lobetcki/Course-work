import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees; //= new Employee[10];

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    // ВЫВОД ВСЕХ ДАННЫХ
    public void printAllEmployees() {
        for (Employee value : employees) {
            System.out.println(value);
        }
    }


    // Дополнительный
    public Employee[] arrClean() {
        Employee[] workers = new Employee[Employee.count];
        for (int i = 0; i < Employee.count; i++) {
            int sol = 0;
            int minSalary = countingSumSalaru();
            for (int j = 0; j < employees.length; j++) {
                 if (employees[j] != null) {
                    if (minSalary >= employees[j].getSalary()) {
                        minSalary = employees[j].getSalary();
                        workers[i] = employees[j];
                        sol = j;
                    }
                 }
            }
            employees[sol] = null;
            //System.out.println(workers[i]);
        }
        employees = new Employee[10];
        System.arraycopy(workers, 0, employees, 0, Employee.count);
//       for (Employee value : employees) {
//          System.out.println();
//          System.out.println(value + "kiubljvjvljblbjk");
        //}
        return workers;
    }
//                Первым параметром является массив-источник.
//                Вторым параметром является позиция начала нового массива.
//                Третий параметр — массив-назначения.
//                Четвертый параметр является начальным положением целевого массива.
//                Последний параметр это количество элементов, которые будут скопированы.




    // Зарплата всех сотрудников
    public int countingSumSalaru() {
        int sumSalary = 0;
        for (Employee value : employees) {
            if (value != null) {
                sumSalary += value.getSalary();
            }
        }
        return sumSalary;
    }

    // Средний оклад
    public int calculationAverageSalary() {
        return countingSumSalaru()/Employee.count;
    }

    // Работник с МIN ЗП
    public Employee findMinSalary() {
       Employee[] minSalaryWocker = arrClean();
       return minSalaryWocker[0];
    }

    // Работник с МAX ЗП
    public Employee findMaxSalary() {
       Employee[] maxSalaryWocker = arrClean();
       return maxSalaryWocker[maxSalaryWocker.length-1];
    }

    // ИМЕНА СОТРУДНИКОВ
    public void printFullName() {
        for (Employee value : employees) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }

    // СРЕДНЯЯ СЛОЖНОСТЬ

    // ИЗМЕНЕНИЕ ЗП на %
    public void indexingSalary(int percent) {
        Employee[] perc = arrClean();
        for (Employee value : perc) {
            value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
            System.out.println("Измененная ЗП на " + percent + "% - " + value.getSalary());
        }
    }

    
//    // Дополнительный
    public Employee[] department(int department) {
        Employee[] depart = arrClean();
        Employee[] arr = new Employee[0];

        for (Employee employee : depart) {
            if (employee.getDepartment() == department) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = employee;
            }
        }
//        for (Employee value : arr) {
//           System.out.println();
//           System.out.println(value + "aaaaaaaaaaaaaaaaaaaaaaaa");
       // }
        return arr;
    }

    // параметр № отдела: Сотрудник с МИН ЗП
    public Employee findDepartmtMinSalary(int department) {
        Employee[] minim = department(department);
        System.out.println("Минимальный оклад в отделе №" + department + " у:" + minim[0]);
        return minim[0];
    }
    // параметр № отдела: Сотрудник с МАКС ЗП
    public Employee findDepartmtMaxSalary(int department) {
        Employee[] maxi = department(department);
        System.out.println("Максимальный оклад в отделе №" + department + " у:" + maxi[maxi.length-1]);
        return maxi[maxi.length-1];

    }

    // Зарплата всех сотрудников ОТДЕЛА
    public int countingDepartmSalaru(int department) {
        Employee[] sym = department(department);
        int sum = 0;
        for (Employee value : sym) {
            sum += value.getSalary();
        }
        return sum;
    }

    // Средний оклад в ОТДЕЛЕ
    public int calculationDepartAverageSalary(int department) {
        Employee[] symm = department(department);
        int average = countingDepartmSalaru(department);
        System.out.println("Зарплата отдела № " + department + " составит: " + average + " руб.");
        System.out.println("Средняя зарплата отдела №: " + department + " - " + average/symm.length + " руб.");
        return average/symm.length;
    }

    // ИЗМЕНЕНИЕ ЗП в ОТДЕЛЕ на %
    public void indexingeDepartSalary(int department, int percent) {
        Employee[] symProc = department(department);
        for (Employee value : symProc) {
                value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
                System.out.println("Измененная ЗП на " + percent + "% в отделе № " + department + ": " + value.getSalary());
        }
    }

    // ИМЕНА СОТРУДНИКОВ ОТДЕЛА
    public void printDepartrEmployee(int department) {
        Employee[] name = department(department);
        for (Employee value : name) {
            System.out.println("Сотрудник отдела: id = " + value.getId() + ", "  + value.getFullName() + ", " + value.getSalary());
        }
    }

    // Сотрудники с зарплатой выше или ниже X
    public Employee[] findLess(int x) {
        Employee[] arr = arrClean();
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (x > arr[i].getSalary()) {
                Employee[] aarrr = new Employee[i+1];
                System.arraycopy(arr, 0, aarrr, 0, ((arr.length)-(arr.length-i-1)));
                for (Employee value : aarrr) {
                    System.out.println(aarrr.length-1 + " Х= " + x + " ЗП МЕНЬШЕ " + value + " xxxxxxxxxxxxxxxxxxxxxxxxxx ");
                }
                return aarrr;
            }
        }
        return arr;
    }

    public Employee[] findMore(int x) {
        Employee[] arr = arrClean();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getSalary() >= x) {
                Employee[] aarrr = new Employee[arr.length-i];
                System.arraycopy(arr, i, aarrr, 0, arr.length-i);
                for (Employee value : aarrr) {
                    System.out.println(" Х= " + x + " ЗП БОЛЬШЕ " + value + "  xxxxxxxxxxxxxxxxxxxxxxxxxx");
                }
                return aarrr;
            }
        }
        return arr;
    }




    //// САМОЕ СЛОЖНОЕ

    // Добавление работников
    public void addWocker(String fullName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                System.out.println("Добавлен " + employees[i]);
                return;
            } else if (Employee.count == employees.length) {
                System.out.println("Нельзя добавить работника, закончилось место");
                return;
            }
        }
    }

    // Удаление работников
    public void deleteWocker(String fullName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null ) {
//                switch (true) {
//
//                }
                if ((employees[i].getFullName() == fullName && employees[i].getId() == id) |
                    (employees[i].getFullName() == fullName && employees[i].getId() == 0) |
                    (employees[i].getFullName() == "" && employees[i].getId() == id)
                    ) {
                    employees[i] = null;
                    System.out.println("Работник удален из базы данных");
                    return;
                }
            }
        }
        System.out.println("Такой не найден.");
    }

    // Изменить данные сотрудника
    public void changeEmployeeData(String fullName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName() == fullName) {
                employees[i].setDepartment(department);
                employees[i].setSalary(salary);
                System.out.println("Данные изменены " + employees[i]);
                return;
            }
        }
        System.out.println("Такой не найден.");
    }

    //Вывод данных по отделам
    public void printDepsrtaments() {
        for (int i = 0; i <= 5; i++) {
            for (Employee value : employees) {
                if (value != null && value.getDepartment() == i) {
                    System.out.println(value);
                }
            }
        }
    }





}


