package com.algorithm;

import java.util.*;

public class SortAlgorithm {

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        //需要进行arr.length趟比较
        for(int i = 0 ;i < arr.length - 1; i++){
            //第i趟比较
            for(int j = 0 ; j < arr.length - i - 1; j++){
                //开始进行比较，如果arr[j]比arr[j+1]的值大，那就交换位置
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }

    /**
     * 快速排序
     * @param ints int[] ints = new int[]{6 ,1 ,2 ,7 ,9 ,3 ,4 ,5 , 10 ,8,15,13,14,11,12,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
     * @param begin 0
     * @param end 30
     * @return
     */
    public static int[] quickSort(int[] ints, int begin, int end){
        if (begin >= end){
            return ints;
        }
        int i, j;
        i = begin;
        j = end;
        //这个地方稍微优化一下，每次都挑一个相对来说比较中间大小的数字
        if (end - begin > 2){
            int mid = i + (j - i) >> 1;
            if (ints[i] > ints[mid]) {
                swap(ints, i, mid);
            }
            if (ints[mid] > ints[j]) {
                swap(ints, mid, j);
            }
            if (ints[i] < ints[mid]) {
                swap(ints, i, mid);
            }
        }

        int baseNum = ints[i];

        while (i < j){
            while (ints[j] >= baseNum && i < j){
                j--;
            }
            while (ints[i] <= baseNum && i < j){
                i++;
            }
            if (i < j) {
                swap(ints, i, j);
            }
        }

        if (baseNum > ints[i]) {
            ints[begin] = ints[i];
            ints[i] = baseNum;
        }
        quickSort(ints, begin, i);
        quickSort(ints, i + 1, end);
        return ints;
    }

    /**
     * 堆排序  TopK Elements 问题 ;Kth Element 问题
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        // 小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.add(val);
            // 维护堆的大小为 K
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }

    /**
     * 快速选择 排序，TopK Elements 问题 ;Kth Element 问题
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest2(int[] nums, int k) {
        //是用快速排序中的partion方法来确定第k大的元素
        int res = 0;
        int l = 0;
        int h = nums.length - 1;
        while (true) {
            int p = partion(nums,l,h);
            //如果p就是第k个
            if (p + 1 == k) {
                res =  nums[p];
                break;
            }
            //如果p比k小
            else if (p + 1 < k) {
                l = p + 1;
                continue;
            }
            //如果p大了
            else {
                h = p - 1;
                continue;
            }
        }
        return res;
    }
    private static int partion(int[] nums,int l,int h) {
        //这个地方稍微优化一下，每次都挑一个相对来说比较中间大小的数字
        int mid = l + ((h-l) >> 1);
        if (nums[l] > nums[mid]) {
            swap(nums, l, mid);
        }
        if (nums[mid] > nums[h]) {
            swap(nums, mid, h);
        }
        if (nums[l] < nums[mid]) {
            swap(nums, l, mid);
        }
        int temp = nums[l];
        while (l < h) {
            //大于等于nums[l]的往前放
            while (nums[h] < temp && l < h) {
                h--;
            }
            if (l < h) {
                nums[l++] = nums[h];
            }
            //小于nums[l]的往后放
            while (nums[l] >= temp && l < h) {
                l++;
            }
            if (l < h) {
                nums[h--] = nums[l];
            }
        }
        nums[l] = temp;
        return l;
    }

    private static void swap(int[] nums,int x,int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    /**
     * 出现频率最多的 k 个元素
     * @param nums int[] ints = new int[]{23,31,32,20,21,18,19,24,25,26,27,28,29,30,30,31};
     * @param k 2
     * @return [30,31]
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        //1.通过维护一个数组List集合,数组下标表示出现的次数实现
//        List<Integer>[] buckets = new ArrayList[nums.length + 1];
//        for (int key : frequencyForNum.keySet()) {
//            int frequency = frequencyForNum.get(key);
//            if (buckets[frequency] == null) {
//                buckets[frequency] = new ArrayList<>();
//            }
//            buckets[frequency].add(key);
//        }
        int[] topK = new int[k];
//        int index = 0;
//        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
//            List<Integer> bucket = buckets[i];
//            if (bucket == null) {
//                continue;
//            }
//            for (int j = 0; j < bucket.size() && index < k; j++) {
//                topK[index++] = bucket.get(j);
//            }
//        }
        //2.新建最大堆 实现
        Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((v1, v2) -> v2.getValue() - v1.getValue());
        Iterator<Map.Entry<Integer, Integer>> entries = frequencyForNum.entrySet().iterator();
        while (entries.hasNext()){
            queue.offer(entries.next());
        }

        for (int i = 0; i < k; i++){
            Map.Entry<Integer,Integer> currentEntry = queue.poll();
            topK[i] = currentEntry.getKey();
        }
        return topK;
    }

    /**
     * 按照字符出现次数对字符串排序 Sort Characters By Frequency (Medium)
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        if (s == null && s.equals("")) {
            return s;
        }
        Map<Character, Integer> frequencyForNum = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyForNum.put(c, frequencyForNum.getOrDefault(c, 0) + 1);
        }
        StringBuffer sb = new StringBuffer();
        //1.通过维护一个数组List集合,数组下标表示出现的次数实现
        List<Character>[] frequencyBucket = new ArrayList[s.length() + 1];
        for (char c : frequencyForNum.keySet()) {
            int f = frequencyForNum.get(c);
            if (frequencyBucket[f] == null) {
                frequencyBucket[f] = new ArrayList<>();
            }
            frequencyBucket[f].add(c);
        }
        for (int i = frequencyBucket.length - 1; i >= 0; i--) {
            if (frequencyBucket[i] == null) {
                continue;
            }
            for (char c : frequencyBucket[i]) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }
        //2.新建最大堆 实现
//        Queue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>((v1, v2) -> v2.getValue() - v1.getValue());
//        Iterator<Map.Entry<Character, Integer>> entries = frequencyForNum.entrySet().iterator();
//        while (entries.hasNext()){
//            queue.offer(entries.next());
//        }
//
//        while (!queue.isEmpty()) {
//            Map.Entry<Character,Integer> currentEntry = queue.poll();
//            Character key = currentEntry.getKey();
//            for (Integer i = 0; i < currentEntry.getValue(); i++) {
//                sb.append(key);
//            }
//        }
        return sb.toString();
    }

    /**
     * 按颜色进行排序 Sort Colors (Medium)
     * 其实是三向切分快速排序的一种变种，在三向切分快速排序中，每次切分都将数组分成三个区间：小于切分元素、等于切分元素、大于切分元素
     * @param nums
     */
    public static void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                swap(nums, --two, one);
            } else {
                ++one;
            }
        }
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
