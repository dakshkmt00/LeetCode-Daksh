class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> list : ans) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(num);
                temp.add(newList);
            }

            ans.addAll(temp);
        }

        return ans;
    }
}