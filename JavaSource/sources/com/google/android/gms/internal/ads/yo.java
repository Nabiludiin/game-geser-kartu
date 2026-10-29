package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class yo extends bq {

    /* renamed from: i, reason: collision with root package name */
    private static final cq f19696i = new cq();

    /* renamed from: h, reason: collision with root package name */
    private final Context f19697h;

    public yo(ko koVar, String str, String str2, ak akVar, int i7, int i8, Context context) {
        super(koVar, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", akVar, i7, 29);
        this.f19697h = context;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        this.f5898d.D0("E");
        Context context = this.f19697h;
        AtomicReference a8 = f19696i.a(context.getPackageName());
        if (a8.get() == null) {
            synchronized (a8) {
                try {
                    if (a8.get() == null) {
                        a8.set((String) this.f5899e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) a8.get();
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.D0(sl.a(str.getBytes(), true));
        }
    }
}
