package net.p35.developersmacro.config

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.options.Configurable
import com.intellij.openapi.options.ConfigurationException
import org.jetbrains.annotations.Nls
import javax.swing.*

class ConfigEntry : Configurable {
    private var form: ConfigForm? = null
    private val configService = ApplicationManager.getApplication().getService(ConfigService::class.java)
    private val config = configService.state

    @Nls override fun getDisplayName() = "Developers"

    override fun getHelpTopic() = "Configuration for the Common enum values"

    override fun createComponent(): JComponent? {
        form = ConfigForm()
        reset()
        return form!!.root
    }

    override fun isModified() = form != null &&
            (config.developers != form!!.developers)

    @Throws(ConfigurationException::class)
    override fun apply() {
        if (form == null) return

        config.developers = form!!.developers
        configService.notifyChange()
    }

    override fun reset() {
        if (form == null) return

        form!!.developers = config.developers
    }

    override fun disposeUIResources() {
        form = null
    }
}
