import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Details implements Serializable {
    int id;
    String name;

    Details(int id, String name) {
        this.id = id;
        this.name = name;
    } 
}

class SerializationDemo {
    public static void main(String[] args) {
        try {

            Details st = new Details(101, "Samiksha");

            FileOutputStream fOS = new FileOutputStream("student.ser");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(st);

            oOS.close();
            fOS.close();

            System.out.println("Object serialized succesfully!!");
        
        } catch(IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}