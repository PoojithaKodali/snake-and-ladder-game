import java.util.*;
import Dice.Dice;
import Player.Player;
import SnakeLadder.SnakeLadder;
import GameBoard.GameBoard;
public class DriverClass {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of board");
            int sizeOfBoard=sc.nextInt();
            System.out.println("Enter the number of Dice");
            Dice dice=new Dice(sc.nextInt());
            System.out.println("Enter no of Players");
            int nplayers=sc.nextInt();
            Queue<Player> allPlayers=new LinkedList<>();
            Map<String,Integer> playersCurrentPosition=new HashMap<>();
            for(int i=0;i<nplayers;i++){
                System.out.println("Enter "+(i+1)+" player name");
                String playerName=sc.next();
                System.out.println("Enter Id");
                int playerId=sc.nextInt();
                Player p1=new Player(playerName,playerId);
                playersCurrentPosition.put(playerName,0);
                allPlayers.offer(p1);
            }
            System.out.println("No of snakes");
            int noOfSnakes=sc.nextInt();
            List<SnakeLadder> snakes=new ArrayList<SnakeLadder>();
            for(int i=0;i<noOfSnakes;i++){
                System.out.println("Enter the start,end for snake "+i);
                System.out.println("Enter Start Position");
                int startSnake=sc.nextInt();
                System.out.println("Enter End Position");
                int endSnake=sc.nextInt();
                SnakeLadder snake1=new SnakeLadder(startSnake,endSnake);
                snakes.add(snake1);
            }
            System.out.println("No of Ladders");
            int noOfLadders=sc.nextInt();
            List<SnakeLadder> ladders=new ArrayList<SnakeLadder>();
            for(int i=0;i<noOfLadders;i++){
                System.out.println("Enter the start,end for ladder "+i);
                System.out.println("Enter Start Position");
                int startLadder=sc.nextInt();
                System.out.println("Enter End Position");
                int endLadder=sc.nextInt();
                SnakeLadder ladder1=new SnakeLadder(startLadder,endLadder);
                ladders.add(ladder1);
            }
            GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,sizeOfBoard);
            gb.Game();
        }

    }
}
