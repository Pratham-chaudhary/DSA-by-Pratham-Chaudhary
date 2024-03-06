class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Create a hash map with key:value pair, of indices

        Map<Integer,Integer> complements = new HashMap<>();

        int n = nums.length;

        //Create a for loop to traverse array nums

        for(int i=0;i<n;i++){

            //Create a variable to store current index of number we are currently traversing
            Integer complementIndex = complements.get(nums[i]);
            //check if the number is not null if not return the index and index of current traversing number.
            if(complementIndex != null){
                return new int[]{complementIndex,i};
            }
            //and if Index value is null then store it in the hashmap
            complements.put(target-nums[i],i);
        }
        return nums;
        
    }
}