public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<integer> h = new HashSet<integer>();

        for (int i=0; i<nums.length; i++){
            if h.contains(nums[i]) { return true;
                h.add(nums[i])
            }
            else {
                return false;
            }
        }

/* alternate version:

Array.sort(nums);
for (int i=0; i<nums.length-1; i++){
    if (nums[i]== nums[i+1]){
        return true;
    }
    else{
        return false;
    }
}
/*