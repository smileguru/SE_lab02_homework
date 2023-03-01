import java.util.Scanner;

public class Main {
    public static void V0(Double x, Double y){
        Double fc = 3*Math.pow(Math.cos(x-Math.PI/6),2);
        Double fs = 0.5+Math.sin(Math.pow(y,2));
        System.out.println(fc/fs);
    }
    public static void main(String[] args) {
        System.out.println("Hello, Vasia");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите 2 вещественных числа:");
        Double x = scanner.nextDouble();
        Double y = scanner.nextDouble();
        V0(x,y);
    }
}
