public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"agnostic", "opinionated","voice activated", "extensible", "functional" };
        String[] wordListTwo = {"six sigma", "cloud native", "event driven", "pub-sub", "service oriented"};
        String[] wordListThree = {"framework", "library", "pipeline", "architecture", "perspective"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
