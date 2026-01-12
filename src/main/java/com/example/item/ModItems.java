package com.example.item;

import com.example.Hyperion;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HYPERION_SWORD = register(
            "hyperion_sword",
            new HyperionSword(ToolMaterials.NETHERITE)
    );

    private static Item register(String id, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(Hyperion.MOD_ID, id),
                item
        );
    }

    public static void registerItems() {
        // wird in onInitialize aufgerufen
    }
}
