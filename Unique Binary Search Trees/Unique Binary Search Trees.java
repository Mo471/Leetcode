class Solution {
    public int numTrees(int n) {
       Map<Integer, Integer> precalculatedSubtrees = new HashMap<Integer,Integer>();
        return countSubtrees(n, precalculatedSubtrees);
    }
    
    public static int countSubtrees(int elementsCount, Map<Integer, Integer> precalculatedSubtrees) {
        if (elementsCount == 1 || elementsCount == 0) {
            return 1;
        }

        int sum = 0;
        for (int i = 1; i <= elementsCount; i++) {
            if (i == 1 || i == elementsCount) {
                // Checking if required subtrees already calculated and is in map
                // Otherwise, calculating via recursion and adding to map
                if (precalculatedSubtrees.containsKey(elementsCount - 1)) {
                    sum += precalculatedSubtrees.get(elementsCount - 1);
                    continue;
                }
                sum += countSubtrees(elementsCount - 1, precalculatedSubtrees);
            } else {
                int leftSubtrees = 0;
                int rightSubtres = 0;
                // Checking if leftSubtrees already calculated and is in map
                // Otherwise, calculating via recursion and adding to map
                if (precalculatedSubtrees.containsKey(i - 1)) {
                    leftSubtrees = precalculatedSubtrees.get(i - 1);
                } else {
                    leftSubtrees = countSubtrees(i - 1, precalculatedSubtrees);
                }
                // Checking if rightSubtrees already calculated and is in map
                // Otherwise, calculating via recursion and adding to map
                if (precalculatedSubtrees.containsKey(elementsCount - i)) {
                    rightSubtres = precalculatedSubtrees.get(elementsCount - i);
                } else {
                    rightSubtres = countSubtrees(elementsCount - i, precalculatedSubtrees);
                }

                sum += leftSubtrees * rightSubtres;
            }
        }
        precalculatedSubtrees.put(elementsCount, sum);
        return sum;
    }
}

/*
class Solution {
    public static int numTrees(int elementsCount) {
        if (elementsCount == 1 || elementsCount == 0) {
            return 1;
        }

        int sum = 0;
        for (int i = 1; i <= elementsCount; i++) {
            if (i == 1 || i == elementsCount) {
                sum += numTrees(elementsCount - 1);
            } else {
                sum += numTrees(i - 1) * numTrees(elementsCount - i);
            }
        }
        return sum;
    }
}
*/