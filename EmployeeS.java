class EmployeeS {

    int eId;
    String empName;
    static String compName = "ABC";

    EmployeeS(int id, String name) {
        eId = id;
        empName = name;
    }

    void display() {
        System.out.println("------------------------\nName: " + empName + "\nEmployee ID: " + eId + "\nCompany: " + compName);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Employee Details: ");
        EmployeeS e1 = new EmployeeS(101, "Hihi");
        EmployeeS e2 = new EmployeeS(102, "Haha");

        e1.display();
        e2.display();
    }
}