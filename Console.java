import java.io.Console;

public class Console {

    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("enter a name : ");
        String name = c.readline();
        System.out.println("hello ! "+name);
    }
}