package ui;

import functionality.IUserFunctionality;
import functionality.IWeightFunctionality;

import java.util.Scanner;

public class WeightUI implements IUI {
    private IWeightFunctionality wFunc;
    private IUserFunctionality uFunc; // Might be useful in later assignments
    private Scanner scan;

    // TODO: Will be VERY 'barebones' until func layer is fleshed out
    // TODO: implement check for users
    public WeightUI(IWeightFunctionality wFunc){
        this.wFunc = wFunc;
    }

    @Override
    public void showMenu(){
        while (true){
            scan = new Scanner(System.in);
            System.out.println("Trin 1:");
            System.out.println("Vægten beder om, at der indtastes operatørnummer.");
            String opNumStr = wFunc.requestInput("Indtast operatørnummer:");
            System.out.println("Trin 2:");
            System.out.println("Operatør indtaster brugernummer:");
            System.out.println("Indtastet data:" + opNumStr);
            int opNum = 0;
            try{
                opNum = Integer.parseInt(opNumStr);
            } catch (NumberFormatException e){
                System.out.println("Ugyldigt tal: " + opNumStr);
                System.out.println("Tryk enter for at starte forfra...");
                scan.next();
                showMenu();
                break;
            }

            System.out.println("Trin 3:");
            System.out.println("Operatørens navn findes i databasen og vises på vægten:");
            if (opNum == 12){
                System.out.println("Bruger fundet: Anders And");
                System.out.println("Trin 4:");
                System.out.println("Operatøren kvitterer for at navnet er korrekt");
                wFunc.getConfirmation("Bruger fundet: Anders And, tryk ok.");
            } else {
                System.out.println("Ingen bruger fundet med nummer: " + opNumStr);
                System.out.println("Tryk enter for at starte forfra...");
                scan.next();
                showMenu();
                break;
            }

            System.out.println("Trin 5:");
            System.out.println("Vægten beder om, at der indtastes batch nummer:");
            String batchNumStr = wFunc.requestInput("Indtast batch nummer");
            System.out.println("Trin 6:");
            System.out.println("Operatør indtaster batch nummer:");
            System.out.println("Indtastet data:" + batchNumStr);
            int batchNum = 0;
            try{
                batchNum = Integer.parseInt(batchNumStr);
            } catch (NumberFormatException e){
            }

            System.out.println("Trin 7:");
            System.out.println("Operatøren instrueres om, at vægten skal være ubelastet:");
            wFunc.getConfirmation("Sørg for vægt er ubelastet, tryk ok");
            System.out.println("Trin 8: Operatør kvitterer");

            System.out.println("Trin 9: Vægten tareres");
            wFunc.taraWeight();

            System.out.println("Trin 10:");
            System.out.println("Operatøren instrueres om, at placere tara på vægten:");
            wFunc.getConfirmation("Placer tom beholder på vægt, tryk ok");
        }


    }
}
