package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final ao f11715h;

    public lp(ko koVar, String str, String str2, ak akVar, int i7, int i8, ao aoVar) {
        super(koVar, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", akVar, i7, 94);
        this.f11715h = aoVar;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        int intValue = ((Integer) this.f5899e.invoke(null, this.f11715h.b())).intValue();
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.o0(mk.a(intValue));
        }
    }
}
