package ua.ptah.certifications.hackerrank.vanhack.DigitalWallet;

class TransactionException extends RuntimeException {

  private static final long serialVersionUID = -8691913321153804071L;
  private TransactionExceptionCode errorCode;

  TransactionException(TransactionExceptionCode errorCode) {
    this.errorCode = errorCode;
  }

  String getErrorCode() {
    return this.errorCode.getErrorCode();
  }

  String getErrorMessage() {
    return this.errorCode.getErrorMessage();
  }
}