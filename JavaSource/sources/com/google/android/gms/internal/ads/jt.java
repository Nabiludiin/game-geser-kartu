package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import m2.a;

/* compiled from: MyApplication */
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    private s2.v0 f10750a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10751b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10752c;

    /* renamed from: d, reason: collision with root package name */
    private final s2.i3 f10753d;

    /* renamed from: e, reason: collision with root package name */
    private final a.AbstractC0112a f10754e;

    /* renamed from: f, reason: collision with root package name */
    private final gb0 f10755f = new gb0();

    /* renamed from: g, reason: collision with root package name */
    private final s2.f5 f10756g = s2.f5.f26092a;

    public jt(Context context, String str, s2.i3 i3Var, a.AbstractC0112a abstractC0112a) {
        this.f10751b = context;
        this.f10752c = str;
        this.f10753d = i3Var;
        this.f10754e = abstractC0112a;
    }

    public final void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            s2.g5 P0 = s2.g5.P0();
            s2.w b8 = s2.z.b();
            Context context = this.f10751b;
            String str = this.f10752c;
            s2.v0 a8 = b8.a(context, P0, str, this.f10755f);
            this.f10750a = a8;
            if (a8 != null) {
                s2.i3 i3Var = this.f10753d;
                i3Var.o(currentTimeMillis);
                this.f10750a.j3(new ws(this.f10754e, str));
                this.f10750a.U0(this.f10756g.a(context, i3Var));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
