public abstract class State {

    public abstract void activate();
    public abstract void start();
    public abstract void reject();
    public abstract void cancel();
    public abstract void approved();
    public abstract void startPump();
    public abstract void pump();
    public abstract void stopPump();
    public abstract void selectGas(int g);
    public abstract void correctPin();
    public abstract void incorrectPin(int max);
    public abstract void payCash();
    public abstract void payCredit();
    public abstract void payDebit();
}

