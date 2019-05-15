package ua.ptah.certifications.test_dome;

import java.util.HashMap;
import java.util.Map;

/*
 * Return indices of two numbers in the LIST that make up the TARGET_SUM. If none, return NULL
 */

class TwoSum {
  static int[] findTwoSum(int[] list, int targetSum) {
    if (list.length < 2) {
      return null;
    }

    Map<Integer, Integer> numbersThatMakeTargetSum = new HashMap<>();
    for (int i = 0; i < list.length; i++) {
      if (numbersThatMakeTargetSum.containsKey(list[i])) {
        return new int[]{numbersThatMakeTargetSum.get(list[i]), i};
      }
      else {
        numbersThatMakeTargetSum.put(targetSum - list[i], i);
      }
    }
    return null;
  }
}