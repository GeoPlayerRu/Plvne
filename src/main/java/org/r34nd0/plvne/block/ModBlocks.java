package org.r34nd0.plvne.block;

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
import org.r34nd0.plvne.Plvne;
import org.r34nd0.plvne.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Plvne.MOD_ID);

    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> _block = BLOCKS.register(name,block);
        registerBlockItem(name,_block,tab);
        return _block;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static final void register(IEventBus bus)
    {
        BLOCKS.register(bus);
    }
}
