package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class mn3 implements ho3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12315a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f12316b;

    /* renamed from: c, reason: collision with root package name */
    private final lu3 f12317c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12318d;

    mn3(ak akVar, Map map, li3 li3Var, nu3 nu3Var) {
        this.f12315a = map;
        this.f12316b = akVar;
        this.f12317c = nu3Var.a(112);
        this.f12318d = li3Var.p0();
    }

    public final Void a() {
        xk xkVar;
        try {
            try {
                this.f12317c.a();
                a5.d dVar = (a5.d) this.f12315a.get("gs");
                if (dVar != null && (xkVar = (xk) dVar.get(this.f12318d, TimeUnit.MILLISECONDS)) != null) {
                    ak akVar = this.f12316b;
                    synchronized (akVar) {
                        akVar.i0(xkVar.e1());
                        akVar.R(xkVar.b1());
                    }
                }
            } catch (Throwable th) {
                this.f12317c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e8) {
            this.f12317c.b(e8);
        }
        this.f12317c.c();
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }
}
