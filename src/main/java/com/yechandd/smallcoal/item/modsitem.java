package com.yechandd.smallcoal.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.yechandd.smallcoal.smallcoal;

public class modsitem {

    public static final String MODID = smallcoal.MODID;

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredItem<Item> SMALL_COAL = ITEMS.registerSimpleItem("small_coal", p -> p.stacksTo(64));

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SMALLCOAL_TAB = CREATIVE_MODE_TABS.register("smallcoal_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.smallcoal"))
            .icon(() -> SMALL_COAL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(SMALL_COAL.get());
            }).build());
}
