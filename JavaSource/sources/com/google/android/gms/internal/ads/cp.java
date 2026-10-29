package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final long f6551h;

    public cp(ko koVar, String str, String str2, ak akVar, long j7, int i7, int i8) {
        super(koVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", akVar, i7, 25);
        this.f6551h = j7;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        long longValue = ((Long) this.f5899e.invoke(null, null)).longValue();
        ak akVar = this.f5898d;
        synchronized (akVar) {
            try {
                akVar.h0(longValue);
                long j7 = this.f6551h;
                if (j7 != 0) {
                    akVar.y0(longValue - j7);
                    akVar.B0(j7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
