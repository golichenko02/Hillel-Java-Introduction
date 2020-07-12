package combatClub;

import java.util.Random;

public class CombatClub {
    public static void main(String[] args) {
        Player chak = new Player("Chak");
        Player brus = new Player("Brus");

        do {
            if (rnd() == 0){
                chak.lowKick();
            }else {
                chak.highKick();
            }

            if(rnd() == 0){
                brus.lowKick();
            }else {
                brus.highKick();
            }

            if (rnd() == 1){
                brus.blockLegs();
            }else{
                brus.blockHead();
            }
            chak.fight(brus);
            brus.fight(chak);

            chak.reportHealth();
            brus.reportHealth();

        }while (chak.isAlive() && brus.isAlive());

        printWinner(chak, brus);
    }

    public static int rnd(){
        return new Random().nextInt(2);
    }

    public  static void printWinner(Player p1,Player p2){
        if(p1.isAlive() && p2.isAlive()){
            System.out.println("No winner");
            return;
        }

        if (p1.isAlive()){
            p1.getName();
            System.out.println(p1.getName() + " winner");
        }
        else{
            System.out.println(p2.getName() + " winner");
        }
    }
}
