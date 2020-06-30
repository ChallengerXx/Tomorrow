package com.algorithm;

import java.util.HashSet;
import java.util.List;

public class DoublePointAlgorithm {


    /**
     * 有序数组的 Two Sum ;Two Sum II - Input array is sorted
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    /**
     * 两数平方和 Sum of Square Numbers
     * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    /**
     * 回文字符串 Valid Palindrome
     * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int begin, int end){
        while (begin < end){
            if (s.charAt(begin) != s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    /**
     * 归并两个有序数组 Merge Sorted Array
     * @param nums1 nums1 = [1,2,3,0,0,0],
     * @param m     m = 3
     * @param nums2 nums2 = [2,5,6]
     * @param n     n = 3
     *  [1,2,2,3,5,6]
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0){
            nums1[k--] = nums1[i--];
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }

    /**
     * 判断链表是否存在环 Linked List Cycle
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        boolean hasCycle = false;
        if (head == null) {
            return null;
        }
        ListNode p = head, p2 = head;
        while (p.next != null && p2.next != null && p2.next.next != null) {
            p = p.next;
            p2 = p2.next.next;
            if (p == p2) {
                hasCycle = true;
                break;
            }

        }

        if(hasCycle){
            ListNode q = head;
            while(p != q){
                p = p.next;
                q = q.next;
            }
            return q;
        }
        return null;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Longest Word in Dictionary through Deleting 最长子序列
     * @param s
     * @param d
     * @return
     */
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        int length = 0;
        for (String s1 : d) {
            if (s1.length() > s.length()){
                continue;
            }
            if (result.length() == s1.length() && result.compareTo(s1) < 0){
                continue;
            }
            int i = 0;
            int j = 0;
            while (j < s.length() && i < s1.length()){
                if (s1.charAt(i) == s.charAt(j)){
                    i++;
                }
                j++;
            }

            if (i == s1.length() && s1.length() >= length){
                length = s1.length();
                result = s1;
            }

        }
        return result;
    }
}
