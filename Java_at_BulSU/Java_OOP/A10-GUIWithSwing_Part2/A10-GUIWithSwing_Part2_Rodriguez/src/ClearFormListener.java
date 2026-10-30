import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClearFormListener implements ActionListener {
    private JTextField taskName;
    private JTextField dueDate;
    private JPasswordField accessCode;
    private JTextArea notes;
    private JRadioButton personalRadio;
    private JCheckBox notifyBox;
    private JCheckBox repeatBox;

    public ClearFormListener(JTextField taskName, JTextField dueDate, JPasswordField accessCode,
                             JTextArea notes, JRadioButton personalRadio,
                             JCheckBox notifyBox, JCheckBox repeatBox) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.accessCode = accessCode;
        this.notes = notes;
        this.personalRadio = personalRadio;
        this.notifyBox = notifyBox;
        this.repeatBox = repeatBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        taskName.setText("");
        dueDate.setText("");
        accessCode.setText("");
        notes.setText("Add something to remember dito...");
        personalRadio.setSelected(true);
        notifyBox.setSelected(false);
        repeatBox.setSelected(false);
    }
}