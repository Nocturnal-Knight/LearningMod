package learningMod.Nocturnal.core.handler;

import learningMod.Nocturnal.core.helper.LocalizationHelper;
import learningMod.Nocturnal.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
    
    public static void loadLanguages() {
        for (String LocationFile: Localizations.localFiles) {
            LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocalFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
        }
    }
}
