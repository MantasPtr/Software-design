package templateMethod;

import java.math.BigDecimal;

public abstract class WoodlandController {

    protected int treeCount;

    protected WoodlandController(int treeCount) {
        this.treeCount = treeCount;
    }

    final public void doFullForestCycle(int seedCount){
        int treesChopped = cutDown();
        System.out.println(treesChopped + " trees were cut down");
        System.out.println("currently there is " + treeCount + " trees in the forest");
        int treesCount = grow();
        System.out.println("After grow there is " + treeCount + " trees and " + treesCount + " saplings in the forest");
        plant(seedCount);
        System.out.println(seedCount + " saplings were planted");
        BigDecimal treeValue = calculatePrice(treesChopped);
        System.out.println("wood can be sold for " + treeValue + " Eur.");
    }

    protected abstract int cutDown();

    protected abstract void plant(int treeCount);

    protected abstract int grow();

    protected abstract BigDecimal calculatePrice(int treeCount);
}
