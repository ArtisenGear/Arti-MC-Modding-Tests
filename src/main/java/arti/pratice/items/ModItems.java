package arti.pratice.items;

import arti.pratice.Pratice;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item Fish_Question_Mark = registerItem("fish_question_mark", new Item(new Item.Settings()));
    public static final Item Fish_But_Cool = registerItem("fish_but_cool", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Pratice.MOD_ID, name), item);
    }

    public static void registerModItems () {
        Pratice.LOGGER.info("Registering Mod Items for" + Pratice.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Fish_Question_Mark);
            entries.add(Fish_But_Cool);
        });
    }
}
