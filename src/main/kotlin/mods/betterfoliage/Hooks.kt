@file:JvmName("Hooks")
package mods.betterfoliage

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.Direction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.shapes.VoxelShape
import net.minecraft.world.IBlockReader
import net.minecraft.world.World
import java.util.Random

fun getAmbientOcclusionLightValueOverride(original: Float, state: BlockState): Float {
//    if (Config.enabled && Config.roundLogs.enabled && BlockConfig.logBlocks.matchesClass(state.block)) return Config.roundLogs.dimming.toFloat();
    return original
}

fun getUseNeighborBrightnessOverride(original: Boolean, state: BlockState): Boolean {
//    return original || (Config.enabled && Config.roundLogs.enabled && BlockConfig.logBlocks.matchesClass(state.block));
    return original
}

fun onClientBlockChanged(worldClient: ClientWorld, pos: BlockPos, oldState: BlockState, newState: BlockState, flags: Int) {
//    ChunkOverlayManager.onBlockChange(worldClient, pos)
}

fun onRandomDisplayTick(block: Block, state: BlockState, world: World, pos: BlockPos, random: Random) {
//    if (Config.enabled &&
//        Config.risingSoul.enabled &&
//        state.block == Blocks.SOUL_SAND &&
//        world.isAirBlock(pos + up1) &&
//        Math.random() < Config.risingSoul.chance) {
//            EntityRisingSoulFX(world, pos).addIfValid()
//    }
//
//    if (Config.enabled &&
//        Config.fallingLeaves.enabled &&
//        BlockConfig.leafBlocks.matchesClass(state.block) &&
//        world.isAirBlock(pos + down1) &&
//        Math.random() < Config.fallingLeaves.chance) {
//            EntityFallingLeavesFX(world, pos).addIfValid()
//    }
}

fun getVoxelShapeOverride(state: BlockState, reader: IBlockReader, pos: BlockPos, dir: Direction): VoxelShape {
//    if (LogRegistry[state, reader, pos] != null) return VoxelShapes.empty()
    return state.getFaceOcclusionShape(reader, pos, dir)
}
