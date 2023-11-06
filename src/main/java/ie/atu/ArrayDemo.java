package ie.atu;
public class ArrayDemo {

    public static void main(String[] args) {
        //Creates an integer array
        int[] anArray;
        int i;
        //Sets array size to 10
        anArray = new int[10];

        //Input array values by index
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (i = 0; i < 10; i++) {
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}
