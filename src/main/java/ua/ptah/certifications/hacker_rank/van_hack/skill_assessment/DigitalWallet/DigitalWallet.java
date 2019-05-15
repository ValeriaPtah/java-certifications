package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.DigitalWallet;

class DigitalWallet {
  private String walletId, userName, userAccessCode;
  private int walletBalance = 0;

  DigitalWallet(String walletId, String userName) {
    this.walletId = walletId;
    this.userName = userName;
  }

  DigitalWallet(String walletId, String userName, String userAccessCode) {
    this(walletId, userName);
    this.userAccessCode = userAccessCode;
  }

  String getWalletId() {
    return walletId;
  }

  String getUsername() {
    return userName;
  }

  String getUserAccessToken() {
    return userAccessCode;
  }

  int getWalletBalance() {
    return walletBalance;
  }

  void setWalletBalance(int walletBalance) {
    this.walletBalance = walletBalance;
  }
}