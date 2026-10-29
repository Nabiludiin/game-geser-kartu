package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class mr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12381a;

    /* renamed from: b, reason: collision with root package name */
    private final l11 f12382b;

    /* renamed from: c, reason: collision with root package name */
    private final ji1 f12383c;

    /* renamed from: d, reason: collision with root package name */
    private final d01 f12384d;

    mr1(Executor executor, l11 l11Var, ji1 ji1Var, d01 d01Var) {
        this.f12381a = executor;
        this.f12383c = ji1Var;
        this.f12382b = l11Var;
        this.f12384d = d01Var;
    }

    public final void a(final mr0 mr0Var) {
        if (mr0Var == null) {
            return;
        }
        ji1 ji1Var = this.f12383c;
        ji1Var.U0(mr0Var.Z());
        gr grVar = new gr() { // from class: com.google.android.gms.internal.ads.lr1
            @Override // com.google.android.gms.internal.ads.gr
            public final /* synthetic */ void t(fr frVar) {
                Rect rect = frVar.f8424d;
                mr0.this.s0().h0(rect.left, rect.top, false);
            }
        };
        Executor executor = this.f12381a;
        ji1Var.y0(grVar, executor);
        ji1Var.y0(new gr() { // from class: com.google.android.gms.internal.ads.ir1
            @Override // com.google.android.gms.internal.ads.gr
            public final /* synthetic */ void t(fr frVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != frVar.f8430j ? "0" : "1");
                mr0.this.B("onAdVisibilityChanged", hashMap);
            }
        }, executor);
        l11 l11Var = this.f12382b;
        ji1Var.y0(l11Var, executor);
        l11Var.a(mr0Var);
        ot0 s02 = mr0Var.s0();
        if (((Boolean) s2.b0.c().d(uy.hb)).booleanValue() && s02 != null) {
            d01 d01Var = this.f12384d;
            s02.m1(d01Var);
            s02.j0(d01Var, null, null);
        }
        mr0Var.O0("/trackActiveViewUnit", new y50() { // from class: com.google.android.gms.internal.ads.jr1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mr1.this.b((mr0) obj, map);
            }
        });
        mr0Var.O0("/untrackActiveViewUnit", new y50() { // from class: com.google.android.gms.internal.ads.kr1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mr1.this.c((mr0) obj, map);
            }
        });
    }

    final /* synthetic */ void b(mr0 mr0Var, Map map) {
        this.f12382b.c();
    }

    final /* synthetic */ void c(mr0 mr0Var, Map map) {
        this.f12382b.b();
    }
}
