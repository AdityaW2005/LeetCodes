class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        formSubset(0, nums, ans, new ArrayList<>());
        return ans;
    }

    public void formSubset(int index, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Pick
        ds.add(arr[index]);
        formSubset(index + 1, arr, ans, ds);
        ds.remove(ds.size() - 1);

        // Not Pick
        formSubset(index + 1, arr, ans, ds);
    }
}