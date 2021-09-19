package net.p35.developersmacro.config;

import javax.swing.*;

public class ConfigForm {
    private JPanel rootPanel;
    private JTextField developersField;

    public JPanel getRoot() {
        return rootPanel;
    }

    public String getDevelopers() {
        return developersField.getText();
    }

    public void setDevelopers(String developers) {
        this.developersField.setText(developers);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
