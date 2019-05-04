package net.p35.commonenumvalues.macro;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.template.Expression;
import com.intellij.codeInsight.template.ExpressionContext;
import com.intellij.codeInsight.template.macro.EnumMacro;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class DevelopersMacro extends EnumMacro {
    @Override
    public String getName() {
        return "developers";
    }

    @Override
    public String getPresentableName() {
        return "developers";
    }

    @Nullable
    @Override
    public LookupElement[] calculateLookupItems(@NotNull Expression[] params, ExpressionContext context) {
        ArrayList<LookupElementBuilder> developers = new ArrayList<>();
        String[] devNames = new String[]{"pavlo", "oksana", "dmytro", "dylan", "david"};
        for (String devName : devNames) {
            developers.add(LookupElementBuilder.create(devName));
        }

        return developers.toArray(new LookupElement[0]);
    }
}