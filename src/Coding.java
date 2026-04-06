public class Coding {

    public static void main(String[] args){
        // task 1
        int[] nums = {1, 2, 3, 7};
        System.out.printIn(firstLast6(nums))
    }
    public static boolean firstLast6(int[] num){
        if ((nums[0] == 6) || nums[nums.length - 1] ==6) {
            return true;
        }
        return false;
    }
}
