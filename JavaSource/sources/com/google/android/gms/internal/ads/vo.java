package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* compiled from: MyApplication */
public final class vo extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final Activity f17690h;

    /* renamed from: i, reason: collision with root package name */
    private final View f17691i;

    public vo(ko koVar, String str, String str2, ak akVar, int i7, int i8, View view, Activity activity) {
        super(koVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", akVar, i7, 62);
        this.f17691i = view;
        this.f17690h = activity;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        View view = this.f17691i;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) s2.b0.c().d(uy.Y2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f5899e.invoke(null, view, this.f17690h, bool);
        ak akVar = this.f5898d;
        synchronized (akVar) {
            try {
                akVar.W(((Long) objArr[0]).longValue());
                akVar.X(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    akVar.Y((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
