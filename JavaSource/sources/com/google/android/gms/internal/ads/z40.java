package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: MyApplication */
final class z40 implements y50 {
    z40() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        try {
            oh3.i(mr0Var.getContext()).l();
            ph3.i(mr0Var.getContext()).k();
            qh3.a(mr0Var.getContext()).b(null);
        } catch (IOException e8) {
            r2.t.l().i(e8, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
