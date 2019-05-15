package ua.ptah.certifications.testdome;

class Palindrome {
  static boolean isPalindrome(String word) {
    String originalWordLowerCase = word.toLowerCase();
    StringBuilder original = new StringBuilder(originalWordLowerCase);
    StringBuilder reverse = original.reverse();
    return (reverse.toString()).equals(originalWordLowerCase);
  }
}