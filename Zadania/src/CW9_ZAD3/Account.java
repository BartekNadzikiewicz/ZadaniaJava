package CW9_ZAD3;

public class Account {
    private int balance;
    private String owner, accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void transakcja(int kwota, String numberKontaDocelowego){

        try {
            if(kwota > this.getBalance()){
                throw new NotEnoughMoneyException(this.getBalance(), kwota);
            }
            else{
                System.out.println("Stonks!");
            }
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Wyjątek");
        } finally {
            System.out.println("Aktualny stan konta: " + this.getBalance());
        }

    }
}
