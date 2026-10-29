package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
public final class mu {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12424a;

    /* renamed from: b, reason: collision with root package name */
    private int f12425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nu f12426c;

    /* synthetic */ mu(nu nuVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(nuVar);
        this.f12426c = nuVar;
        this.f12424a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void c() {
        try {
            nu nuVar = this.f12426c;
            if (nuVar.f12923b) {
                nuVar.f12922a.H5(this.f12424a);
                nuVar.f12922a.I(0);
                nuVar.f12922a.S0(this.f12425b);
                nuVar.f12922a.O4(null);
                nuVar.f12922a.e();
            }
        } catch (RemoteException e8) {
            w2.p.b("Clearcut log failed", e8);
        }
    }

    public final synchronized void a() {
        this.f12426c.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mu.this.c();
            }
        });
    }

    public final mu b(int i7) {
        this.f12425b = i7;
        return this;
    }
}
