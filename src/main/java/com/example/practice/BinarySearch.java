package com.example.practice;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,3,7,9,11,12,45};
        int target = 3;

        final var result = search(nums,target);
        if(result!=-1) {
            System.out.println("The index of element " + target + " is: " + result);
        }
        else {
            System.out.println(result);
        }

    }

    private static int search(int[] numb, int target) {

        int low = 0;
        int high = numb.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == numb[mid]) {
                return mid;
            } else if (target < numb[mid]) {
                high = mid - 1;
            } else if (target > numb[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }


}
