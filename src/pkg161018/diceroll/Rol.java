
package pkg161018.diceroll;
    import java.util.*;
public class Rol {
    private int number,x,random,call;
    Scanner input=new Scanner(System.in);
    
    /**
     * Do the roll game and decrease or increase the score 
     *  pre: The total score
     *  post: The score after the score has been decrease or increase
     */
    public Rol(int num){
        System.out.println("You have "+num+" points."
                + "\nHow many points do you want to risk?(-1 to quit)");
        
        x=Integer.parseInt(input.next());
        if(x!=(-1)){
            System.out.println("Make a call( 0 for low. 1 for high:");
            call=Integer.parseInt(input.next());
            random=(int)(Math.random()*10+2);
            if(call==0){
                if(random<7){
                    number=num+x;
                }else{
                    number=num-x;
                }
                System.out.println("You rolled: "+random);
            }else if(call==1){
                if(random>7){
                    number=num+x;
                }else{
                    number=num-x;
                }
                System.out.println("You rolled: "+random);
            }
        }else if(x==(-1)){
            
        }
    }
    
    /**
     * Return the score 
     * pre: none
     * post: return the value of score back to the main class
     */
    public int points(){
        return(number);
    }
    
    /**
     * Return the value of x
     * pre: none
     * post: return the call of player
     * if x=-1 the game will end
     */
    public int quit(){
        return(x);
    }
}
