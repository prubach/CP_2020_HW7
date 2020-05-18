package pl.waw.sgh.bank;

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
        mainCustomerPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 2, new Insets(2, 1, 1, 1), -1, -1));
        mainCustomerPanel.setBackground(new Color(-5197648));
        mainCustomerPanel.setEnabled(true);
        mainCustomerPanel.setForeground(new Color(-16740463));
        mainCustomerPanel.setName("");
        mainCustomerPanel.setOpaque(true);
        mainCustomerPanel.setBorder(BorderFactory.createTitledBorder(null, "Customer Data", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Courier New", Font.BOLD, 36, mainCustomerPanel.getFont()), new Color(-16740463)));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        mainCustomerPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        firstNameFormattedTextField = new JFormattedTextField();
        firstNameFormattedTextField.setBackground(new Color(-5197648));
        firstNameFormattedTextField.setEditable(false);
        Font firstNameFormattedTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, firstNameFormattedTextField.getFont());
        if (firstNameFormattedTextFieldFont != null)
            firstNameFormattedTextField.setFont(firstNameFormattedTextFieldFont);
        firstNameFormattedTextField.setForeground(new Color(-16740463));
        firstNameFormattedTextField.setHorizontalAlignment(0);
        firstNameFormattedTextField.setText("First Name");
        mainCustomerPanel.add(firstNameFormattedTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        lastNameLabelTextField = new JTextField();
        lastNameLabelTextField.setBackground(new Color(-5197648));
        lastNameLabelTextField.setEditable(false);
        Font lastNameLabelTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, lastNameLabelTextField.getFont());
        if (lastNameLabelTextFieldFont != null) lastNameLabelTextField.setFont(lastNameLabelTextFieldFont);
        lastNameLabelTextField.setForeground(new Color(-16740463));
        lastNameLabelTextField.setHorizontalAlignment(0);
        lastNameLabelTextField.setText("Last Name");
        mainCustomerPanel.add(lastNameLabelTextField, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        eMailAdressLabelTextField = new JTextField();
        eMailAdressLabelTextField.setBackground(new Color(-5131855));
        eMailAdressLabelTextField.setEditable(false);
        Font eMailAdressLabelTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, eMailAdressLabelTextField.getFont());
        if (eMailAdressLabelTextFieldFont != null) eMailAdressLabelTextField.setFont(eMailAdressLabelTextFieldFont);
        eMailAdressLabelTextField.setForeground(new Color(-16740463));
        eMailAdressLabelTextField.setText("E-mail Adress");
        mainCustomerPanel.add(eMailAdressLabelTextField, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        firstNameTextField = new JTextField();
        firstNameTextField.setBackground(new Color(-16740463));
        Font firstNameTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, firstNameTextField.getFont());
        if (firstNameTextFieldFont != null) firstNameTextField.setFont(firstNameTextFieldFont);
        firstNameTextField.setForeground(new Color(-5131855));
        firstNameTextField.setHorizontalAlignment(0);
        firstNameTextField.setText("...");
        mainCustomerPanel.add(firstNameTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        lastNameTextField = new JTextField();
        lastNameTextField.setBackground(new Color(-16740463));
        Font lastNameTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, lastNameTextField.getFont());
        if (lastNameTextFieldFont != null) lastNameTextField.setFont(lastNameTextFieldFont);
        lastNameTextField.setForeground(new Color(-5131855));
        lastNameTextField.setHorizontalAlignment(0);
        lastNameTextField.setText("...");
        mainCustomerPanel.add(lastNameTextField, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        emailTextField = new JTextField();
        emailTextField.setBackground(new Color(-16740463));
        Font emailTextFieldFont = this.$$$getFont$$$("Courier New", Font.BOLD, 18, emailTextField.getFont());
        if (emailTextFieldFont != null) emailTextField.setFont(emailTextFieldFont);
        emailTextField.setForeground(new Color(-5131855));
        emailTextField.setHorizontalAlignment(0);
        emailTextField.setText("...");
        mainCustomerPanel.add(emailTextField, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 40), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainCustomerPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        sendButton = new JButton();
        sendButton.setBackground(new Color(-5131855));
        sendButton.setBorderPainted(false);
        Font sendButtonFont = this.$$$getFont$$$("Courier New", Font.BOLD, 16, sendButton.getFont());
        if (sendButtonFont != null) sendButton.setFont(sendButtonFont);
        sendButton.setForeground(new Color(-16740463));
        sendButton.setHideActionText(true);
        sendButton.setHorizontalTextPosition(0);
        sendButton.setInheritsPopupMenu(false);
        sendButton.setSelected(false);
        sendButton.setText("Send");
        panel1.add(sendButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, 40), null, 0, false));
        previousButton = new JButton();
        previousButton.setBackground(new Color(-5131855));
        previousButton.setBorderPainted(false);
        Font previousButtonFont = this.$$$getFont$$$("Courier New", Font.BOLD, 16, previousButton.getFont());
        if (previousButtonFont != null) previousButton.setFont(previousButtonFont);
        previousButton.setForeground(new Color(-16740463));
        previousButton.setHideActionText(true);
        previousButton.setHorizontalTextPosition(0);
        previousButton.setInheritsPopupMenu(false);
        previousButton.setSelected(false);
        previousButton.setText("Previous");
        panel1.add(previousButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(80, 40), null, 0, false));
        newButton = new JButton();
        newButton.setText("New");
        panel1.add(newButton, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nextButton = new JButton();
        nextButton.setText("Next");
        panel1.add(nextButton, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        customerIDtextField = new JTextField();
        customerIDtextField.setEditable(false);
        customerIDtextField.setEnabled(false);
        mainCustomerPanel.add(customerIDtextField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainCustomerPanel;
    }
}