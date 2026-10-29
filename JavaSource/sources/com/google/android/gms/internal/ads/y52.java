package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y52 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19379a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f19380b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f19381c;

    /* renamed from: d, reason: collision with root package name */
    private final h85 f19382d;

    /* renamed from: e, reason: collision with root package name */
    private final w2.a f19383e;

    /* renamed from: f, reason: collision with root package name */
    private final u52 f19384f;

    /* renamed from: g, reason: collision with root package name */
    private final rx1 f19385g;

    y52(Context context, z64 z64Var, z64 z64Var2, h85 h85Var, w2.a aVar, u52 u52Var, rx1 rx1Var) {
        this.f19379a = context;
        this.f19380b = z64Var;
        this.f19381c = z64Var2;
        this.f19382d = h85Var;
        this.f19383e = aVar;
        this.f19384f = u52Var;
        this.f19385g = rx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void c() {
        try {
            ((w62) this.f19382d.b()).c0(this.f19383e.f27051q);
            if (((Boolean) s2.b0.c().d(uy.Te)).booleanValue()) {
                qx1 a8 = this.f19385g.a();
                a8.c("action", "ptard");
                a8.c("ptard", "l");
                a8.d();
            }
        } catch (RemoteException | NullPointerException e8) {
            if (((Boolean) s2.b0.c().d(uy.Ue)).booleanValue()) {
                r2.t.l().i(e8, "Preconnect Local");
            }
        }
    }

    public final void a() {
        r2.t.g();
        if (v2.f2.g(this.f19379a.getPackageName())) {
            this.f19381c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.w52
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y52.this.b();
                }
            });
            return;
        }
        v52 v52Var = new v52(this);
        a62 b8 = this.f19384f.b();
        b8.b(v52Var);
        final g42 a8 = b8.a().a();
        z64 z64Var = this.f19380b;
        Objects.requireNonNull(a8);
        z64Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x52
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                g42.this.d();
            }
        });
    }

    final /* synthetic */ rx1 d() {
        return this.f19385g;
    }
}
