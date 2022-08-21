import java.util.Random;
import java.util.Scanner;


class guessNumber{
    private int noOfGuess=0;
    private int myGuess;
    private boolean check=false;

    public guessNumber(){
        Random rand =new Random();
        myGuess=rand.nextInt(100);
        while (this.check==false){
            this.isCorrect();
        }
    }

    public int takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int inp=sc.nextInt();
        return inp;
    }

    public void isCorrect(){
        int user = this.takeUserInput();
        if (user==myGuess){
            System.out.println("congratulations you guess it right");
            noOfGuess+=1;
            check = true;

        }
        else if(user>this.myGuess){
            System.out.println("your no is greater");
            noOfGuess+=1;
            check = false;
        }
        else{
            System.out.println("your no is smaller");
            noOfGuess+=1;
            check=false;
        }
    }

    public int getNoOfGuess(){
        return this.noOfGuess;
    }

}


public class practice24 {

    public static void main(String[] args) {
        guessNumber game =new guessNumber();
        System.out.format("you guess it in %d chance",game.getNoOfGuess());



    }

}
