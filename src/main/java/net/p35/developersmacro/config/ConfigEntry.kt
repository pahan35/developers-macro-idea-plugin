package net.p35.developersmacro.config

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel

class ConfigEntry : BoundConfigurable("Developers", "Configuration for the Common enum values") {
    private val configService = ApplicationManager.getApplication().getService(ConfigService::class.java)
    private val config = configService.state

    override fun createPanel(): DialogPanel = panel {
        row("Developers:") {
            textField()
                .bindText(config::developers)
                .comment("Comma-separated list of developers")
        }
    }

    override fun apply() {
        super.apply()
        configService.notifyChange()
    }
}
