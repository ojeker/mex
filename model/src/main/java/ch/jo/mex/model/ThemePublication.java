package ch.jo.mex.model;

import java.text.MessageFormat;

public class ThemePublication {
    public String identifier;
    public String title;

    public ThemePublication(String identifier, String title){
        this.identifier = identifier;
        this.title = title;
    }

    @Override
    public String toString(){
        return MessageFormat.format("TP ident: {0} title: {1}", identifier, title);
    }
}
