
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
        for (int i=0;i<13;i++){
            if (nextToABeeper()){
                tempCount=0;
                countSteeple();
                beeperList[i]=tempCount;
            }
        }
    }
    public void countSteeple(){
        while (nextToABeeper()){
            
        }
    }
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

