package com.neat.gene;

import com.sun.tools.javac.util.Pair;

public interface Gene {
<<<<<<< HEAD
    public int getNodeI();

    public int getNodeO();
=======

    public Pair<Integer,Integer> getNodes();
>>>>>>> 80dde7dbad7961d22483944e4ad4874cc009cbd5

    public boolean equals(Gene gene);

    public int getInnovationNumber();

}
