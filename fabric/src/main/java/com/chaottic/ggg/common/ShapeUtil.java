package com.chaottic.ggg.common;

import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4d;
import org.joml.Quaternionf;

public final class ShapeUtil {

    private ShapeUtil() {}

    public static VoxelShape rotate(VoxelShape shape, Quaternionf quaternionf) {
        var matrix4d = new Matrix4d().rotate(quaternionf);
        var aabbs = shape.toAabbs().stream().map(aabb -> {

            return null;
        }).toList();

        return null;
    }
}
