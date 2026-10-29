package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class ns3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12888a;

    private ns3(w85 w85Var) {
        this.f12888a = w85Var;
    }

    public static ns3 a(w85 w85Var) {
        return new ns3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f12888a.b(), "dgd"), "pcam.jar");
    }
}
