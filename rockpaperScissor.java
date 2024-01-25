import java.util.Scanner;
public class rockpaperScissor {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char rock = 'R';
    char paper = 'P';
    char scissor = 'S';
    char character1, character2;
    System.out.print("Player 1 enter a move(R, S or P): ");
    character1 = input.next().charAt(0);
    System.out.print("Player 2 enter a move(R, S or P): ");
    character2 = input.next().charAt(0);
    if(character1 == character2){
        System.out.println("It's a Tie!");
    }else if(character1 == 'R' && character2 == 'S'){
        System.out.println("Player 1 Wins!");
    }else if(character1 == 'R' && character2 == 'P'){
        System.out.println("Player 2 Wins!");
    }else if(character1 == 'S' && character2 == 'P'){
        System.out.println("Player 1 Wins!");
    }else if(character2 == 'R' && character1 == 'S'){
        System.out.println("Player 2 Wins!");
    }else if(character2 == 'R' && character1 == 'P'){
        System.out.println("Player 1 Wins!");
    }else if(character2 == 'S' && character1 == 'P'){
        System.out.println("Player 2 Wins!");
    }
}
}