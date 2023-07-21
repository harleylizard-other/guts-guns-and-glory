package com.chaottic.ggg.common;

import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4d;
import org.joml.Quaternionf;

public final class Util {

    private Util() {}

    public static VoxelShape rotate(VoxelShape shape, Quaternionf quaternionf) {
        var matrix4d = new Matrix4d().translate(0.5F, 0.5F, 0.5F).rotate(quaternionf).translate(-0.5F, -0.5F, -0.5F);
        var shapes = shape.toAabbs().stream().map(aabb -> Shapes.create(((GutsGunsAndGloryAABB) aabb).transform(matrix4d))).toList();

        var result = Shapes.empty();
        for (var rotated : shapes) {
            result = Shapes.join(result, rotated, BooleanOp.OR);
        }
        return result;
    }
}
