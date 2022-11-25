package org.r34nd0.plvne.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.r34nd0.plvne.Plvne;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Plvne.MOD_ID);

    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur_item",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register (IEventBus bus)
    {
        ITEMS.register(bus);
    }
}
