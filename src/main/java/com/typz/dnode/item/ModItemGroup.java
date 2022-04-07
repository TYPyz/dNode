package com.typz.dnode.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup DNODE_GROUP = new ItemGroup("dNodeTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.DIAMOND_SHARD.get());
        }
    };
}
