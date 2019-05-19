package ua.ptah.certifications.codility;

import java.util.Arrays;

/*
 * Given unsorted array of integers, return the smallest missing positive integer from a sorted perspective
 */

class SmallestMissingPositive {
  static int findSmallestMissingPositive(int[] initialNotSortedNumbers) {
    int[] sortedPositives = Arrays.stream(initialNotSortedNumbers).filter(num -> num > 0).sorted().toArray();
    if ((sortedPositives.length == 0) || (sortedPositives[0] > 1)) {
      return 1;
    }
    for (int i = 0; i < sortedPositives.length - 1; i++) {
      if ((sortedPositives[i + 1] - sortedPositives[i]) > 1) {
        return sortedPositives[i] + 1;
      }
    }
    return sortedPositives[sortedPositives.length - 1] + 1;
  }
}