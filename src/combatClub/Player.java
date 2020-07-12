package combatClub;



public class Player {
    private final int HP = 100;
    private enum Protect{BLOCK_HEAD, BLOCK_LEGS}
    private  enum Attack{HIGH_KICK, LOW_KICK}

    private int currentHP;
    private String name;
    private boolean isAlive = true;
    private Protect blockAction;
    private Attack attackAction;

    public Player(String name) {
        this.name = name;
        currentHP = HP;
    }

    public String getName() {
        return name;
    }

    public void highKick(){
        attackAction = Attack.HIGH_KICK;
    }

    public void lowKick(){
        attackAction = Attack.LOW_KICK;

    }

    public void blockLegs(){
        blockAction = Protect.BLOCK_LEGS;
    }

    public void blockHead(){
        blockAction = Protect.BLOCK_HEAD;
    }

    public void fight(Player enemy){
        if (enemy.attackAction == Attack.HIGH_KICK){

            if (blockAction == Protect.BLOCK_HEAD){
                currentHP -= 5;
            }
            if (blockAction == Protect.BLOCK_LEGS){
                currentHP -= 20;
            }
        }

        if (enemy.attackAction == Attack.LOW_KICK){

            if (blockAction == Protect.BLOCK_HEAD) {
                currentHP -= 10;
            }

            if (blockAction == Protect.BLOCK_LEGS){
                currentHP -= 2;
            }
        }

        if (currentHP <= 0){
            isAlive = false;
        }
    }

    public void reportHealth(){
        System.out.println(name + ": " + currentHP);
         if (currentHP > 0.5 * HP ){
             System.out.println("Sparta!");
         }else if (currentHP < HP/3 && currentHP > currentHP/4){
             System.out.println("minor injury");
         }
         else if (currentHP < HP/4 && currentHP > HP/5){
             System.out.println("major injury");
         }
         else if (currentHP < HP/5 && currentHP > 0 ){
             System.out.println("critical injury");
         }
         else if (currentHP <= 0){
             System.out.println("you are died");
         }
        System.out.println();
    }

    public boolean isAlive(){
        return isAlive;
    }
}
