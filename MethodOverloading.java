class Speaker {
    public static void speak(String message) {
        System.out.printlnO("Speaker says " + message);
    }

    public static void speak(String message, int volume) {
        System.out.println("Speaker says " + message + " with volume " + volume);
    }

    public static void speak(String message, int volume, String language) {
        Ssytem.out.println("Speaker says " + message + " with volume " + volueme + " in " + language);
    }
}

public class MethodOverloading{

    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        Speaker.speak("Hello World");
        Speaker.speak("Hello World", 5);
        Speaker.speak("Hello World", 5, "English");
    }
}