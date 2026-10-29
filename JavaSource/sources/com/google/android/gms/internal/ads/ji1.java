package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class ji1 extends eg1 implements gr {

    /* renamed from: r, reason: collision with root package name */
    private final Map f10555r;

    /* renamed from: s, reason: collision with root package name */
    private final Context f10556s;

    /* renamed from: t, reason: collision with root package name */
    private final c03 f10557t;

    public ji1(Context context, Set set, c03 c03Var) {
        super(set);
        this.f10555r = new WeakHashMap(1);
        this.f10556s = context;
        this.f10557t = c03Var;
    }

    public final synchronized void U0(View view) {
        try {
            Map map = this.f10555r;
            ir irVar = (ir) map.get(view);
            if (irVar == null) {
                ir irVar2 = new ir(this.f10556s, view);
                irVar2.a(this);
                map.put(view, irVar2);
                irVar = irVar2;
            }
            if (this.f10557t.X) {
                if (((Boolean) s2.b0.c().d(uy.G1)).booleanValue()) {
                    irVar.d(((Long) s2.b0.c().d(uy.F1)).longValue());
                    return;
                }
            }
            irVar.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void W0(View view) {
        Map map = this.f10555r;
        if (map.containsKey(view)) {
            ((ir) map.get(view)).b(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final synchronized void t(final fr frVar) {
        K0(new dg1() { // from class: com.google.android.gms.internal.ads.ii1
            @Override // com.google.android.gms.internal.ads.dg1
            public final /* synthetic */ void d(Object obj) {
                ((gr) obj).t(fr.this);
            }
        });
    }
}
