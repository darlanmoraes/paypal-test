import java.util.*;

class Program {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        for (int a = 0; a < array.length; a++) {
            int aa = array[a];
            for (int b = a + 1; b < array.length; b++) {
                int bb = array[b];
                for (int c = b + 1; c < array.length; c++) {
                    int cc = array[c];
                    for (int d = c + 1; d < array.length; d++) {
                        int dd = array[d];
                        if ((aa + bb + cc + dd) == targetSum) {
                            result.add(new Integer[] { aa, bb, cc, dd });
                        }
                    }
                }
            }
        }
        return result;
    }

    private static void print(List<Integer[]> result) {
        if (result.isEmpty()) {
            System.out.println("Empty array");
        } else {
            for (Integer[] array : result) {
                for (Integer e : array) {
                    System.out.print(e + ", ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void test1() {
        List<Integer[]> result = fourNumberSum(new int[] { 7, 6, 4, -1, 1, 2 }, 16);
        print(result);
    }

    private static void test2() {
        List<Integer[]> result = fourNumberSum(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 10);
        print(result);
    }

    private static void test3() {
        List<Integer[]> result = fourNumberSum(new int[] { 5, -5, -2, 2, 3, -3 }, 0);
        print(result);
    }

    private static void test4() {
        List<Integer[]> result = fourNumberSum(new int[] { -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4);
        print(result);
    }

    private static void test5() {
        List<Integer[]> result = fourNumberSum(new int[] { -1, 22, 18, 4, 7, 11, 2, -5, -3 }, 30);
        print(result);
    }

    private static void test6() {
        List<Integer[]> result = fourNumberSum(new int[] { -10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5 }, 20);
        print(result);
    }

    private static void test7() {
        List<Integer[]> result = fourNumberSum(new int[] { 1, 2, 3, 4, 5 }, 100);
        print(result);
    }

    private static void test8() {
        List<Integer[]> result = fourNumberSum(new int[] { 1, 2, 3, 4, 5, -5, 6, -6 }, 5);
        print(result);
    }

}