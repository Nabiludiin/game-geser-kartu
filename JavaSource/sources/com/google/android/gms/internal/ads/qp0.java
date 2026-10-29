package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class qp0 implements l3.h {

    /* renamed from: q, reason: collision with root package name */
    protected final Context f14547q;

    /* renamed from: r, reason: collision with root package name */
    protected final String f14548r;

    /* renamed from: s, reason: collision with root package name */
    protected final WeakReference f14549s;

    public qp0(bo0 bo0Var) {
        Context context = bo0Var.getContext();
        this.f14547q = context;
        this.f14548r = r2.t.g().Q(context, bo0Var.p().f27051q);
        this.f14549s = new WeakReference(bo0Var);
    }

    public abstract boolean g(String str);

    public boolean h(String str, String[] strArr) {
        return g(str);
    }

    public boolean j(String str, String[] strArr, hp0 hp0Var) {
        return g(str);
    }

    public abstract void q();

    public final void r(String str, String str2, long j7, long j8, boolean z7, long j9, long j10, long j11, int i7, int i8) {
        w2.g.f27064b.post(new kp0(this, str, str2, j7, j8, j9, j10, j11, z7, i7, i8));
    }

    public final void s(String str, String str2, int i7, int i8, long j7, long j8, boolean z7, int i9, int i10) {
        w2.g.f27064b.post(new mp0(this, str, str2, i7, i8, j7, j8, z7, i9, i10));
    }

    protected final void t(String str, String str2, int i7) {
        w2.g.f27064b.post(new np0(this, str, str2, i7));
    }

    public final void u(String str, String str2, long j7) {
        w2.g.f27064b.post(new op0(this, str, str2, j7));
    }

    public final void v(String str, String str2, String str3, String str4) {
        w2.g.f27064b.post(new pp0(this, str, str2, str3, str4));
    }

    final /* synthetic */ void w(String str, Map map) {
        bo0 bo0Var = (bo0) this.f14549s.get();
        if (bo0Var != null) {
            bo0Var.B("onPrecacheEvent", map);
        }
    }

    @Override // l3.h
    public void a() {
    }

    protected void k(int i7) {
    }

    protected void m(int i7) {
    }

    protected void n(int i7) {
    }

    protected void o(int i7) {
    }
}
