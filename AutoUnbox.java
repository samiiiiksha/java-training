
class IntegerWrapped {

    private int value;
    public IntegerWrapped(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


public class AutoUnbox {
    public static void main(String[] args) {
        IntegerWrapped wrappedInt = new IntegerWrapped(42);
        System.out.println("Autoboxed int is: " + wrappedInt.getValue());

        Integer autoboxedInt = 100;
        System.out.println("Autoboxed Integer Value: " + autoboxedInt);

        // unboxing
        int unboxedint = autoboxedInt;
        System.out.println("Unboxed Integer value: " + unboxedint);

        Integer a = 100;
        Integer b = 100;

        System.out.println("Using == : " + (a == b));  // FALSE as a and b are different objects in memory.
        System.out.println("Using equals() method: " + a.equals(b));    // TRUE as .equals() compares the content, not the memory location
    }
}