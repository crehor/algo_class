package org.week1;

import org.algo.utils.BellmanFordSP;
import org.algo.utils.EdgeWeightedDigraph;

/**
 * Created with IntelliJ IDEA.
 * User: crehor
 * Date: 7/31/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloClass {

    public static void main(String args[]) {

        BellmanFordSP x = new BellmanFordSP(new EdgeWeightedDigraph(33), 33);
        x.hasNegativeCycle();

        System.out.println("Howdy " + x.hasNegativeCycle());

    }
}
