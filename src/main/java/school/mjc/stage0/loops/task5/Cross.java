package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if (i == j || i + j == sideLength + 1) {
                    System.out.print("s");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(8);
    }
}
