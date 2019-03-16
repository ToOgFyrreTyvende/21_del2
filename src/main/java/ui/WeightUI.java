package ui;

import functionality.IUserFunctionality;

public class WeightUI implements IUI {
    private IUserFunctionality func;

    // TODO: Will be VERY 'barebones' until func layer is fleshed out
    public WeightUI(IUserFunctionality func){
        this.func = func;
    }

    @Override
    public void showMenu(){

    }
}
