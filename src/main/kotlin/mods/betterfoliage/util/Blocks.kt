package mods.betterfoliage.util

import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.material.Material

val BlockState.isSnow: Boolean get() = material.let { it == Material.SNOW }

val DIRT_BLOCKS = listOf(Blocks.DIRT, Blocks.COARSE_DIRT)