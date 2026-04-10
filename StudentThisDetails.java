class StudentThisDetails {
    int rollno;
    String name;

    StudentThisDetails(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll no.: " + rollno);
    }

    public static void main(String[] args) {

        StudentThisDetails st1 = new StudentThisDetails(4, "Hahah");
        StudentThisDetails st2 = new StudentThisDetails(5, "Hihi");
        st1.display();
        st2.display();
    
    }
}