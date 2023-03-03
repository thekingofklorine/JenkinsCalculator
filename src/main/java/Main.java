import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(scanner.hasNext()){
            String command = scanner.next();
            if(command.equals("add")){
                int x = parseInt(scanner.next());
                int y = parseInt(scanner.next());
                int answer = calculator.add(x,y);
                System.out.println(answer);

            }else if (command.equals("subtract")) {
                int x = parseInt(scanner.next());
                int y = parseInt(scanner.next());
                int answer = calculator.subtract(x,y);
                System.out.println(answer);

            }else if (command.equals("multiply")) {
                int x = parseInt(scanner.next());
                int y = parseInt(scanner.next());
                int answer = calculator.multiply(x,y);
                System.out.println(answer);

            }else if (command.equals("divide")) {
                int x = parseInt(scanner.next());
                int y = parseInt(scanner.next());
                int answer = calculator.divide(x,y);
                System.out.println(answer);

            }else if (command.equals("fibonacci")) {
                int x = parseInt(scanner.next());
                int answer = calculator.fibonacciNumberFinder(x);
                System.out.println(answer);


            }else if (command.equals("binary")) {
                int x = parseInt(scanner.next());
                String answer = calculator.intToBinaryNumber(x);
                System.out.println(answer);

            }

        }

    }

}
