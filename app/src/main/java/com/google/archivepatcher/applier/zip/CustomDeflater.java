package com.google.archivepatcher.applier.zip;


public class CustomDeflater {

    static {
        System.loadLibrary("z");
    }

    private native static long init(int level, int strategy, boolean nowrap);
    private native static void setDictionary(long addr, byte[] b, int off, int len);
    private native int deflateBytes(long addr, byte[] b, int off, int len,
                                    int flush);
    private native static int getAdler(long addr);
    private native static void reset(long addr);
    private native static void end(long addr);
    public static native int test(int a);
}
