package sg.com.kmye.algo.bitmanipulation;

public class BitManipulation {

    public static void run() {
        // 1101, 1100
        System.out.println(Integer.toBinaryString(1101 & (~0 << 2)));
        System.out.println(Integer.toBinaryString(1 << 2));
        System.out.println(Integer.toBinaryString(~0 << 2));
    }
}

