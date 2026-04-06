public class Coding {

    public static void main(String[] args) {
        // task 1
//        int[] nums = {6, 1, 2, 3};
//        System.out.println(firstLast6(nums));
        // task 2
//        int[] a = {1, 2, 3};
//        int[] b = {7, 3};
//
//        System.out.println(commonEnd(a, b));
        // task 3
//        int[] nums = {5, 11, 9};
//
//        int[] result3 = reverse3(nums);
//
//        for (int i = 0; i < result3.length; i++) {
//            System.out.println(result3[i]);
//    }
        // task 4
//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6};
//
//        int[] result4 = middleWay(a, b);
//
//        for (int i = 0; i < result4.length; i++) {
//            System.out.println(result4[i]);
//        }
        // task 5
//        int[] nums2 = {4, 2};
//
//        System.out.println(no23(nums2));
        // task 6
        int[] nums = {2, 3, 5};

        int[] result6 = fix23(nums);

        for (int i = 0; i < result6.length; i++) {
            System.out.println(result6[i]);
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
    public static int[] middleWay(int[] a, int[] b) {
        int[] middle = {a[1], b[1]};
        return middle;
    }
    public static boolean no23(int[] nums) {
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
            return true;
        }
        return false;
    }
    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }

        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }

        return nums;
    }
}
