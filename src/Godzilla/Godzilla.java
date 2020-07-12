package Godzilla;

public class Godzilla {
    private int stomachCapacity = 100;
    private int stomachCapacityManipulative = 100;
    private int someVolume;



    public int getStomachCapacityManipulative() {
        return stomachCapacityManipulative;
    }

    public void eat(int someVolume) {
        if (someVolume > 10) {
            System.out.println("too much food, can't eat it");
        } else if ((stomachCapacityManipulative - someVolume) < 10) {
            System.out.println("stomach full, try less please");
        } else {
            System.out.println("Om-nom-nom: " + someVolume);
            stomachCapacityManipulative -= someVolume;
        }
    }

    public boolean isFull(){
      if( stomachCapacityManipulative > (0.1 * stomachCapacity)){
          return false;
      }
      return true;
    }
}
