package week8.laba38;

public class AccountManager extends Account {

    public AccountManager(int amount) {
        super(amount);
    }

    public static boolean transfer(Account[] accounts, int[] delta) {
        for (int i = 0; i < accounts.length; i++) {
            try {
                accounts[i].change(delta[i]);
            } catch (TryAgainException e) {
                e.getMessage();
                i--;
            } catch (BlockAccountException e) {
                e.getMessage();
                for (int j = 0; j < i; j++) {
                    accounts[j].amount -= delta[j];
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public void change(int delta) throws TryAgainException, BlockAccountException {
        amount += delta;
    }
}

