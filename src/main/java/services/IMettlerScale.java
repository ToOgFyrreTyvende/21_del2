package services;

public interface IMettlerScale {
    String requestUserInput(String text);
    String awaitConfirmation(String text);
    String tareWeight(String text);

}