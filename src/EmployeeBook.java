public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(Employee[] employees){
       this.employees = new Employee[10];
    }

    // ВЫВОД ВСЕХ ДАННЫХ
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

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
        //int sumSalary = 0;
        int average = countingSumSalaru();
        System.out.println("Зарплата всех сотрудников составит: " + average + " руб.");
        average = average / Employee.count;

        return average;
    }

    // Работник с МIN ЗП
    public Employee findMinSalary() {
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
    public Employee findMaxSalary() {
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
    public void printFullName() {
        for (Employee value : employees) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }

    // ИЗМЕНЕНИЕ ЗП на %
    public void indexingSalary(Employee[] wocker, int percent) {
        for (Employee value : wocker) {
            if (value != null) {
                value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
                System.out.println("Измененная ЗП на " + percent + "% - " + value.getSalary());
            }
        }
    }

    // параметр № отдела: Сотрудник с МИН ЗП
    public void findDepartmtMinSalary(Employee[] wocker, int department) {
        int min = wocker[0].getSalary();
        Employee minim = null;
        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department && min > value.getSalary()) {
                min = value.getSalary();
                minim = value;
            }
        }
        System.out.println("Минимальный оклад в отделе №" + department + " у:");
        System.out.println(minim);
    }

    // параметр № отдела: Сотрудник с МАКС ЗП
    public void findDepartmtMaxSalary(Employee[] wocker, int department) {
        int max = wocker[0].getSalary();
        Employee maxim = null;
        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department && max < value.getSalary()) {
                max = value.getSalary();
                maxim = value;
            }
        }
        System.out.println("Максимальный оклад в отделе №" + department + " у:");
        System.out.println(maxim);
    }

    // Зарплата всех сотрудников ОТДЕЛА
    public int countingDepartmSalaru(Employee[] wocker, int department) {
        int departmentSum = 0;
        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department) {
                departmentSum += value.getSalary();
            }
        }
        return departmentSum;

    }

    // Средний оклад в ОТДЕЛЕ
    public void calculationDepartAverageSalary(Employee[] wocker, int department) {
        int counter = 0;
        int average = countingDepartmSalaru(wocker, department);
        System.out.println("Зарплата отдела № " + department + " составит: " + average + " руб.");

        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department) {
                counter++;
            }
        }
        System.out.println("Средняя зарплата отдела №: " + department + " - " + average/counter + " руб.");
    }

    // ИЗМЕНЕНИЕ ЗП в ОТДЕЛЕ на %
    public void indexingeDepartSalary(Employee[] wocker, int department, int percent) {
        //newSalary = 0;
        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department) {
                value.setSalary(value.getSalary() + (value.getSalary() * percent / 100));
                System.out.println("Измененная ЗП на " + percent + "% в отделе № " + department + ": " + value.getSalary());
            }
        }
    }

    // ИМЕНА СОТРУДНИКОВ ОТДЕЛА
    public void printDepartrEmployee(Employee[] wocker, int department) {
        for (Employee value : wocker) {
            if (value != null && value.getDepartment() == department) {
                System.out.println("Сотрудник отдела: id = " + value.getId() + ", "  + value.getFullName() + ", " + value.getSalary());
            }
        }
    }

    // Сотрудники с зарплатой выше или ниже X
    public void findMoreLess(Employee[] wocker, int x) {
        for (Employee value : wocker) {
            if (value != null && value.getSalary() < x) {
                System.out.println("Работник с ЗП меньше " + x + " - id " + value.getId() + ", " + value.getFullName() + ", " + value.getSalary() + " руб.");
            }
        }
        System.out.println();
        for (Employee value : wocker) {
            if (value != null && value.getSalary() >= x) {
                System.out.println("Работник с ЗП больше " + x + " - id " + value.getId() + ", " + value.getFullName() + ", " + value.getSalary() + " руб." );
            }
        }
    }

    // Добавление работников
    public void addWocker(Employee[] wocker, String fullName, int department, int salary) {
        for (int i = 0; i < wocker.length; i++) {
            if (wocker[i] == null) {
                wocker[i] = new Employee(fullName, department, salary);
                System.out.println("Добавлен " + wocker[i]);
                return;
            } else if (Employee.count == wocker.length) {
                System.out.println("Нельзя добавить работника, закончилось место");
                return;
            }
        }
    }

    // Удаление работников
    public void deleteWocker(Employee[] wocker, String fullName, int id) {
        for (int i = 0; i < wocker.length; i++) {
            if (wocker[i] != null && wocker[i].getFullName() == fullName & wocker[i].getId() == id) {
                wocker[i] = null;
                System.out.println("Работник удален из базы данных");
                return;
            }
        }
        System.out.println("Такой не найден.");
    }

    // Изменить данные сотрудника
    public void changeEmployeeData(String fullName) {

    }

}
