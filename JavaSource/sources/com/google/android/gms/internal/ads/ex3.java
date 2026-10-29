package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class ex3 implements sx3 {
    protected ex3() {
    }

    public static ex3 b(char c8) {
        return new bx3(c8);
    }

    public abstract boolean a(char c8);

    @Override // com.google.android.gms.internal.ads.sx3
    public final /* synthetic */ boolean d(Object obj) {
        return a(((Character) obj).charValue());
    }
}
