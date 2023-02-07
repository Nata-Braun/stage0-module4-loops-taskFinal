package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String newLine;
        for (int i = 1; i<=cathetusLength; i++){
            newLine = "";
            for (int j = 1; j<=cathetusLength; j++){
                if (j<=cathetusLength-i) {
                    newLine = newLine + " ";
                }else {
                    newLine = newLine +"*";
                }
            }
            System.out.println(newLine);
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
