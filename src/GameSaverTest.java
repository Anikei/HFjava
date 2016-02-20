import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "elf", new String[] {"bow", "sword", "knuckle"});
        GameCharacter two = new GameCharacter(200, "troll", new String[] {"hands", "big axe"});
        GameCharacter three = new GameCharacter(50, "magicka", new String[] {"spell", "stealth"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("type of first: " + oneRestore.getType());
            System.out.println("type of second: " + twoRestore.getType());
            System.out.println("type of third: " + threeRestore.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}