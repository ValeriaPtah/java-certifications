package ua.ptah.certifications.hacker_rank;

/*
 * Given an INIT_ARRAY, return initial array turned left and right ROTATION_INDEX times as if it was a circled array
 */

class RotatedArray {

  static int[] rotateLeft(int[] initArray, int rotationIndex) {
    int realRotationIndex = rotationIndex % initArray.length;
    int[] rotated = new int[initArray.length];
    System.arraycopy(initArray, realRotationIndex, rotated, 0, initArray.length - realRotationIndex);
    System.arraycopy(initArray, 0, rotated, initArray.length - realRotationIndex, realRotationIndex);
    return rotated;
  }

  static int[] rotateRight(int[] initArray, int rotationIndex) {
    int realRotationIndex = rotationIndex % initArray.length;
    int[] rotated = new int[initArray.length];
//    System.arraycopy(initArray, 0, rotated, initArray.length - realRotationIndex, realRotationIndex);
//    System.arraycopy(initArray, realRotationIndex, rotated, 0, initArray.length - realRotationIndex);
    System.arraycopy(initArray, initArray.length - realRotationIndex, rotated, 0, realRotationIndex);
    System.arraycopy(initArray, 0, rotated, realRotationIndex, initArray.length - realRotationIndex);
    return rotated;
  }
}