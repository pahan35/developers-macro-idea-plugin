import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConfigEntry implements Configurable {

    private ConfigForm form;
    private ConfigService configService = ServiceManager.getService(ConfigService::class)

    @Override
    public void apply() throws ConfigurationException {
        if (form == null) return;
    }

    @Override
    public boolean isModified() {
        return form != null && false;
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Developers";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        form = new ConfigForm();
        return form.getRoot();
    }
}
