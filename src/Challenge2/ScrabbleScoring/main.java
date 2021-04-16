package Challenge2.ScrabbleScoring;

import java.util.Random;

interface Square{

    public int calculation(int score);

}

class OrdinarySquare implements Square{

    @Override
    public int calculation(int score) {
        return score;
    }
}

class DoubleLetterScore implements Square{

    @Override
    public int calculation(int score) {
        return 2*score;
    }
}

class TripleLetterScore implements Square{

    @Override
    public int calculation(int score) {
        return 3*score;
    }
}

class Client {

    public static void main (String[] args){

         Square[] square = new Square[3];

        square[0] = new OrdinarySquare();
        square[1] = new DoubleLetterScore();
        square[2] = new TripleLetterScore();

        System.out.println(totalLetterScore("HYO", square));
    }

    public static int totalLetterScore(String word, Square[] square){

        char[] wordToCharList = new char[word.length()];
        wordToCharList = word.toCharArray();

        Random random = new Random();

        int totalScore = 0;

        for(char i : wordToCharList){

            int randomInt = random.nextInt(3);
            System.out.println("randomInt is: " + randomInt);
            totalScore += letterAndSquareScore(i, square[randomInt]);

        }

        return totalScore;

    }

    public static int letterAndSquareScore(char letter, Square square){

        return square.calculation(letterScore(letter));
    }


    public static int letterScore (char letter){

        int score = 0;

        switch (letter){
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R':
                score = 1;
                break;
            case 'D', 'G':
                score = 2;
                break;
            case 'B', 'C', 'M','P':
                score = 3;
                break;
            case 'F', 'H', 'V', 'W', 'Y':
                score = 4;
                break;
            case 'k':
                score = 5;
                break;
            case 'J', 'X':
                score = 8;
                break;
            case 'Q', 'Z':
                score = 10;
                break;
        }

        return score;
    }
}
