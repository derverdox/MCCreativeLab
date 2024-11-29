package de.verdox.mccreativelab.wrapper.block;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class MCCCapturedBlockState implements MCCWrapped {
    protected final MCCLocation location;
    protected final MCCBlockState capturedBlockState;
    protected MCCBlockState toChange;
    @Nullable
    protected MCCBlock mccBlock;
    protected int flag = 3;

    public MCCCapturedBlockState(@NotNull MCCBlock block){
        this(block, 3);
    }

    public MCCCapturedBlockState(@NotNull MCCBlock block, int flag){
        this(block.getLocation(), block.getBlockState());
        this.mccBlock = block;
        this.flag = flag;
    }

    public MCCCapturedBlockState(MCCLocation location, MCCBlockState capturedBlockState) {
        this.location = location;
        this.capturedBlockState = capturedBlockState;
        this.toChange = capturedBlockState;
    }

    public void setBlockState(MCCBlockState toChange) {
        this.toChange = toChange;
    }

    public CompletableFuture<Boolean> update() {
        return this.update(false);
    }

    public MCCBlockState getCapturedBlockState() {
        return capturedBlockState;
    }

    public MCCBlockState getToChange() {
        return toChange;
    }

    public CompletableFuture<Boolean> update(boolean force) {
        return this.update(force, true);
    }
    
    public CompletableFuture<Boolean> update(boolean force, boolean triggerBlockUpdates){
        if (!this.isPlaced()) {
            return CompletableFuture.completedFuture(true);
        }

        if (mccBlock.getBlockType() != capturedBlockState.getBlockType()) {
            if (!force) {
                return CompletableFuture.completedFuture(false);
            }
        }

        return location.world().setBlock(toChange, location, triggerBlockUpdates).thenApply(unused -> true);
    }

    public @Nullable MCCBlock getBlock() {
        requirePlaced();
        return mccBlock;
    }

    protected void requirePlaced() {
        Preconditions.checkState(this.isPlaced(), "The blockState must be placed to call this method");
    }

    public boolean isPlaced(){
        return mccBlock != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCCCapturedBlockState that = (MCCCapturedBlockState) o;
        return flag == that.flag && Objects.equals(location, that.location) && Objects.equals(capturedBlockState, that.capturedBlockState) && Objects.equals(mccBlock, that.mccBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, capturedBlockState, mccBlock, flag);
    }

    public int getFlag() {
        return flag;
    }

    public MCCLocation getLocation() {
        return location;
    }
}
