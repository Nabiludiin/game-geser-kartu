package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final ro f17700h;

    /* renamed from: i, reason: collision with root package name */
    private long f17701i;

    public vp(ko koVar, String str, String str2, ak akVar, int i7, int i8, ro roVar) {
        super(koVar, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", akVar, i7, 53);
        this.f17700h = roVar;
        if (roVar != null) {
            this.f17701i = roVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        if (this.f17700h != null) {
            this.f5898d.L(((Long) this.f5899e.invoke(null, Long.valueOf(this.f17701i))).longValue());
        }
    }
}
