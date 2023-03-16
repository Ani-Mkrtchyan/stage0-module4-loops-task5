package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == height - 1) {
                    System.out.print(" s ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printRectangleFrom8s(8, 8);
    }
}
