package de.verdox.mccreativelab.impl.mcclab.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitAdapter;
import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.key.Key;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MCCCustomBlockState extends MCCHandle<FakeBlock.FakeBlockState> implements MCCBlockState {
    public static final MCCConverter<FakeBlock.FakeBlockState, MCCCustomBlockState> CONVERTER = converter(MCCCustomBlockState.class, FakeBlock.FakeBlockState.class, MCCCustomBlockState::new, MCCHandle::getHandle);

    private final FakeBlock parent;

    public MCCCustomBlockState(FakeBlock.FakeBlockState fakeBlockState) {
        super(fakeBlockState);
        this.parent = fakeBlockState.getFakeBlock();
    }

    @Override
    public @NotNull MCCBlockType getBlockType() {
        return new MCCCustomBlockType(parent);
    }

    @Override
    public String toBlockDataString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float getDestroySpeed(MCCPlayer player, MCCItemStack mccItemStack, boolean considerEnchants) {
        Player bukkitPlayer = BukkitAdapter.unwrap(player);
        ItemStack bukkitItemStack = BukkitAdapter.unwrap(mccItemStack);
        return parent.getDestroySpeed(handle, bukkitPlayer, bukkitItemStack);
    }

    @Override
    public @NotNull List<MCCItemStack> getDrops(@NotNull MCCLocation mccLocation, @Nullable MCCEntity entity, @Nullable MCCItemStack tool) {
        return handle.getFakeBlock().drawLoot(BukkitAdapter.unwrap(mccLocation.getBlockNow()), handle, BukkitAdapter.unwrap(entity), BukkitAdapter.unwrap(tool), tool == null).stream().map(itemStack -> BukkitAdapter.unwrap(itemStack, new TypeToken<MCCItemStack>() {})).toList();
    }

    @Override
    public boolean isRandomlyTicking() {
        return handle.getProperties().isRandomlyTicking();
    }

    @Override
    public boolean requiresCorrectToolForDrops() {
        return handle.getProperties().isRequiresCorrectToolForDrops();
    }

    @Override
    public @NotNull Key key() {
        return parent.key();
    }

    @Override
    public boolean isVanilla() {
        return false;
    }
}
