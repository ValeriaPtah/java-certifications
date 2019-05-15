package ua.ptah.certifications.hacker_rank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotatedArrayTest {

  @Test
  void rotLeft() {
    assertArrayEquals(new int[]{3, 4, 5, 1, 2}, RotatedArray.rotLeft(new int[]{1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new int[]{5, 1, 2, 3, 4}, RotatedArray.rotLeft(new int[]{1, 2, 3, 4, 5}, 4));
    assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77},
        RotatedArray.rotLeft(new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10));
    assertArrayEquals(new int[]{87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60},
        RotatedArray.rotLeft(new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}, 13));
    assertArrayEquals(new int[]{0}, RotatedArray.rotLeft(new int[]{0}, 2));
    assertArrayEquals(new int[]{5, 7}, RotatedArray.rotLeft(new int[]{7, 5}, 3));
  }
}