package com.cane7.arhitecture.block;

import com.cane7.arhitecture.Arhitecture;
import com.cane7.arhitecture.block.custom.LowGlichenBlock;
import com.cane7.arhitecture.item.ModCreativeModeTab;
import com.cane7.arhitecture.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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

    public static final RegistryObject<Block> CORE_BLOCK = registerBlock("core_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> LOW_GLICHEN = registerBlock("low_glichen",
            () -> new LowGlichenBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops().lightLevel(
                            (state) -> state.getValue(LowGlichenBlock.CLICKED) ? 15 : 0)),
            ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> AQUA_BLOCK = registerBlock("aqua_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);
    public static final RegistryObject<Block> AQUA_STAIRS = registerBlock("aqua_stairs",
            () -> new StairBlock(() -> ModBlocks.AQUA_BLOCK.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);
    public static final RegistryObject<Block> AQUA_SLAB = registerBlock("aqua_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);
    public static final RegistryObject<Block> AQUA_FENCE = registerBlock("aqua_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);
    public static final RegistryObject<Block> AQUA_FENCE_GATE = registerBlock("aqua_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);
    public static final RegistryObject<Block> AQUA_WALL = registerBlock("aqua_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_TAB);

    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> LIME_BRICKS = registerBlock("lime_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> RED_BRICK_SLAB = registerBlock("red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> RED_BRICK_WALL = registerBlock("red_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);

    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_BRICKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);
    public static final RegistryObject<Block> BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ARHITECTURE_BRICKS_TAB);



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
