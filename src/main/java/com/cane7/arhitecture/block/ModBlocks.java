package com.cane7.arhitecture.block;

import com.cane7.arhitecture.Arhitecture;
import com.cane7.arhitecture.block.custom.LowGlichenBlock;
import com.cane7.arhitecture.item.ModCreativeModeTab;
import com.cane7.arhitecture.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Arhitecture.MOD_ID);


    public static final RegistryObject<Block> CRACKED_BLOCK = registerBlock("cracked_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> AQUA_BLOCK = registerBlock("aqua_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> CORE_BLOCK = registerBlock("core_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> LOW_GLICHEN = registerBlock("low_glichen",
            () -> new LowGlichenBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops().lightLevel(
                            (state) -> state.getValue(LowGlichenBlock.CLICKED) ? 15 : 0)),
            ModCreativeModeTab.ARHITECTURE_TAB);





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;

    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}