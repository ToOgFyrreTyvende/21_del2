package services;

public interface IMettlerScale {
    String requestUserInput(String text);
    boolean awaitConfirmation(String text);
    String taraWeight(String text);
    String getWeight();
    boolean isConnected();
}
