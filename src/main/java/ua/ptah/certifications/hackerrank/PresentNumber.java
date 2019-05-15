package ua.ptah.certifications.hackerrank;

import java.util.List;

class PresentNumber {

  static boolean isNumberPresent(List<Integer> sourceArray, int targetNumber) {
    return sourceArray.stream().anyMatch(i -> i == targetNumber);
  }
}