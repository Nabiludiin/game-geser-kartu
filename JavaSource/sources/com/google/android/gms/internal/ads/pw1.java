package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class pw1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14134a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14135b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f14136c;

    private pw1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f14134a = w85Var;
        this.f14135b = w85Var2;
        this.f14136c = w85Var4;
    }

    public static pw1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new pw1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set set;
        final String a8 = ((nu2) this.f14134a).a();
        Context a9 = ((ou0) this.f14135b).a();
        z64 c8 = z33.c();
        Map b8 = ((r85) this.f14136c).b();
        if (((Boolean) s2.b0.c().d(uy.J5)).booleanValue()) {
            iu iuVar = new iu(new nu(a9));
            iuVar.b(new hu() { // from class: com.google.android.gms.internal.ads.qw1
                @Override // com.google.android.gms.internal.ads.hu
                public final /* synthetic */ void a(qx qxVar) {
                    qxVar.O(a8);
                }
            });
            set = Collections.singleton(new hi1(new sw1(iuVar, b8), c8));
        } else {
            set = Collections.EMPTY_SET;
        }
        v85.b(set);
        return set;
    }
}
