package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String newLine;
        for (int i = 0; i<cathetusLength; i++){
            newLine = "";
            for (int j = 1; j <= cathetusLength*2-1; j++){

                if (j<cathetusLength-i || j>cathetusLength+i) {
                    if (j>cathetusLength+i){
                        continue;
                    }
                    newLine = newLine + " ";

                } else {
                    if (j<=cathetusLength) {
                        newLine = newLine + String.valueOf(cathetusLength - j + 1);
                    } else {
                        newLine = newLine + String.valueOf(j - cathetusLength+1);
                    }
                }
            }
            System.out.println(newLine);
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
