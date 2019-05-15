package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.DigitalWallet;

class DigitalWalletTransaction {

  DigitalWalletTransaction() {
  }

  void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
    if (amount <= 0) {
      throw new TransactionException(TransactionExceptionCode.INVALID_AMOUNT);
    }
    if (digitalWallet.getUserAccessToken() == null) {
      throw new TransactionException(TransactionExceptionCode.USER_NOT_AUTHORIZED);
    }

    digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() + amount);
  }

  void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
    if (amount <= 0) {
      throw new TransactionException(TransactionExceptionCode.INVALID_AMOUNT);
    }
    if ((digitalWallet.getWalletBalance() - amount) < 0) {
      throw new TransactionException(TransactionExceptionCode.INSUFFICIENT_BALANCE);
    }
    if (digitalWallet.getUserAccessToken() == null) {
      throw new TransactionException(TransactionExceptionCode.USER_NOT_AUTHORIZED);
    }

    digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() - amount);
  }
}