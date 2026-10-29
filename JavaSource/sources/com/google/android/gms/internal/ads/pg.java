package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: MyApplication */
public final class pg extends x75 implements Closeable {
    static {
        e85.b(pg.class);
    }

    public pg(y75 y75Var, og ogVar) {
        h(y75Var, y75Var.b(), ogVar);
    }

    @Override // com.google.android.gms.internal.ads.x75
    public final String toString() {
        String obj = this.f18655r.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.x75, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
