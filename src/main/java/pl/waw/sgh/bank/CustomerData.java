package pl.waw.sgh.bank;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CustomerData {

    protected JPanel mainCustomerPanel;
    protected JFormattedTextField firstNameFormattedTextField;
    protected JTextField lastNameLabelTextField;
    protected JTextField eMailAdressLabelTextField;
    protected JTextField firstNameTextField;
    protected JButton sendButton;
    protected JButton previousButton;
    protected JButton newButton;
    protected JButton nextButton;
    protected JTextField lastNameTextField;
    protected JTextField emailTextField;
    protected JTextField customerIDtextField;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainCustomerPanel = new JPanel();
        mainCustomerPanel.setLayout(new GridLayoutManager(9, 2, new Insets(2, 1, 1, 1), -1, -1));
        mainCustomerPanel.setBackground(new Color(-5197648));
        mainCustomerPanel.setEnabled(true);
        mainCustomerPanel.setForeground(new Color(-16740463));
        mainCustomerPanel.setName("");
        mainCustomerPanel.setOpaque(true);
        mainCustomerPanel.setBorder(BorderFactory.createTitledBorder(null, "Customer Data", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, null, new Color(-16740463)));
        final Spacer spacer1 = new Spacer();
        mainCustomerPanel.add(spacer1, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        firstNameFormattedTextField = new JFormattedTextField();
        firstNameFormattedTextField.setBackground(new Color(-5197648));
        firstNameFormattedTextField.setEditable(false);
        firstNameFormattedTextField.setForeground(new Color(-16740463));
        firstNameFormattedTextField.setHorizontalAlignment(0);
        firstNameFormattedTextField.setText("First Name");
        mainCustomerPanel.add(firstNameFormattedTextField, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        lastNameLabelTextField = new JTextField();
        lastNameLabelTextField.setBackground(new Color(-5197648));
        lastNameLabelTextField.setEditable(false);
        lastNameLabelTextField.setForeground(new Color(-16740463));
        lastNameLabelTextField.setHorizontalAlignment(0);
        lastNameLabelTextField.setText("Last Name");
        mainCustomerPanel.add(lastNameLabelTextField, new GridConstraints(4, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        eMailAdressLabelTextField = new JTextField();
        eMailAdressLabelTextField.setBackground(new Color(-5131855));
        eMailAdressLabelTextField.setEditable(false);
        eMailAdressLabelTextField.setForeground(new Color(-16740463));
        eMailAdressLabelTextField.setText("E-mail Adress");
        mainCustomerPanel.add(eMailAdressLabelTextField, new GridConstraints(6, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        firstNameTextField = new JTextField();
        firstNameTextField.setBackground(new Color(-16740463));
        firstNameTextField.setForeground(new Color(-5131855));
        firstNameTextField.setHorizontalAlignment(0);
        firstNameTextField.setText("...");
        mainCustomerPanel.add(firstNameTextField, new GridConstraints(3, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        lastNameTextField = new JTextField();
        lastNameTextField.setBackground(new Color(-16740463));
        lastNameTextField.setForeground(new Color(-5131855));
        lastNameTextField.setHorizontalAlignment(0);
        lastNameTextField.setText("...");
        mainCustomerPanel.add(lastNameTextField, new GridConstraints(5, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        emailTextField = new JTextField();
        emailTextField.setBackground(new Color(-16740463));
        emailTextField.setForeground(new Color(-5131855));
        emailTextField.setHorizontalAlignment(0);
        emailTextField.setText("...");
        mainCustomerPanel.add(emailTextField, new GridConstraints(7, 0, 1, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainCustomerPanel.add(panel1, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        sendButton = new JButton();
        sendButton.setBackground(new Color(-5131855));
        sendButton.setBorderPainted(false);
        sendButton.setForeground(new Color(-16740463));
        sendButton.setHideActionText(true);
        sendButton.setHorizontalTextPosition(0);
        sendButton.setInheritsPopupMenu(false);
        sendButton.setSelected(false);
        sendButton.setText("Send");
        panel1.add(sendButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, 40), null, 0, false));
        previousButton = new JButton();
        previousButton.setBackground(new Color(-5131855));
        previousButton.setBorderPainted(false);
        previousButton.setForeground(new Color(-16740463));
        previousButton.setHideActionText(true);
        previousButton.setHorizontalTextPosition(0);
        previousButton.setInheritsPopupMenu(false);
        previousButton.setSelected(false);
        previousButton.setText("Previous");
        panel1.add(previousButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, 40), null, 0, false));
        newButton = new JButton();
        newButton.setText("New");
        panel1.add(newButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nextButton = new JButton();
        nextButton.setText("Next");
        panel1.add(nextButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        customerIDtextField = new JTextField();
        customerIDtextField.setEditable(false);
        customerIDtextField.setEnabled(false);
        mainCustomerPanel.add(customerIDtextField, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainCustomerPanel;
    }

}
