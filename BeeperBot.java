
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        move();
        for (int i=0;i<12;i++){
            tempCount=0;
            if (nextToABeeper()){
                
                countSteeple();
                beeperList[i]=tempCount;
                move();
            }
            else{
                beeperList[i]=tempCount;
                move();
            }
        }
    }
    public void countSteeple(){
        while (nextToABeeper()){
            pickBeeper();
            tempCount++;
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
        }
        turnLeft();
        turnLeft();
        turnLeft();
        while (frontIsClear()){
            move();
        }
        turnLeft();
    }
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

