package net.p35.developersmacro.livetemplate

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class DevelopersTemplateProvider : DefaultLiveTemplatesProvider {
    override fun getDefaultLiveTemplateFiles(): Array<String> {
        return arrayOf("liveTemplates/Markdown")
    }

    override fun getHiddenLiveTemplateFiles(): Array<String>? {
        return arrayOf()
    }
}