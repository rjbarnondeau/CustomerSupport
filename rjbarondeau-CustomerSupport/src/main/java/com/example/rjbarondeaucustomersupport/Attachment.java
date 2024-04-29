package com.example.rjbarondeaucustomersupport;

import javax.print.DocFlavor;
import java.io.ByteArrayInputStream;

public class Attachment {
    private String name;
    private byte[] contents;

    public String getName() {
        return name;
    }

    public byte[] getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }
}
