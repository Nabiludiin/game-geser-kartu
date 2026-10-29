package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: MyApplication */
public final class rp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private List f15140h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f15141i;

    public rp(ko koVar, String str, String str2, ak akVar, int i7, int i8, Context context) {
        super(koVar, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", akVar, i7, 31);
        this.f15140h = null;
        this.f15141i = context;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        ak akVar = this.f5898d;
        akVar.E0(-1L);
        akVar.F0(-1L);
        Context context = this.f15141i;
        if (context == null) {
            context = this.f5895a.b();
        }
        if (this.f15140h == null) {
            this.f15140h = (List) this.f5899e.invoke(null, context);
        }
        List list = this.f15140h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (akVar) {
            akVar.E0(((Long) this.f15140h.get(0)).longValue());
            akVar.F0(((Long) this.f15140h.get(1)).longValue());
        }
    }
}
