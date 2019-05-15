package ua.ptah.certifications.hacker_rank.van_hack.skill_assessment.DigitalWallet;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitalWalletTransactionTest {
  private static final List<DigitalWallet> DIGITAL_WALLETS = new ArrayList<>();
  private static final DigitalWalletTransaction transaction = new DigitalWalletTransaction();

  @BeforeAll
  static void instantiate() {
    DIGITAL_WALLETS.add(new DigitalWallet("1", "Julia", "bff834a2c117a76d9ceb782f98e428686ca3c4ea"));
    DIGITAL_WALLETS.add(new DigitalWallet("2", "Samantha"));
  }

  @Test
  void transactionTest() {
//    1 pay 50
    TransactionException exBalance = assertThrows(TransactionException.class, () -> transaction.payMoney(DIGITAL_WALLETS.get(0), 50));
    assertEquals(TransactionExceptionCode.INSUFFICIENT_BALANCE.getErrorMessage(), exBalance.getErrorMessage());

//    1 add 100
    transaction.addMoney(DIGITAL_WALLETS.get(0), 100);
    assertEquals(100, DIGITAL_WALLETS.get(0).getWalletBalance());

//    1 add 0
    TransactionException exAmountZero = assertThrows(TransactionException.class, () -> transaction.addMoney(DIGITAL_WALLETS.get(0), 0));
    assertEquals(TransactionExceptionCode.INVALID_AMOUNT.getErrorMessage(), exAmountZero.getErrorMessage());

//    1 pay 30
    transaction.payMoney(DIGITAL_WALLETS.get(0), 30);
    assertEquals(70, DIGITAL_WALLETS.get(0).getWalletBalance());

//    2 add 500
    TransactionException exUser = assertThrows(TransactionException.class, () -> transaction.addMoney(DIGITAL_WALLETS.get(1), 500));
    assertEquals(TransactionExceptionCode.USER_NOT_AUTHORIZED.getErrorMessage(), exUser.getErrorMessage());

//    1 add -5
    TransactionException exAddAmountMinus = assertThrows(TransactionException.class, () -> transaction.addMoney(DIGITAL_WALLETS.get(0), -5));
    assertEquals(TransactionExceptionCode.INVALID_AMOUNT.getErrorMessage(), exAddAmountMinus.getErrorMessage());

//    1 add 1000
    transaction.addMoney(DIGITAL_WALLETS.get(0), 1000);
    assertEquals(1070, DIGITAL_WALLETS.get(0).getWalletBalance());

//    1 pay -20
    TransactionException exPayAmountMinus = assertThrows(TransactionException.class, () -> transaction.payMoney(DIGITAL_WALLETS.get(0), -5));
    assertEquals(TransactionExceptionCode.INVALID_AMOUNT.getErrorMessage(), exPayAmountMinus.getErrorMessage());

    assertEquals(1070, DIGITAL_WALLETS.get(0).getWalletBalance());
    assertEquals(0, DIGITAL_WALLETS.get(1).getWalletBalance());

  }
}