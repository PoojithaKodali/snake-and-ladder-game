package Dice;

public class Dice {
    private int diceNumber;
    public Dice(int diceNumber){
        this.diceNumber=diceNumber;
    }
    public int rollDice(){
        return((int) (Math.random()*(6*diceNumber-1*diceNumber)))+1;
    }
    public int getDice(){
        return diceNumber;
    }
    
}
class SingleDice extends Dice {
    public SingleDice() {
        super(1);
    }
    public int rollDice() {
        int countSix = ((int) (Math.random() * (6 - 1))) + 1;

        if (countSix == 6) {
            while (true) {
                countSix = 6 + ((int) (Math.random() * (6 - 1))) + 1;
                if (countSix== 12) {
                    countSix = 12 + ((int) (Math.random() * (6 - 1))) + 1;
                    if (countSix == 18) {
                        System.out.println("3 6's in row. Hard Luck!");
                        countSix = 0;
                        break;
                    } else {
                        break;
                    }

                } else {
                    break;
                }
            }
        }
        return countSix;
    }

}
