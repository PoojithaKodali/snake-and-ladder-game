package Player;

public class Player {
        private String playerName;
        private int id;
        public Player(String playerName,int id){
            this.playerName=playerName;
            this.id=id;
    
        }
        public String getPlayerName(){
            return playerName;
        }
        public int getid(){
            return id;
        }
        public void setPlayerName(String newName){
            this.playerName=newName;
        }
        public void setId(int newId){
            this.id=newId;
        }
        
    
}

