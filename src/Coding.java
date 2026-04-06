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
//        int[] nums = {2, 3, 5};
//
//        int[] result6 = fix23(nums);
//
//        for (int i = 0; i < result6.length; i++) {
//            System.out.println(result6[i]);
//        }
        // task 7
//        int[] nums = {4, 7, 9, 10};
//
//        int[] result7 = makeMiddle(nums);
//
//        for (int i = 0; i < result7.length; i++) {
//            System.out.println(result7[i]);
//        }
        // task 8
//        int[] nums = {8, 6, 7, 5, 3, 0, 9};
//
//        int[] result8 = midThree(nums);
//
//        for (int i = 0; i < result8.length; i++) {
//            System.out.println(result8[i]);
//        }
        // task 9
//        int[] nums = {2, 1, 1, 4, 5};
//
//        System.out.println(unlucky1(nums));
//        // task 10
//        int[] nums = {1, 2, 3, 1};
//
//        System.out.println(sameFirstLast(nums));
        // task 10
//        int[] nums = {1, 2, 3};
//
//        System.out.println(sameFirstLast(nums));
        // task 11
//        int[] nums = {1, 2, 3};
//
//        int[] result11 = maxEnd3(nums);
//
//        for (int i = 0; i < result11.length; i++) {
//            System.out.println(result11[i]);
//        }
        // task 12
//        int[] nums = {7, 4, 6, 2};
//
//        int[] result12 = makeEnds(nums);
//
//        for (int i = 0; i < result12.length; i++) {
//            System.out.println(result12[i]);
//        }
        // task 13
//        int[] nums = {4, 5, 6};
//
//        int[] result13 = makeLast(nums);
//
//        for (int i = 0; i < result13.length; i++) {
//            System.out.println(result13[i]);
//        }
        // task 14
//        int[] a = {1, 2, 3};
//        int[] b = {1, 3};
//
//        System.out.println(start1(a, b));
        // task 15
//        int[] a = {1, 2};
//        int[] b = {3, 4};
//
//        int[] result15 = plusTwo(a, b);
//
//        for (int i = 0; i < result15.length; i++) {
//            System.out.println(result15[i]);
//        }
        // task 16
//        int[] nums = {1, 5, 3};
//
//        System.out.println(maxTriple(nums));
        // task 17
//        int[] a = {4};
//        int[] b = {1, 2, 3};
//
//        int[] result17 = make2(a, b);
//
//        for (int i = 0; i < result17.length; i++) {
//            System.out.println(result17[i]);
//        }
        // task 18
//        int[] result18 = makePi();
//
//        for (int i = 0; i < result18.length; i++) {
//            System.out.println(result18[i]);
//        }
        // task 19
//        int[] nums = {5, 11, 9};
//
//        int[] result19 = rotateLeft3(nums);
//
//        for (int i = 0; i < result19.length; i++) {
//            System.out.println(result19[i]);
//        }
        // task 20
//        int[] nums = {1, 2, 3};
//
//        System.out.println(sum2(nums));

        // task 21
//        int[] nums = {2, 5};
//
//        System.out.println(has23(nums));
        // task 22
//        int[] nums = {2, 2};
//
//        System.out.println(double23(nums));
        // task 23
//        int[] a = {1, 2};
//        int[] b = {3, 4};
//
//        int[] result23 = biggerTwo(a, b);
//
//        for (int i = 0; i < result23.length; i++) {
//            System.out.println(result23[i]);
//        }
        // task 24
//        int[] nums = {1, 2, 3, 4};
//
//        int[] result24 = swapEnds(nums);
//
//        for (int i = 0; i < result24.length; i++) {
//            System.out.println(result24[i]);
//        }
        // task 25
        int[] nums = {1, 2, 3};

        int[] result25 = frontPiece(nums);

        for (int i = 0; i < result25.length; i++) {
            System.out.println(result25[i]);
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
    public static int[] makeMiddle(int[] nums) {
        int mid1 = nums[(nums.length / 2) - 1];
        int mid2 = nums[nums.length / 2];

        int[] result = {mid1, mid2};
        return result;
    }
    public static int[] midThree(int[] nums) {
        int middle = nums.length / 2;

        int[] result = {nums[middle - 1], nums[middle], nums[middle + 1]};
        return result;
    }
    public static boolean unlucky1(int[] nums) {
        if (nums.length >= 2 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }

        if (nums.length >= 3 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }

        if (nums.length >= 2 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;
        }

        return false;
    }
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }
    public static int[] maxEnd3(int[] nums) {
        int max;

        if (nums[0] > nums[2]) {
            max = nums[0];
        } else {
            max = nums[2];
        }

        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;
    }
    public static int[] makeEnds(int[] nums) {
        int[] result = {nums[0], nums[nums.length - 1]};
        return result;
    }
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
    public static int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }

        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = {a[0], a[1], b[0], b[1]};
        return result;
    }
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        int max = first;

        if (middle > max) {
            max = middle;
        }

        if (last > max) {
            max = last;
        }

        return max;
    }
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < a.length && index < 2; i++) {
            result[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length && index < 2; i++) {
            result[index] = b[i];
            index++;
        }

        return result;
    }
    public static int[] makePi() {
        int[] result = {3, 1, 4};
        return result;
    }
    public static int[] rotateLeft3(int[] nums){
        int[] result = {nums[1], nums[2], nums[0]};
        return result;
    }
    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        return nums[0] + nums[1];
    }
    public static boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return true;
        }
        return false;
    }
    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
                return true;
            }
        }
        return false;
    }
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA >= sumB) {
            return a;
        }

        return b;
    }
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }
    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int[] result = {nums[0], nums[1]};
            return result;
        }

        return nums;
    }
}
