package GameBoard;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import Dice.Dice;
import Player.Player;
import SnakeLadder.SnakeLadder;

public class GameBoard {
    private Dice dice;
    private Queue<Player> nextPlayer;
    private List<SnakeLadder> snakes;
    private List<SnakeLadder> ladders;
    private Map<String,Integer> playersCurrentPosition;
    int sizeOfBoard;
    public GameBoard(Dice dice,Queue<Player> nextPlayer,List<SnakeLadder> snakes,List<SnakeLadder> ladders, Map<String,Integer> playersCurrentPosition,int sizeOfBoard){
        this.dice=dice;
        this.nextPlayer=nextPlayer;
        this.snakes=snakes;
        this.ladders=ladders;
        this.playersCurrentPosition=playersCurrentPosition;
        this.sizeOfBoard=sizeOfBoard;
    }
     public  void Game(){
        while(nextPlayer.size()>1){
            Player player=nextPlayer.poll();
            int currentPosition=playersCurrentPosition.get(player.getPlayerName());
            int valueOfDice=dice.rollDice();
            int nextCell=currentPosition+valueOfDice;
            if(nextCell>sizeOfBoard){
                nextPlayer.offer(player);
            }
            else if(nextCell==sizeOfBoard){
                System.out.println(player.getPlayerName()+ " congrats!!! you won the game "+nextCell);
            }
            else{
                int[] nextPosition=new int[1];
                boolean[] b=new boolean[1];
                nextPosition[0]=nextCell;
                snakes.forEach(v->{
                    if(v.start==nextCell){
                        nextPosition[0]=v.end;
                    }
                });
                if(nextPosition[0] !=nextCell){
                    System.out.println(player.getPlayerName()+" Bitten by the snake present at: "+nextCell);
                }
                ladders.forEach(v->{
                    if(v.start==nextCell){
                        nextPosition[0]=v.end;
                        b[0]=true;
                    }
                });
                if(nextPosition[0]!=nextCell && b[0]){
                    System.out.println(player.getPlayerName()+ " Got ladder prsent at: "+nextCell);
                }
                if(nextPosition[0]==sizeOfBoard){
                    System.out.println(player.getPlayerName()+ " congrats!!! you won the game "+nextCell);
                }
                else{
                    playersCurrentPosition.put(player.getPlayerName(),nextPosition[0]);
                    System.out.println(player.getPlayerName()+" is at position "+nextPosition[0]);
                    nextPlayer.offer(player);

                }

            }
        }
    }   
}
