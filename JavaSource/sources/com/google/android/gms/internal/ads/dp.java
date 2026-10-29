package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f7218h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f7219i = new Object();

    public dp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", akVar, i7, 82);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        if (f7218h == null) {
            synchronized (f7219i) {
                try {
                    if (f7218h == null) {
                        f7218h = (String) this.f5899e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.Z(f7218h);
        }
    }
}
