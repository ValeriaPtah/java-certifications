package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.DigitalWallet;

enum TransactionExceptionCode {

  USER_NOT_AUTHORIZED("User not authorized", "USER_NOT_AUTHORIZED"),
  INVALID_AMOUNT("Amount should be greater than zero", "INVALID_AMOUNT"),
  INSUFFICIENT_BALANCE("Insufficient balance", "INSUFFICIENT_BALANCE");

  private final String errorCode;
  private final String errorMessage;

  TransactionExceptionCode(String errorMessage, String errorCode) {
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }
}