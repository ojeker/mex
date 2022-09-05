package ch.jo.mex.cli.writer;

import ch.jo.mex.model.ThemePublication;
import ch.jo.mex.model.Writer;

import java.util.Iterator;

public class AppWriter implements Writer {

    public void write(Iterator<ThemePublication> reader) {
        while(reader.hasNext()){
            System.out.println(reader.next().toString());
        }

    }
}
