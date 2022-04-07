package com.typz.dnode.item;

import com.typz.dnode.dNode;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dNode.MOD_ID);

public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
        () -> new Item(new Item.Properties().group(ModItemGroup.DNODE_GROUP)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
