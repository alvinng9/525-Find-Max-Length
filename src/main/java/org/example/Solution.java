package org.example;

import java.util.HashMap;

public class Solution {
    public int findMaxLength(int[] nums) {
        //initialize hashmap of key integer and value integer
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        //convert all values of 0 to -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        //add the base case
        map.put(0, -1);
        int sum = 0;
        //iterate through the array
        for (int i = 0; i < nums.length; i++) {
            //find the sum up to that index
            sum += nums[i];
            //check if the map already has the current sum
            if (map.containsKey(sum)) {
                //if the map has seen that sum, find the longest length of the subarray with
                //0 and 1
                result = Math.max(result, i - map.get(sum));
            } else {
                //add the sum and the current index to the map
                map.put(sum, i);
            }
        }
        return result;
    }
}
