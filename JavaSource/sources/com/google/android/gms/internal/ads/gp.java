package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* compiled from: MyApplication */
public final class gp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final Map f9059h;

    /* renamed from: i, reason: collision with root package name */
    private final View f9060i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f9061j;

    public gp(ko koVar, String str, String str2, ak akVar, int i7, int i8, Map map, View view, Context context) {
        super(koVar, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", akVar, i7, 85);
        this.f9059h = map;
        this.f9060i = view;
        this.f9061j = context;
    }

    private final long b(int i7) {
        Map map = this.f9059h;
        Integer valueOf = Integer.valueOf(i7);
        if (map.containsKey(valueOf)) {
            return ((Long) map.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        long[] jArr = {b(1), b(2)};
        Context context = this.f9061j;
        if (context == null) {
            context = this.f5895a.b();
        }
        long[] jArr2 = (long[]) this.f5899e.invoke(null, jArr, context, this.f9060i);
        long j7 = jArr2[0];
        Map map = this.f9059h;
        map.put(1, Long.valueOf(jArr2[1]));
        long j8 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.c0(j7);
            akVar.d0(j8);
        }
    }
}
