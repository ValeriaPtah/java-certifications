package ua.ptah.certifications.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestMissingPositiveTest {

  @Test
  void findSmallestMissingPositiveTest() {
    assertEquals(3, SmallestMissingPositive.findSmallestMissingPositive(new int[]{1, 7, 9, 2, 5}));
    assertEquals(1, SmallestMissingPositive.findSmallestMissingPositive(new int[]{-1, -7}));
    assertEquals(4, SmallestMissingPositive.findSmallestMissingPositive(new int[]{1, 2, 3}));
    assertEquals(1, SmallestMissingPositive.findSmallestMissingPositive(new int[]{0}));
  }
}