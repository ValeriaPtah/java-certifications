package ua.ptah.certifications.testdome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

  @Test
  void isPalindrome() {
    assertTrue(Palindrome.isPalindrome("Lol"));
    assertFalse(Palindrome.isPalindrome("Jupiter"));
    assertFalse(Palindrome.isPalindrome("Lola"));
  }
}