package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class o5 extends RuntimeException {
    public o5(z4 z4Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final l4 a() {
        return new l4(getMessage());
    }
}
