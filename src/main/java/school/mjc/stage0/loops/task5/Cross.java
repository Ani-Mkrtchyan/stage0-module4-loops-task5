package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if (i == sideLength / 2) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
                System.out.println();
            } else {
                for (int j = 0; j < sideLength; j++) {
                    if (j == sideLength / 2)
                        System.out.print("8");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(5);
         cross.printCross(3);
       // cross.printCross(0);
    }
}