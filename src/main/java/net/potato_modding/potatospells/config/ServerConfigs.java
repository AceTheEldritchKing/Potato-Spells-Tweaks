package net.potato_modding.potatospells.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfigs {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec BUILDING;
    public static ModConfigSpec.ConfigValue<String> COOLDOWN_UNCAP;
    public static ModConfigSpec.ConfigValue<String> CAST_UNCAP;
    public static ModConfigSpec.ConfigValue<String> RESIST_UNCAP;

    static {
        {
            BUILDER.push("Potato Spells Utils");
            BUILDER.comment("RE-BALANCE FORMULAS:");
            BUILDER.comment("Accept '1', '2' or '3'");
            BUILDER.comment("1 = 'default': Reaches 100% at ~3.63 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("2 = 'nerfed': Reaches 100% at ~4.99 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("3 = 'apotheosis': Reaches 100% at ~8.02 (full immunity / instant cast / 0 cooldown)");
            COOLDOWN_UNCAP = BUILDER.worldRestart().define("Cooldown Formula", "1");
            CAST_UNCAP = BUILDER.worldRestart().define("Cast Time Formula", "1");
            RESIST_UNCAP = BUILDER.worldRestart().define("Spell Resist Formula", "1");
        }
        BUILDER.pop();
        BUILDING = BUILDER.build();
    }
}
