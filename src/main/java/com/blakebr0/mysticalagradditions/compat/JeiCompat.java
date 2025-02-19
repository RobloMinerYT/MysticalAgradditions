package com.blakebr0.mysticalagradditions.compat;

import com.blakebr0.mysticalagradditions.MysticalAgradditions;
import com.blakebr0.mysticalagradditions.init.ModItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public final class JeiCompat implements IModPlugin {
    public static final ResourceLocation UID = new ResourceLocation(MysticalAgradditions.MOD_ID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(
                new ItemStack(ModItems.WITHERING_SOUL.get()),
                VanillaTypes.ITEM,
                new TranslatableComponent("jei.desc.mysticalagradditions.withering_soul")
        );
        registration.addIngredientInfo(
                new ItemStack(ModItems.DRAGON_SCALE.get()),
                VanillaTypes.ITEM,
                new TranslatableComponent("jei.desc.mysticalagradditions.dragon_scale")
        );
    }
}
