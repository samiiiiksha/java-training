class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayL = new ArrayList<>();

        arrayL.add("Hello");
        arrayL.add("World");
        System.out.println("ArrayList is: " + arrayL);

        System.out.println("Array's size is: " + arrayL.length());

        arrayL.remove("Hello");

        System.out.println("Array after removal: " + arrayL);
        System.out.println("Is Word present in the array? : " + arrayL.contains("World"));
    }
}