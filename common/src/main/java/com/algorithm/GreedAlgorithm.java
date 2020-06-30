package com.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class GreedAlgorithm {

    /**
     * 分配饼干 Assign Cookies
     * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，这是能让孩子们满足胃口的饼干的
     * 最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，
     * 并输出这个最大数值。
     * @param g 孩子[1,2,3]
     * @param s 饼干[1,1]
     * @return [1]
     */
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);

        int gi = 0, si = 0;
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

    /**
     * 不重叠的区间个数  Non-overlapping Intervals
     * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
     * @param intervals  [ [1,2], [2,3], [3,4], [1,3] ]
     * @return 1
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }

    public static void main(String[] args) {

    }
}
