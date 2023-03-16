package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i <= height / 2; i++) {
            if (height == 2 * i)
                continue;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
        hourglass.printHourglassOfGivenSize(6);
        hourglass.printHourglassOfGivenSize(3);
       // hourglass.printHourglassOfGivenSize(0);
    }
}
