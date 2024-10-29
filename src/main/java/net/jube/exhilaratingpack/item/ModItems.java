package net.jube.exhilaratingpack.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jube.exhilaratingpack.ExhilaratingPack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_AURILLIUM = registerItem("raw_aurillium", new Item(new Item.Settings()));
    public static final Item AURILLIUM_INGOT = registerItem("aurillium_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExhilaratingPack.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ExhilaratingPack.LOGGER.info("Registering Mod Items for " + ExhilaratingPack.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_AURILLIUM);
            fabricItemGroupEntries.add(AURILLIUM_INGOT);
        });
    }
}
