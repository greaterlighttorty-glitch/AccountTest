import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void checkBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());

    }

    @Test
    public void deposit5k_toBalance(){
    Account account = new Account();
    assertEquals(0, account.getBalance());
    account.deposit(5_000);
    assertEquals(5_000,account.getBalance());
    }

    @Test
    public void withdrawing3k_fromBalanceFromAccountAndGetting2k(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());
        account.withdrawal(3_000);
        assertEquals(2_000, account.getBalance());
    }



}
