class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        formSubset(0, nums, ans, new ArrayList<>());
        return ans;
    }

    public void formSubset(int index, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
            
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1])
                continue;
            
            ds.add(arr[i]);
            formSubset(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}