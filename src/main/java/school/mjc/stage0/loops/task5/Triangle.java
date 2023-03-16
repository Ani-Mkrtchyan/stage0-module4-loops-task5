package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i <= cathetusLength; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("s");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(8);
    }
}
