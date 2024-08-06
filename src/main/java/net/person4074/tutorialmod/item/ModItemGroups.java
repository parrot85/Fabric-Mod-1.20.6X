package net.person4074.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.person4074.tutorialmod.TutorialMod;
import net.person4074.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ADAMANT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "adamant"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.adamant"))
                    .icon(() -> new ItemStack(ModItems.ADAMANT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ADAMANT);
                        entries.add(ModItems.RAW_ADAMANT);
                        entries.add(ModItems.VASILIS);
                        entries.add(ModBlocks.ADAMANT_BLOCK);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANT_BLOCK);




                    }).build());



    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " +TutorialMod.MOD_ID);
    }
}
