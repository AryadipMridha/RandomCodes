/**
 * Welcome to the Stanford Karel IDE.
 * This is a free space for you to 
 * write any Karel program you want.
 **/
function main(){
   putBeeper();
   Diagonal();
   putBeeper();
   Diagonal();
    putBeeper();
   Diagonal();
    putBeeper();
   Diagonal();
   putBeeper();
   
   
}

function Diagonal(){
   move();
   turnLeft();
   move();
    turnLeft();
     turnLeft();
      turnLeft();
}
