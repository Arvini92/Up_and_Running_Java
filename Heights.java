import java.util.Scanner;

public class Heights {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStudents;
        double [] heights;
        System.out.println("How many students do you have? ");
        numStudents = in.nextInt();
        heights = new double[numStudents];
        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter height: ");
            heights[i] = in.nextDouble();
        }
        double maxHeight = heights[0];
        for(int i = 1; i < numStudents; i++)
        {
            if(maxHeight < heights[i])
                maxHeight = heights[i];
        }
        double total = 0;
        for(int i = 0; i < heights.length; i++)
        {
            total += heights[i];
        }
        System.out.println("the tallest student is: " + maxHeight + " inches");
        System.out.println("The average height of all is " + (total/numStudents) +
            " inches");
    }
}