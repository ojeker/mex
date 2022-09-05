package ch.jo.mex.model;

import java.util.Iterator;

public interface Writer {

    /**
     * Writes to the implementation-specific destination (sink)
     * using the injected iterator.
     */
    void write(Iterator<ThemePublication> reader);
}
