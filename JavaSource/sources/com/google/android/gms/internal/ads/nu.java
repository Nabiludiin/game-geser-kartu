package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class nu {

    /* renamed from: a, reason: collision with root package name */
    cr f12922a;

    /* renamed from: b, reason: collision with root package name */
    boolean f12923b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f12924c;

    public nu() {
        this.f12924c = w2.c.f27059b;
    }

    final /* synthetic */ ExecutorService a() {
        return this.f12924c;
    }

    public nu(final Context context) {
        ExecutorService executorService = w2.c.f27059b;
        this.f12924c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ju
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) s2.b0.c().d(uy.J5)).booleanValue();
                Context context2 = context;
                nu nuVar = nu.this;
                if (booleanValue) {
                    try {
                        nuVar.f12922a = (cr) w2.t.a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", ku.f11240a);
                        nuVar.f12922a.S4(w3.b.C1(context2), "GMA_SDK");
                        nuVar.f12923b = true;
                    } catch (RemoteException | NullPointerException | w2.s unused) {
                        w2.p.a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
