package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class v81 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17432a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17433b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17434c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f17435d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f17436e;

    private v81(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f17432a = w85Var;
        this.f17433b = w85Var2;
        this.f17434c = w85Var3;
        this.f17435d = w85Var4;
        this.f17436e = w85Var5;
    }

    public static v81 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new v81(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new u81(((m51) this.f17432a).a(), ((j51) this.f17433b).a(), (com.google.android.gms.common.util.e) this.f17434c.b(), (rx1) this.f17435d.b(), (ScheduledExecutorService) this.f17436e.b());
    }
}
