package ru.vsu.sc.tretyakov_d_s;

import ru.vsu.sc.tretyakov_d_s.types.Point;
import ru.vsu.sc.tretyakov_d_s.types.RTreeRectangle;
import ru.vsu.sc.tretyakov_d_s.utils.Pair;

import java.util.ArrayList;

public abstract class NodeSplitter<T extends Point> {

    abstract public Pair<RTreeRectangle<T>, RTreeRectangle<T>> splitNodes(RTreeRectangle<T> nodeToSplit, RTreeRectangle<T> overflowNode);

    abstract protected Pair<RTreeRectangle<T>, RTreeRectangle<T>> pickSeeds(ArrayList<RTreeRectangle<T>> records);

    abstract protected void pickNext(ArrayList<RTreeRectangle<T>> records, RTreeRectangle<T> L1, RTreeRectangle<T> L2);
}
