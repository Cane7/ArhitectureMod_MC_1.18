package com.cane7.arhitecture.item;

import com.cane7.arhitecture.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ARHITECTURE_TAB = new CreativeModeTab("arhitecturetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CRACKED_BLOCK.get());
        }
    };
}
