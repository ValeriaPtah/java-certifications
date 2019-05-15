package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.DataReformat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DateReformat {

  private static Map<String, String> months = new HashMap<>();

  /*
   * Complete the 'reformatDate' function below.
   *
   * The function is expected to return a STRING_ARRAY.
   * The function accepts STRING_ARRAY dates as parameter.
   *          20th Oct 2052 -> 2052-10-20
   */

  static List<String> reformatDate(List<String> dates) {
    initializeMonths();
    List<String> reformattedDates = new ArrayList<>();
    for (String date : dates) {
      String[] dateParsed = date.split(" ");
      String dateCombined = dateParsed[2] + "-" + months.get(dateParsed[1]) + "-" + padTheDay(dateParsed[0]);
      reformattedDates.add(dateCombined);
    }
    return reformattedDates;
  }

  private static void initializeMonths() {
    months.put("Jan", "01");
    months.put("Feb", "02");
    months.put("Mar", "03");
    months.put("Apr", "04");
    months.put("May", "05");
    months.put("Jun", "06");
    months.put("Jul", "07");
    months.put("Aug", "08");
    months.put("Sep", "09");
    months.put("Oct", "10");
    months.put("Nov", "11");
    months.put("Dec", "12");
  }

  private static String padTheDay(String dayTh) {
    StringBuilder stringBuilder = new StringBuilder();
    if (dayTh.length() == 3) {
      stringBuilder.append('0').append(dayTh.charAt(0));
    }
    else {
      stringBuilder.append(dayTh.charAt(0)).append(dayTh.charAt(1));
    }
    return stringBuilder.toString();
  }
}