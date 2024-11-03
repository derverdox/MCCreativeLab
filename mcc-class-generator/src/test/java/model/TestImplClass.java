package model;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Optional;

public class TestImplClass {
    private final String name;
    private final List<ItemStack> simpleListWithSwappableGeneric;
    private final HolderSet<Block> swappableCollection;
    private final Optional<Holder<Block>> tripleGeneric;

    public TestImplClass(String name, List<ItemStack> simpleListWithSwappableGeneric, HolderSet<Block> swappableCollection, Optional<Holder<Block>> tripleGeneric){
        this.name = name;
        this.simpleListWithSwappableGeneric = simpleListWithSwappableGeneric;
        this.swappableCollection = swappableCollection;
        this.tripleGeneric = tripleGeneric;
    }
}
