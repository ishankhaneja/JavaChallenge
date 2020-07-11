import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class VerifySum {
    @Test
    public void verifyList(){
        List<Integer> list = Arrays.asList(0, 3, 5, 6, 7, 0);
        int target;
        target = 0;
        // Junit assertion by calling static method
        Assert.assertTrue(isPairsAvailable(list, target));
        // Junit assertion using Lambda value
        Assert.assertTrue(value.findTargetValue(list, target));
    }

    static boolean isPairsAvailable(List<Integer> arr, int target)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        // iterating through the list
        for (int value : arr) {
            // subtracting the value from the list from target
            int pair = target - value;
            // checking for condition
            if (hashSet.contains(pair)) {
                return true;
            }
            hashSet.add(value);
        }
        return false;
    }

    MyFunctionalInterface value = (arr, target) -> {
        HashSet<Integer> hashSet = new HashSet<>();
        // iterating through the list
        for (int value : arr) {
            // subtracting the value from the list from target
            int pair = target - value;
            // checking for condition
            if (hashSet.contains(pair)) {
                return true;
            }
            hashSet.add(value);
        }
        return false;

    };
}
@FunctionalInterface
interface MyFunctionalInterface {
    boolean findTargetValue(List<Integer> list, int target);
}
