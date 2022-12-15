
public class Employee {
    static int count; // Переменная счетчик
    private int id;         // Поля ДАННЫХ сотрудников
    private String fullName;
    private int department;
    private int salary;

    // КОНСТРУКТОР
    public Employee(String fullName, int department, int salary) {
        //this.wocker = new Employee[10]; // Создали базу данных на 10 мест

        this.id = count++;         // Заполнение полей данных
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // ГЕТТЕРЫ
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public int getDepartment() { return department; }
    public int  getSalary() { return salary; }
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

}