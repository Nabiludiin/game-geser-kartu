package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f5883h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f5884i = new Object();

    public bp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", akVar, i7, 44);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        if (f5883h == null) {
            synchronized (f5884i) {
                try {
                    if (f5883h == null) {
                        f5883h = (Long) this.f5899e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.F(f5883h.longValue());
        }
    }
}
