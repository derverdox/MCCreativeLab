package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSMenuLessChildContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.recipe.MCCMerchantRecipe;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCMerchantContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.MerchantContainer;
import net.minecraft.world.inventory.MerchantMenu;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NMSMerchantContainer extends NMSContainer<MCCEntityContainerSource<MCCEntity>, MerchantMenu> implements MCCMerchantContainer {
    public static final MCCConverter<MerchantMenu, NMSMerchantContainer> CONVERTER = converter(NMSMerchantContainer.class, MerchantMenu.class, NMSMerchantContainer::new, MCCHandle::getHandle);

    public NMSMerchantContainer(MerchantMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(MerchantMenu abstractContainerMenu) {
        return readContainerFromField("trader");
    }

    @Override
    public MCCContainer<MCCEntityContainerSource<MCCEntity>> getContainerOfMerchant() {
        MerchantContainer merchantContainer = (MerchantContainer) readContainerDataFromField("tradeContainer");
        return new NMSMenuLessChildContainer<>(this, merchantContainer);
    }

    @Override
    public @Nullable MCCMerchantRecipe getSelectedRecipe() {
        return MCCPlatform.getInstance().getConversionService().wrap(getHandle().getOffers().get(getSelectedRecipeIndex()), new TypeToken<>() {});
    }

    @Override
    public @NotNull MCCMerchantRecipe getRecipe(int index) throws IndexOutOfBoundsException {
        return MCCPlatform.getInstance().getConversionService().wrap(getHandle().getOffers().get(index), new TypeToken<>() {});
    }

    @Override
    public void setRecipe(int index, @NotNull MCCMerchantRecipe recipe) throws IndexOutOfBoundsException {
        getHandle().getOffers().set(index, MCCPlatform.getInstance().getConversionService().unwrap(recipe, new TypeToken<>() {}));
    }

    @Override
    public @NotNull List<MCCMerchantRecipe> getRecipes() {
        return getHandle().getOffers().stream().map(merchantOffer -> MCCPlatform.getInstance().getConversionService().wrap(merchantOffer, new TypeToken<MCCMerchantRecipe>() {})).toList();
    }

    @Override
    public void setRecipes(@NotNull List<MCCMerchantRecipe> recipes) {
        getHandle().getOffers().clear();
        getHandle().getOffers().addAll(recipes.stream().map(mccMerchantRecipe -> MCCPlatform.getInstance().getConversionService().unwrap(mccMerchantRecipe, new TypeToken<MerchantOffer>() {})).toList());
    }

    @Override
    public void setExperienceBar(float progress) {
        getHandle().setXp((int) (getHandle().getFutureTraderXp() * progress));
    }

    @Override
    public float getExperienceBarProgress() {
        return getHandle().getTraderXp() * 1f / getHandle().getFutureTraderXp();
    }

    @Override
    public int getRecipeCount() {
        return getHandle().getOffers().size();
    }

    @Override
    public void setLevel(int level) {
        getHandle().setMerchantLevel(level);
    }

    @Override
    public int getLevel() {
        return getHandle().getTraderLevel();
    }

    @Override
    public void setCanRestock(boolean value) {
        getHandle().setCanRestock(value);
    }

    @Override
    public boolean canRestock() {
        return getHandle().canRestock();
    }

    @Override
    public boolean showsProgressBar() {
        return getHandle().showProgressBar();
    }

    @Override
    public void showProgressBar(boolean value) {
        getHandle().setShowProgressBar(value);
    }

    @Override
    public int getSelectedRecipeIndex() {
        MerchantContainer merchantContainer = (MerchantContainer) readContainerDataFromField("tradeContainer");
        return merchantContainer.selectionHint;
    }

    @Override
    public void setSelectedRecipeIndex(int index) {
        getHandle().setSelectionHint(index);
    }
}
