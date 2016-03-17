public class PhraseOmatic {
    public static String makePhrase() {
        String[] wordListOne = {"24-hour", "frontend"};
        String[] wordListTwo = {"hard", "oriented"};
        String[] wordListThree = {"process", "structure"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        return ("all we need is " + phrase);
    }
}
