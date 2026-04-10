public class EmployeeThisDetails {
    int empId;
    String empName;

    EmployeeThisDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void displayy() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {
        EmployeeThisDetails em1 = new EmployeeThisDetails(2, "hihi");
        em1.displayy();
    }
}