
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double distance = in.nextDouble();

        System.out.printf("The trip $%5.2f", distance);
        System.out.println("Hello World");

        String vehicleType = in.next();

        vehicleType += "vehicleType";

        double[] prices = new double[5];

        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();

        System.out.println((3+5+8)/3.0);

        double volume = 4/3 * Math.PI * 10 * 10 * 10;
        int number = (int)volume;

        String[] daysofTheWeak = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        in.close();

        double totalSale = 0;

        if(totalSale < 25)
        {
            totalSale += totalSale +15;
        }
        else if (totalSale < 50)
        {
            totalSale = totalSale + 10;
        }
        else if(totalSale <= 75)
        {
            totalSale = totalSale + 5;
        }

        int count = 0;
        do {
            System.out.println("Hello World");
            count++;
        } while (count < 3);

        while (count < 3) {
            System.out.println("Hello World");
            count++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
    }
}