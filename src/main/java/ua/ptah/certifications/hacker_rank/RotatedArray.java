package ua.ptah.certifications.hacker_rank;

/*
 * Given an INIT_ARRAY, return initial array turned left ROTATION_INDEX times as if it was a circled array
 */

class RotatedArray {

  static int[] rotLeft(int[] initArray, int rotationIndex) {
    int realRotationIndex = rotationIndex % initArray.length;
    int[] rotated = new int[initArray.length];
    System.arraycopy(initArray, realRotationIndex, rotated, 0, initArray.length - realRotationIndex);
    System.arraycopy(initArray, 0, rotated, initArray.length - realRotationIndex, realRotationIndex);
    return rotated;
  }
}