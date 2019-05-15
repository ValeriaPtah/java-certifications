package ua.ptah.certifications.hacker_rank;

/*
 * Calculate how many steps needs to be taken to sort an array
 * given that you can swap any two numbers only once per step
 */

class JumpSwapSortWithCounter {

  static int minimumIndividualSwaps(int[] arr) {
    int swaps = 0;

    //bullet proof, but slow for big arrays
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] != j + 1) {
          swaps++;
          int temp = arr[j];
          arr[j] = arr[temp - 1];
          arr[temp - 1] = temp;
          break;
        }
      }
    }

    return swaps;
  }
}