package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class op extends bq {

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f13431h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f13432i = new Object();

    public op(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", akVar, i7, 1);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        this.f5898d.e0("E");
        if (f13431h == null) {
            synchronized (f13432i) {
                try {
                    if (f13431h == null) {
                        f13431h = (String) this.f5899e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.e0(f13431h);
        }
    }
}
