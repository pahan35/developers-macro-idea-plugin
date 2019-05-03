import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.template.Expression;
import com.intellij.codeInsight.template.ExpressionContext;
import com.intellij.codeInsight.template.macro.EnumMacro;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
        LookupElementBuilder[] developers = new LookupElementBuilder[5];
        developers[0] = LookupElementBuilder.create("pavlo");
        developers[1] = LookupElementBuilder.create("oksana");
        developers[2] = LookupElementBuilder.create("dmytro");
        developers[3] = LookupElementBuilder.create("dylan");
        developers[4] = LookupElementBuilder.create("david");
        return developers;
    }
}