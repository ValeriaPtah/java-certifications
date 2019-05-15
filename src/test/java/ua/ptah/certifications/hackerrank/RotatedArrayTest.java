package ua.ptah.certifications.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotatedArrayTest {

  @Test
  void rotateLeftTest() {
    assertArrayEquals(new int[]{3, 4, 5, 1, 2}, RotatedArray.rotateLeft(new int[]{1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new int[]{5, 1, 2, 3, 4}, RotatedArray.rotateLeft(new int[]{1, 2, 3, 4, 5}, 4));
    assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77},
        RotatedArray.rotateLeft(new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10));
    assertArrayEquals(new int[]{87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60},
        RotatedArray.rotateLeft(new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}, 13));
    assertArrayEquals(new int[]{0}, RotatedArray.rotateLeft(new int[]{0}, 2));
    assertArrayEquals(new int[]{5, 7}, RotatedArray.rotateLeft(new int[]{7, 5}, 3));
  }

  @Test
  void rotateRightTest() {
    assertArrayEquals(new int[]{4, 5, 1, 2, 3}, RotatedArray.rotateRight(new int[]{1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new int[]{2, 3, 4, 5, 1}, RotatedArray.rotateRight(new int[]{1, 2, 3, 4, 5}, 4));
    assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77},
        RotatedArray.rotateRight(new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10));
    assertArrayEquals(new int[]{70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97, 33, 47},
        RotatedArray.rotateRight(new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}, 13));
    assertArrayEquals(new int[]{0}, RotatedArray.rotateRight(new int[]{0}, 2));
    assertArrayEquals(new int[]{5, 7}, RotatedArray.rotateRight(new int[]{7, 5}, 3));
  }
}