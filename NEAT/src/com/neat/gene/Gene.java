package com.neat.gene;

import com.sun.tools.javac.util.Pair;

public interface Gene {
    public int getNodeI();

    public int getNodeO();

    public boolean equals(Gene gene);

    public int getInnovationNumber();

}
