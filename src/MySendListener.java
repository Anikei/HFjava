/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySendListener implements ActionListener{

    public void actionPerformed(ActionEvent a){
        boolean[] checkboxState = new boolean[256];

        for (int i = 0; i < 256; i++) {
            JCheckBox check = (JCheckBox) checkboxList.get(i);
            if (check.isSelected()){
                checkboxState[i] = true;
            }
        }

        try {
            FileOutputStream fileStream = new FileOutputStream(new File("checkbox.ser"));
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(checkboxState);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
*/