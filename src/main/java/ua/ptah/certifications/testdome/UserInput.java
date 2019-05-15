package ua.ptah.certifications.testdome;

import static java.lang.Character.isDigit;

/*
 * implement ADD method that only add a char if it's a number
 */

class UserInput {

  static class TextInput {
    private String value = "";

    void add(char chValue) {
      value += chValue;
    }

    String getValue() {
      return value;
    }
  }

  static class NumericInput extends TextInput {

    @Override
    void add(char chValue) {
      if (isDigit(chValue)) {
        super.add(chValue);
      }
    }
  }
}