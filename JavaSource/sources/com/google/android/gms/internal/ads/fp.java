package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
public final class fp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final lo f8372h;

    public fp(ko koVar, String str, String str2, ak akVar, int i7, int i8, lo loVar) {
        super(koVar, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", akVar, i7, 85);
        this.f8372h = loVar;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        Method method = this.f5899e;
        lo loVar = this.f8372h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(loVar.f()), Long.valueOf(loVar.g()), Long.valueOf(loVar.i()), Long.valueOf(loVar.h()));
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.c0(jArr[0]);
            akVar.d0(jArr[1]);
        }
    }
}
