package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x15 extends RuntimeException {
    public x15(v05 v05Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final e05 a() {
        return new e05(getMessage());
    }
}
