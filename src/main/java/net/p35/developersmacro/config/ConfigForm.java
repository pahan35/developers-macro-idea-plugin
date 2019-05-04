package net.p35.developersmacro.config;

import javax.swing.*;

public class ConfigForm {
    private JPanel rootPanel;
    private JTextField developers;

    public JPanel getRoot() {
        return rootPanel;
    }

    public String getDevelopers() {
        return developers.getText();
    }

    public void setDevelopers(String developers) {
        this.developers.setText(developers);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
