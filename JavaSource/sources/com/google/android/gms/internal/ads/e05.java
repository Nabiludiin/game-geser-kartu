package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: MyApplication */
public class e05 extends IOException {

    /* renamed from: q, reason: collision with root package name */
    private boolean f7384q;

    public e05(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f7384q = true;
    }

    final boolean b() {
        return this.f7384q;
    }

    public e05(String str) {
        super(str);
    }

    public e05(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
