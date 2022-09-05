package ch.jo.mex.cli;


import ch.jo.mex.cli.writer.WriterFactory;
import ch.jo.mex.model.ThemePublication;
import ch.jo.mex.model.Writer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<ThemePublication> pubs = new ArrayList<>();
        pubs.add(new ThemePublication("i1", "t1"));
        pubs.add(new ThemePublication("i2", "t2"));

        Writer w = WriterFactory.forType(WriterFactory.Type.APP);
        w.write(pubs.iterator());
    }
}
