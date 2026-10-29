package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class a41 implements gr {

    /* renamed from: q, reason: collision with root package name */
    private final mr0 f4715q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f4716r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f4717s = new AtomicReference();

    a41(mr0 mr0Var, Executor executor) {
        this.f4715q = mr0Var;
        this.f4716r = executor;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final synchronized void t(fr frVar) {
        final mr0 mr0Var = this.f4715q;
        if (mr0Var != null) {
            if (((Boolean) s2.b0.c().d(uy.Fd)).booleanValue()) {
                if (frVar.f8430j) {
                    AtomicReference atomicReference = this.f4717s;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f4716r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.z31
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                mr0.this.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.f4717s;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f4716r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y31
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                mr0.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
