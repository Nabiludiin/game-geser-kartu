package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f9598h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f9599i = new Object();

    public hp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", akVar, i7, 22);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        if (f9598h == null) {
            synchronized (f9599i) {
                try {
                    if (f9598h == null) {
                        f9598h = (Long) this.f5899e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.A0(f9598h.longValue());
        }
    }
}
