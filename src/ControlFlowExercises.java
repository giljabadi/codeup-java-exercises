public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i++);
        }
        int j = 1;
        do {
            System.out.println(j*=2);
        } while (j <= 100); {
            System.out.println(j*=2);
        }
    }
}
