package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final ln f12340h;

    /* renamed from: i, reason: collision with root package name */
    private final long f12341i;

    /* renamed from: j, reason: collision with root package name */
    private final long f12342j;

    public mp(ko koVar, String str, String str2, ak akVar, int i7, int i8, ln lnVar, long j7, long j8) {
        super(koVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", akVar, i7, 11);
        this.f12340h = lnVar;
        this.f12341i = j7;
        this.f12342j = j8;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        ln lnVar = this.f12340h;
        if (lnVar != null) {
            jn jnVar = new jn((String) this.f5899e.invoke(null, lnVar.b(), Long.valueOf(this.f12341i), Long.valueOf(this.f12342j)));
            ak akVar = this.f5898d;
            synchronized (akVar) {
                try {
                    akVar.t0(jnVar.f10649b.longValue());
                    if (jnVar.f10650c.longValue() >= 0) {
                        akVar.a0(jnVar.f10650c.longValue());
                    }
                    if (jnVar.f10651d.longValue() >= 0) {
                        akVar.b0(jnVar.f10651d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
