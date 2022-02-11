import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums, new HashSet<Integer>());
        return result;
    }

    public static void backtrack(List<List<Integer>> result,
                                 List<Integer> tempPermutation,
                                 int[] sourceArray,
                                 Set<Integer> usedElements) {
        if (tempPermutation.size() == sourceArray.length) {
            result.add(new ArrayList<>(tempPermutation));
            return;
        }

        for (int i = 0; i < sourceArray.length; i++) {
            if (usedElements.contains(sourceArray[i])) {
                continue;
            }
            tempPermutation.add(sourceArray[i]);
            usedElements.add(sourceArray[i]);
            backtrack(result, tempPermutation, sourceArray, usedElements);
            usedElements.remove(tempPermutation.get(tempPermutation.size() - 1));
            tempPermutation.remove(tempPermutation.size() - 1);

        }
    }

}