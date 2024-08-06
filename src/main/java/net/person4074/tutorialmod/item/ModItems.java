package net.person4074.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.person4074.tutorialmod.TutorialMod;
public  class ModItems{

public static final Item ADAMANT = registerItem("adamant", new Item(new Item.Settings()));
public static final Item RAW_ADAMANT = registerItem("raw_adamant", new Item(new Item.Settings()));
public static final Item VASILIS = registerItem("vasilis", new Item(new Item.Settings()));
public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

private static  void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
    entries.add(ADAMANT);
    entries.add(RAW_ADAMANT);
    entries.add(VASILIS);
    entries.add(RUBY);
    entries.add(RAW_RUBY);
}

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
}

    public static void registerModITems(){
    TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
