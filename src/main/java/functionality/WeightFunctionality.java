package functionality;

import services.MettlerScale;

public class WeightFunctionality implements IWeightFunctionality{
    private MettlerScale scale;

    public WeightFunctionality(MettlerScale scale) {
        this.scale = scale;
    }

    @Override
    public String demandWeightInput(String msg) {
        return scale.requestUserInput(msg);
    }

    @Override
    public void getConfirmation(String msg) {

    }

    @Override
    public void taraWeight() {

    }

    @Override
    public String getWeight() {
        return scale.getWeight();
    }

    @Override
    public void sendMessage(String msg) {

    }
}
