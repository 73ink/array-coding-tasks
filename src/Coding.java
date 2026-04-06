public class Coding {

    public static void main(String[] args){
        // task 1
//        int[] nums = {6, 1, 2, 3};
//        System.out.println(firstLast6(nums));
        // task 2
//        int[] a = {1, 2, 3};
//        int[] b = {7, 3};
//
//        System.out.println(commonEnd(a, b));
        // task 3
        int[] nums = {5, 11, 9};

        int[] result3 = reverse3(nums);

        for (int i = 0; i < result3.length; i++) {
            System.out.println(result3[i]);
        }
    }
    public static boolean firstLast6(int[] nums){
        if ((nums[0] == 6) || nums[nums.length - 1] ==6) {
            return true;
        }
        return false;
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }
    public static int[] reverse3(int[] nums) {
        int[] reversed = {nums[2], nums[1], nums[0]};
        return reversed;
    }
}
