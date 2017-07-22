package com.neat.gene;

public interface GenePool {
    public void addGene(Gene gene);

    public boolean geneExist(Gene gene);

    public Gene getGene();

}
