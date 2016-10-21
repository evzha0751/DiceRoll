

package pkg161018.diceroll;
    import java.util.*;
public class DiceRoll {

    public static void main(String[] args) {
        int pointsTotal=1000,x;
        
        
        do{
            Rol rol1=new Rol(pointsTotal);
                pointsTotal=rol1.points();
                x=rol1.quit();
        }while(x!=-1);
        
    }
    
}
