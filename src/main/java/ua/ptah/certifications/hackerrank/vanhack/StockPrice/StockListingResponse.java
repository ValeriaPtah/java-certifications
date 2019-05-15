package ua.ptah.certifications.hackerrank.vanhack.StockPrice;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
final class StockListingResponse {

  private final int page;

  private final int perPage;

  private final int totalEntries;

  private final int totalPages;

  @SerializedName("data")
  private final List<StockPrices> stockInfo;
}

/*
 * date: A string that describes the date on which the stock information is provided. The date format is d-MMMM-yyyy ,
 * where d describes a valid day of the month, MMMM describes the complete name of the month (e.g. , January , February , March , etc.),
 * and yyyy describes the year. The date is in the range 5-January-2000 to 1-January-2014 inclusive.
 * There could be no information provided for some of the dates and the information is available for Monday to Friday only.
 */