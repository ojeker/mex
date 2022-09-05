package ch.jo.mex.cli.writer;

import ch.jo.mex.model.Writer;

public class WriterFactory {
    public enum Type {
        APP,
        CAT
    }

    public static Writer forType(Type t){
        Writer res = null;

        if(t == Type.APP)
            res = new AppWriter();
        else
            throw new RuntimeException("Not implemented");

        return res;
    }
}
