package functionality;

import services.IMettlerScale;

public class WeightFunctionality implements IWeightFunctionality {
    private IMettlerScale scale;

    public WeightFunctionality(IMettlerScale scale){
        this.scale = scale;
    }

    @Override
    public String requestInput(String msg){
        return scale.requestUserInput(msg);
    }

    @Override
    public void getConfirmation(String msg){

    }

    @Override
    public void taraWeight(){

    }

    @Override
    public String getWeight(){
        return scale.getWeight();
    }

    @Override
    public void sendMessage(String msg){

    }
}
