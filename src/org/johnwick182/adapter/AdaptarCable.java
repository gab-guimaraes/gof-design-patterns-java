package org.johnwick182.adapter;

public class AdaptarCable extends XLRCable {
    private final TRSCable trsCable;

    public AdaptarCable(TRSCable trsCable) {
        this.trsCable = trsCable;
    }

    public void connectTRS() {
        trsCable.connectTRS();
    }
}
