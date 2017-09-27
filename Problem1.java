
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends BeeperBot
{
    int[] stackList = new int[8];
    int[] sortedList = new int[8];
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void sortBeepers() {
        collectBeepers();
        returnToStart();
        sortStacks();
        //putStacks();
        printSortedList();
    }
    public void printSortedList(){
        System.out.println();
        for(int value: sortedList){
            System.out.print(value+" , ");
        }
        System.out.println();
        }
    
    public void putStacks(){
        move();
        for (int k=0; k<8;k++){
            for (int i=0; i<sortedList[k];i++){
            putBeeper();
            turnRight();
            move();
            turnLeft();
           }
           turnLeft();
           while (frontIsClear()){
               move();
           }
           turnRight();
           if (frontIsClear()){
               move();
           }
        }
    }
    public void sortStacks(){
        for (int i=0;i<8;i++){
            if (i==0){
                if (stackList[0]<stackList[1]){
                    sortedList[i]=stackList[0];
                }
                else{
                    sortedList[i]=stackList[1];
                }
                if (stackList[2]<sortedList[i]){
                    sortedList[i]=stackList[2];
                }
                if (stackList[3]<sortedList[i]){
                    sortedList[i]=stackList[3];
                }
                if (stackList[4]<sortedList[i]){
                    sortedList[i]=stackList[4];
                }
                if (stackList[5]<sortedList[i]){
                    sortedList[i]=stackList[5];
                }
                if (stackList[6]<sortedList[i]){
                    sortedList[i]=stackList[6];
                }
                if (stackList[7]<sortedList[i]){
                    sortedList[i]=stackList[7];
                }
                
            }
            if (0<i){
                if (sortedList[i-1]<stackList[0] && stackList[0]<stackList[1]){
                    sortedList[i]=stackList[0];
                }
                else if (sortedList[i-1]<stackList[1] && stackList[1]<stackList[0]){
                    sortedList[i]=stackList[1];
                }
                if (sortedList[i-1]<stackList[2] && stackList[2]<sortedList[i]){
                    sortedList[i]=stackList[2];
                }
                if (sortedList[i-1]<stackList[3] && stackList[3]<sortedList[i]){
                    sortedList[i]=stackList[3];
                }
                if (sortedList[i-1]<stackList[4] && stackList[4]<sortedList[i]){
                    sortedList[i]=stackList[4];
                }
                if (sortedList[i-1]<stackList[5] && stackList[5]<sortedList[i]){
                    sortedList[i]=stackList[5];
                }
                if (sortedList[i-1]<stackList[6] && stackList[6]<sortedList[i]){
                    sortedList[i]=stackList[6];
                }
                if (sortedList[i-1]<stackList[7] && stackList[7]<sortedList[i]){
                    sortedList[i]=stackList[7];
                }
                
            }
        }
    }
    public void returnToStart(){
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void collectBeepers(){
        move();
        for (int i=0;i<8;i++){
            tempCount=0;
            if (nextToABeeper()){
                
                countSteepleWest();
                stackList[i]=tempCount;
                if (frontIsClear()){
                    move();
                }
            }
            else{
                stackList[i]=tempCount;
                if (frontIsClear()){
                    move();
                }
            }
        }
    }
    public void countSteepleWest(){
        while (nextToABeeper()){
            pickBeeper();
            tempCount++;
            turnRight();
            move();
            turnLeft();
            
        }
        turnLeft();
        
        while (frontIsClear()){
            move();
        }
        turnRight();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

