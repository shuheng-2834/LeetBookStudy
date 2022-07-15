package Array.Pro.No278;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/15 22:15
 * @Version 1.0
 *
 * 二分法变种
 */
public class Main {

}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        return false;
    }
}
