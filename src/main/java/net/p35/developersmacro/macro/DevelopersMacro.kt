package net.p35.developersmacro.macro

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.codeInsight.template.Expression
import com.intellij.codeInsight.template.ExpressionContext
import com.intellij.codeInsight.template.macro.EnumMacro
import com.intellij.openapi.application.ApplicationManager
import net.p35.developersmacro.config.ConfigService

class DevelopersMacro : EnumMacro() {
    private val configService = ApplicationManager.getApplication().getService(ConfigService::class.java)
    private val config = configService.state

    override fun getName() = "developers"

    override fun getPresentableName() = "developers()"

    override fun calculateLookupItems(params: Array<Expression>, context: ExpressionContext?): Array<LookupElement> {
        return config.developers.split(',').map { LookupElementBuilder.create(it) }.toTypedArray()
    }
}