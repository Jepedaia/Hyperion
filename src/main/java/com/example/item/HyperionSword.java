package com.example.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class HyperionSword extends SwordItem {

    public HyperionSword(ToolMaterial material) {
        super(material, 10, -2.4f, new Settings().maxCount(1));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            world.createExplosion(
                    user,
                    user.getX(),
                    user.getY(),
                    user.getZ(),
                    3.0f,
                    World.ExplosionSourceType.MOB
            );
            user.heal(6.0f);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
