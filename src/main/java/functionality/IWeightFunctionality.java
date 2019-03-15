package functionality;

// TODO: Check datatypes of methods are as we want
// TODO: Check methods parameters make sense
// Very early stage, error may... nay... WILL occur!
public interface IWeightFunctionality {
    String demandWeightInput(String msg);
    //UserDTO getUser(int userID) throws UserInputException;
    void getConfirmation(String msg);
    void taraWeight();
    String getWeight();
    void sendMessage(String msg);
}
