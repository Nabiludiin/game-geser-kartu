package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: MyApplication */
public final class w74 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f18104a;

    private w74(OutputStream outputStream) {
        this.f18104a = outputStream;
    }

    public static w74 b(OutputStream outputStream) {
        return new w74(outputStream);
    }

    public final void a(ho4 ho4Var) {
        try {
            ho4Var.o(this.f18104a);
        } finally {
            this.f18104a.close();
        }
    }
}
