package CW9_ZAD3;

public class NotEnoughMoneyException extends Exception {

    int balance, kwota;

    public NotEnoughMoneyException(int balance, int kwota) {
        this.balance = balance;
        this.kwota = kwota;
    }

    @Override
    public String toString(){
        return "Za mało kasy biedaku!";
    }
}
