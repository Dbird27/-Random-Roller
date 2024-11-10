/*
* Dylan Trent
 * Fun little idea a friend had. They wanted a die that hardly rolls low. So I made it
 */
import java.util.*;
public class RandomRoller
{
        @SuppressWarnings("ConvertToTryWithResources")
	public static void main(String[] args) {
        System.out.println("What die size would you like to use?");
        Scanner input = new Scanner(System.in);
        int dieSize=input.nextInt();
        input.nextLine();
		int roll=0;
		Random rand = new Random();
        boolean again = true;
        while(again){
            for(int i=0; i<5; i++){
                roll = rand.nextInt(dieSize);
            }
            System.out.println("Your roll: "+roll+", wish to roll again?(no to quit)");
            String response = input.nextLine();
            if("no".equalsIgnoreCase(response)){
                again=false;
            }
        }
        input.close();
    }
}