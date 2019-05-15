package ua.ptah.certifications.hacker_rank;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresentNumberTest {

  @Test
  void isNumberPresentCheckTest() {
    assertTrue(PresentNumber.isNumberPresent(Arrays.asList(1, 2, 6, 8, 2, 8), 6));
    assertFalse(PresentNumber.isNumberPresent(Arrays.asList(1, 2, 6, 8, 2, 8), 10));
    assertFalse(PresentNumber.isNumberPresent(Collections.emptyList(), -1));
  }
}