package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class yf3 extends oz4 implements x05 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ yf3(byte[] r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.ag3 r1 = com.google.android.gms.internal.ads.ag3.i0()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf3.<init>(byte[]):void");
    }

    public final yf3 E(String str) {
        str.getClass();
        w();
        ((ag3) this.f13564r).h0().remove(str);
        return this;
    }

    public final Map F() {
        return Collections.unmodifiableMap(((ag3) this.f13564r).e0());
    }

    public final yf3 G(String str, wf3 wf3Var) {
        str.getClass();
        wf3Var.getClass();
        w();
        ((ag3) this.f13564r).h0().put(str, wf3Var);
        return this;
    }
}
