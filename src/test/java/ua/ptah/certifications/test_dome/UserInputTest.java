package ua.ptah.certifications.test_dome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInputTest {

  @Test
  void addTest() {
    UserInput.TextInput input = new UserInput.NumericInput();
    input.add('1');
    input.add('a');
    input.add('0');
    assertEquals("10", input.getValue());
  }
}