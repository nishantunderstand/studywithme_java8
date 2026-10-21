class Main {
public static void main(String[] args) {
List<Employee> empList = Arrays.asList(
new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
);
}
}


record Employee(int id, String name, int age ,String gender, String department,int yearOfJoining, double salary) {
}
class Main {
public static void main(String[] args) {
List<Employee> empList = Arrays.asList(
new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
);
}
}



![EmployeeManagementSystem](/EmployeeManagementSystem.png)