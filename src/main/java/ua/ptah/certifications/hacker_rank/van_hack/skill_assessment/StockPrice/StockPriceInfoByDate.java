package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.StockPrice;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
final class StockPriceInfoByDate {

  private final String date;

  @SerializedName("open")
  private final float openPrice;

  @SerializedName("close")
  private final float closePrice;

  @SerializedName("high")
  private final float highPrice;

  @SerializedName("low")
  private final float lowPrice;
}

/*
 * open: A float value that describes the stock open price on the given date.
 * close: A float value that describes the stock close price on the given date.
 * high: A float value that describes the stock highest price on the given date.
 * low: A float value that describes the stock lowest price on the given date.
 */