package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.StockPrice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * https://jsonmock.hackerrank.com/api/stocks: This query returns all available stock information.
 * The response is paginated so you may need to query https://jsonmock.hackerrank.com/api/stocks/?page=pageNumber,
 * where pageNumber is an integer that describes the page number to view (e.g., 1, 2, etc.).
 *
 * https://jsonmock.hackerrank.com/api/stocks/?key=value: This query returns all results where the searched key has exact matching value.
 * The response is paginated, so you may need to query https://jsonmock.hackerrank.com/api/stocks/?key=value&page=pageNumber,
 * where pageNumber is an integer that describes the page number to view (e.g., 1, 2, etc.).
 *
 * https://jsonmock.hackerrank.com/api/stocks/search?key=value: This query returns all the results where the searched key has values that
 * contains value as a substring. The response is paginated, so you may need to query
 * https://jsonmock.hackerrank.com/api/stocks/search?key=value&page=pageNumber, where pageNumber is an integer that
 * describes the page number to view (e.g., 1, 2, etc.).
 */

class StockOpenClosePrices {

  private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("d-MMMM-yyyy").withLocale(Locale.ENGLISH);

  static List<String> openAndClosePrices(String firstDate, String lastDate, String weekDay) {

    DayOfWeek weekDayValue = DayOfWeek.valueOf(weekDay.toUpperCase());
    List<LocalDate> relevantDates = relevantDates(firstDate, lastDate, weekDayValue);
    List<String> openAndClosePrices = new ArrayList<>();
    Gson gson = new GsonBuilder().create();
    String baseURL = "https://jsonmock.hackerrank.com/api/stocks/";

    for (LocalDate relevantDate : relevantDates) {
      try (Reader reader = new BufferedReader(new InputStreamReader(new URL(baseURL + "?date=" + relevantDate.format(DATE_PATTERN)).openStream()))) {
        List<StockPrices> stockPriceData = gson.fromJson(reader, StockListingResponse.class).getStockInfo();
        if (stockPriceData.size() > 0) {
          openAndClosePrices.add(stockPriceData.get(0).getDate() + " " + stockPriceData.get(0).getOpenPrice() + " " + stockPriceData.get(0).getClosePrice());
        }
      }
      catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return openAndClosePrices;
  }

  private static List<LocalDate> relevantDates(String firstDate, String lastDate, DayOfWeek weekDay) {
    LocalDate firstDateParsed = LocalDate.parse(firstDate, DATE_PATTERN);
    LocalDate lastDateParsed = LocalDate.parse(lastDate, DATE_PATTERN);

    List<LocalDate> relevantDates = new ArrayList<>();

    for (LocalDate date = firstDateParsed; date.isBefore(lastDateParsed); date = date.plusDays(1)) {
      if (date.getDayOfWeek() == weekDay) {
        relevantDates.add(date);
      }
    }

    return relevantDates;
  }
}