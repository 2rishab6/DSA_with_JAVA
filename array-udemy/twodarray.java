import java.util.Arrays;
class twodarray{

    public static void main(String[] args) {
        int [] [] intarray;

        intarray = new int[2][2];

        intarray[0][0] = 1;
        intarray[0][1] = 2;
        intarray[1][0] = 3;
        intarray[1][1] = 4;

        System.out.println( Arrays.deepToString(intarray) );
    }
}