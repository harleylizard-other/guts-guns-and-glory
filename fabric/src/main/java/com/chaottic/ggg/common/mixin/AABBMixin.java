package com.chaottic.ggg.common.mixin;

import com.chaottic.ggg.common.GutsGunsAndGloryAABB;
import net.minecraft.world.phys.AABB;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AABB.class)
public final class AABBMixin implements GutsGunsAndGloryAABB {
    @Shadow @Final public double minX;

    @Shadow @Final public double minY;

    @Shadow @Final public double minZ;

    @Shadow @Final public double maxX;

    @Shadow @Final public double maxY;

    @Shadow @Final public double maxZ;

    @Override
    public AABB transform(Matrix4d matrix4d) {
        var min = new Vector3d();
        var max = new Vector3d();
        matrix4d.transformAab(minX, minY, minZ, maxX, maxY, maxZ, min, max);

        return new AABB(min.x, min.y, min.z, max.x, max.y, max.z);
    }
}
