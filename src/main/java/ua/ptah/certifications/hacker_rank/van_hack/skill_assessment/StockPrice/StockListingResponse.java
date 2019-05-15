package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.StockPrice;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
final class StockListingResponse {

  private final int page;

  @SerializedName("per_page")
  private final int perPage;

  @SerializedName("total")
  private final int totalEntries;

  @SerializedName("total_pages")
  private final int totalPages;

  @SerializedName("data")
  private final List<StockPriceInfoByDate> stockInfo;
}

/*
 * date: A string that describes the date on which the stock information is provided. The date format is d-MMMM-yyyy ,
 * where d describes a valid day of the month, MMMM describes the complete name of the month (e.g. , January , February , March , etc.),
 * and yyyy describes the year. The date is in the range 5-January-2000 to 1-January-2014 inclusive.
 * There could be no information provided for some of the dates and the information is available for Monday to Friday only.
 */