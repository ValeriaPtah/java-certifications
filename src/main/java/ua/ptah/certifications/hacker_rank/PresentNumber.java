package ua.ptah.certifications.hacker_rank;

import java.util.List;

class PresentNumber {

  static String isNumberPresentCheck(List<Integer> sourceArray, int targetNumber) {
    if (sourceArray.stream().anyMatch(i -> i == targetNumber)) {
      return "YES";
    }
    else {
      return "NO";
    }
  }
}