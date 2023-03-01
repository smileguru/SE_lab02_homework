import java.util.Scanner;

public class Main {
    public static double a0 = 0;
    public static double a1=0;
    public static double a2=0;
    public static double a=0;
    public static double b=0;
    public static double c=0;
    public static double x=0;
    public static double y=0;
    public static double d=0;

    public static void V1(){
        double f1 = 5*a/(b+c);
        double f2 = Math.sqrt(Math.abs(Math.cos(Math.pow(x,3))));
        System.out.println("Ответ: "+(f1-f2));
    }

    public static void V2(){
        double f1 = Math.abs(x-y)/(1+2*x);
        double f2 = Math.exp(Math.sqrt(1));
        System.out.println(f1-f2);
    }

    public static void V3(){
        double f1 = Math.sqrt(a0+a1*x+a2*Math.pow(Math.abs(Math.sin(x)),1/3));
        System.out.println(f1);
    }

    public static void V4(){
        double f1 = Math.log(Math.pow(a,7))+Math.atan(x*x);
        double f2 = Math.PI/Math.sqrt(Math.abs(a+x));
        System.out.println(f1+f2);
    }

    public static void V5(){
        double f1 = Math.pow(Math.pow((a+b),2)/(c+d)+Math.exp(Math.sqrt(x+1)),1/5);
        System.out.println(f1);
    }

    public static void V6(){
        double f1 = (2*Math.sin(4*x)+Math.pow(Math.cos(x*x),2))/(3*x);
        System.out.println(Math.exp(f1));
    }

    public static void V7(){
        double f1 = 0.25*((1+x*x)/(1-x)+0.5*Math.tan(x));
        System.out.println(f1);
    }



    public static void main(String[] args) {
        System.out.println("Hello, Vasia");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Введите (a,b,c,x):");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                x = scanner.nextDouble();
                V1();
                break;

            case 2:
                System.out.println("Введите (x,y):");
                x = scanner.nextDouble();
                y = scanner.nextDouble();
                V2();
                break;

            case 3:
                System.out.println("Введите (a0,a1,a2,x):");
                a0 = scanner.nextDouble();
                a1 = scanner.nextDouble();
                a2 = scanner.nextDouble();
                x = scanner.nextDouble();
                V3();
                break;

            case 4:
                System.out.println("Введите (a,x):");
                a = scanner.nextDouble();
                x = scanner.nextDouble();
                V4();
                break;

            case 5:
                System.out.println("Введите (a,b,c,d):");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                d = scanner.nextDouble();
                V5();
                break;

            case 6:
                System.out.println("Введите (x):");
                x = scanner.nextDouble();
                V6();
                break;

            case 7:
                System.out.println("Введите (x):");
                x = scanner.nextDouble();
                V7();
                break;

            default:
                break;
        }
    }
}
