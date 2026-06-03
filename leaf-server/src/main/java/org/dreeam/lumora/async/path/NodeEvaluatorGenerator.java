package org.dreeam.lumora.async.path;

import net.minecraft.world.level.pathfinder.NodeEvaluator;

public interface NodeEvaluatorGenerator {
    NodeEvaluator generate(NodeEvaluatorFeatures nodeEvaluatorFeatures);
}
