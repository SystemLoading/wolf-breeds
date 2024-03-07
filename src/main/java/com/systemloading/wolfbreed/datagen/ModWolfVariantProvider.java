package com.systemloading.wolfbreed.datagen;

import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.entity.passive.WolfVariant;
import net.minecraft.registry.tag.TagBuilder;

public class ModWolfVariantProvider extends TagProvider.ProvidedTagBuilder<WolfVariant> {
    // I have no idea if this will work.
    protected ModWolfVariantProvider(TagBuilder builder) {
        super(builder);
    }
}
