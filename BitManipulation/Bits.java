// package BitManipulation;

//Bit Manipulation Concept
public class Bits {

    // get the 3rd bit.
    public static void getBits(int n) {
        int position = 2;
        int bitMask = 1 << position;
        if ((bitMask & n) == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is One");

        }
    }

    // set bit
    public static void setBits(int n) {
        int position = 1;
        int bitMask = 1 << position;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        // if(newNumber == 0){
        // System.out.println(newNumber);
        // }else{
        // System.out.println("Bit is One");
        // }
    }

    // clear bit

    public static void clearBit(int n) {
        int position = 2;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }

    // update operation

    public static void updateBit(int n) {
        int position = 1;
        int oper = 1;
        int bitMask = 1 << position;

        if (oper == 1) {
            // set
            int setNew = bitMask | n;
            System.out.println(setNew);
        } else {
            // clear
            int notBitMask = ~(bitMask);
            int clearNew = notBitMask & n;
            System.out.println(clearNew);
        }
    }

    public static void main(String[] args) {
        // getBits(5);
        // setBits(5);
        // clearBit(5);
        updateBit(5);
    }
}
