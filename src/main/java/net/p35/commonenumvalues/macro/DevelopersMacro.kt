package net.p35.commonenumvalues.macro

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.codeInsight.template.Expression
import com.intellij.codeInsight.template.ExpressionContext
import com.intellij.codeInsight.template.macro.EnumMacro
import com.intellij.openapi.components.ServiceManager
import net.p35.commonenumvalues.config.ConfigService

import java.util.ArrayList

class DevelopersMacro : EnumMacro() {
    private val configService = ServiceManager.getService(ConfigService::class.java)
    private val config = configService.state!!

    override fun getName(): String {
        return "developers"
    }

    override fun getPresentableName(): String {
        return "developers"
    }

    override fun calculateLookupItems(params: Array<Expression>, context: ExpressionContext?): Array<LookupElement>? {
        val developers = ArrayList<LookupElementBuilder>()
        val devNames = config.developers.split(',')
        for (devName in devNames) {
            developers.add(LookupElementBuilder.create(devName))
        }

        return developers.toTypedArray()
    }
}