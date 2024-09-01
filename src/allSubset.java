import java.util.ArrayList;

public class allSubset {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<ArrayList<Integer>> allSubsets = getSubsets(0, arr, new ArrayList<>());
        System.out.println(allSubsets);
    }

    private static ArrayList<ArrayList<Integer>> getSubsets(int i, int[] arr, ArrayList<Integer> current) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        if (i == arr.length) {
            subsets.add(new ArrayList<>(current));
            return subsets;
        }

        current.add(arr[i]);
        subsets.addAll(getSubsets(i + 1, arr, current));
        current.remove(current.size() - 1);
        subsets.addAll(getSubsets(i + 1, arr, current));

        return subsets;
    }
}
