package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class fp5 extends wo5 {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f8385h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Handler f8386i;

    /* renamed from: j, reason: collision with root package name */
    private kb4 f8387j;

    protected fp5() {
    }

    protected int A(Object obj, int i7) {
        return 0;
    }

    protected abstract xp5 B(Object obj, xp5 xp5Var);

    @Override // com.google.android.gms.internal.ads.wo5
    protected final void m() {
        for (ep5 ep5Var : this.f8385h.values()) {
            ep5Var.f7748a.k(ep5Var.f7749b);
        }
    }

    @Override // com.google.android.gms.internal.ads.wo5
    protected void n(kb4 kb4Var) {
        this.f8387j = kb4Var;
        this.f8386i = hi2.z(null);
    }

    @Override // com.google.android.gms.internal.ads.wo5
    protected final void o() {
        for (ep5 ep5Var : this.f8385h.values()) {
            ep5Var.f7748a.e(ep5Var.f7749b);
        }
    }

    @Override // com.google.android.gms.internal.ads.wo5
    protected void p() {
        HashMap hashMap = this.f8385h;
        for (ep5 ep5Var : hashMap.values()) {
            aq5 aq5Var = ep5Var.f7748a;
            aq5Var.a(ep5Var.f7749b);
            dp5 dp5Var = ep5Var.f7750c;
            aq5Var.c(dp5Var);
            aq5Var.l(dp5Var);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public void r() {
        Iterator it = this.f8385h.values().iterator();
        while (it.hasNext()) {
            ((ep5) it.next()).f7748a.r();
        }
    }

    protected abstract void y(Object obj, aq5 aq5Var, az azVar);

    protected final void z(final Object obj, aq5 aq5Var) {
        HashMap hashMap = this.f8385h;
        rx3.a(!hashMap.containsKey(obj));
        yp5 yp5Var = new yp5() { // from class: com.google.android.gms.internal.ads.bp5
            @Override // com.google.android.gms.internal.ads.yp5
            public final /* synthetic */ void a(aq5 aq5Var2, az azVar) {
                fp5.this.y(obj, aq5Var2, azVar);
            }
        };
        dp5 dp5Var = new dp5(this, obj);
        hashMap.put(obj, new ep5(aq5Var, yp5Var, dp5Var));
        Handler handler = this.f8386i;
        handler.getClass();
        aq5Var.g(handler, dp5Var);
        Handler handler2 = this.f8386i;
        handler2.getClass();
        aq5Var.j(handler2, dp5Var);
        aq5Var.d(yp5Var, this.f8387j, x());
        if (w()) {
            return;
        }
        aq5Var.e(yp5Var);
    }

    protected long C(Object obj, long j7, xp5 xp5Var) {
        return j7;
    }
}
