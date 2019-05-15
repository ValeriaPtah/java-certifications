package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.StockPrice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockOpenClosePricesTest {

  @Test
  void openAndClosePricesTest() {
    List<String> testPrices = Arrays.asList("17-January-2000 5617.7 5404.07", "31-January-2000 5338.67 5205.29",
        "7-February-2000 5431.55 5474.0", "14-February-2000 6130.23 5924.31", "21-February-2000 5874.25 5876.89");
    List<String> empty = Collections.emptyList();

    assertEquals(testPrices, StockOpenClosePrices.openAndClosePrices("1-January-2000", "22-February-2000", "Monday"));
    assertEquals(empty, StockOpenClosePrices.openAndClosePrices("2-January-2000", "2-January-2000", "Friday"));
  }
}