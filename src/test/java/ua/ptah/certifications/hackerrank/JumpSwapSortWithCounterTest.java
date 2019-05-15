package ua.ptah.certifications.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpSwapSortWithCounterTest {

  @Test
  void minimumIndividualSwapsTest() {
    int[] test1 = new int[]{2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46,
        23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};
    int[] test2 = new int[]{8, 45, 35, 84, 79, 12, 74, 92, 81, 82, 61, 32, 36, 1, 65, 44, 89, 40, 28, 20, 97, 90, 22, 87,
        48, 26, 56, 18, 49, 71, 23, 34, 59, 54, 14, 16, 19, 76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37, 27, 63, 80,
        24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75, 94, 43, 77, 33, 86, 98, 68, 73, 72,
        13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99, 46};
    int[] test3 = new int[]{7, 1, 3, 2, 4, 5, 6};
    assertEquals(9, JumpSwapSortWithCounter.minimumIndividualSwaps(new int[]{3, 7, 6, 9, 1, 8, 10, 4, 2, 5}));
    assertEquals(5, JumpSwapSortWithCounter.minimumIndividualSwaps(test3));
    assertEquals(3, JumpSwapSortWithCounter.minimumIndividualSwaps(new int[]{4, 3, 1, 2}));
    assertEquals(46, JumpSwapSortWithCounter.minimumIndividualSwaps(test1));
    assertEquals(91, JumpSwapSortWithCounter.minimumIndividualSwaps(test2));


  }
}