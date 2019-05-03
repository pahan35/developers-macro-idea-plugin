import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

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

    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label5 = new JLabel();
        label5.setText("Developers:");
        rootPanel.add(label5, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        developers = new JTextField();
        rootPanel.add(developers, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        label5.setLabelFor(developers);
    }

    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
