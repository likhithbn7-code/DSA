public class evenno {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check if number has even digits
    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;

        if (num == 0) return 1;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
