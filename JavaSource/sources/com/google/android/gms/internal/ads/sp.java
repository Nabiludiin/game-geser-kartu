package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15734h;

    public sp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", akVar, i7, 61);
        this.f15734h = koVar.j();
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        long longValue = ((Long) this.f5899e.invoke(null, this.f5895a.b(), Boolean.valueOf(this.f15734h))).longValue();
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.U(longValue);
        }
    }
}
