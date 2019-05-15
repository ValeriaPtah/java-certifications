package ua.ptah.certifications.hacker_rank;

import java.util.List;

class PresentNumber {

  static boolean isNumberPresentCheck(List<Integer> sourceArray, int targetNumber) {
    return sourceArray.stream().anyMatch(i -> i == targetNumber);
  }
}