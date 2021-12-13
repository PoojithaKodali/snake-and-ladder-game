# snake-and-ladder-game
![snake ladder photo](https://user-images.githubusercontent.com/72956653/145752113-0bae8d85-47a8-43a5-af88-8578d2762730.jpg)
## Design of snake and ladder game
##### The game board should have the size of nxn
##### n should be taken from the user as input
##### It should have m snakes and k ladders
##### Each ladder will have a start position and an ending position at an larger number
##### Each snake will have a start position and an ending position at an smaller number
##### There can be multiple players in the game
##### There can be any number of dice based on the user input

## Rules
##### The board has numbers from 1 to n^2.
#####  The players will make there move turn-by-turn.
#####  The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
#####  Each player has a piece which is initially kept outside the board (i.e., at position 0).
#####  Each player rolls the dice when their turn comes.
#####  Based on the dice value, the player moves their piece forward that number of cells. Ex: If the dice value is 4 and the player is at position 7, the player will move to position 11 (7+4).
#####  A player wins if he reached the last cell in the board.
#####  Whenever a player ends up at a cell with the head of the snake, the player should go down to the cell that has the tail of that snake.
#####  Whenever a player ends up at a cell with the start of the ladder, the player should go up to the cell that has the end of that ladder.
#####  The game should continue till there are at least 2 players still playing to win.
#####  After the dice roll, if a piece is supposed to move outside position 100, it does not move.
#####  Snakes and Ladders do not create a cycle.
