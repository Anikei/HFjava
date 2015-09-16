/**
 * Created by u43 on 15.09.15.
 */
import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We get synthesator");
        } catch(MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
