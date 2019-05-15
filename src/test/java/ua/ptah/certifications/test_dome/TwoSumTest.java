package ua.ptah.certifications.test_dome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TwoSumTest {

  @Test
  void findTwoSumTest() {
    assertArrayEquals(new int[]{0, 3}, TwoSum.findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10));
    assertArrayEquals(new int[]{2, 3}, TwoSum.findTwoSum(new int[]{8, 7, 0, -9}, -9));
    assertArrayEquals(new int[]{2, 4}, TwoSum.findTwoSum(new int[]{3, 0, -5, 7, 5}, 0));

    assertNull(TwoSum.findTwoSum(new int[]{3, 0, -5, 7, 5}, 20));
  }
}