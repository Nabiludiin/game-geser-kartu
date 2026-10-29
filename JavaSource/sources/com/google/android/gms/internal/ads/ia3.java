package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class ia3 implements la3 {

    /* renamed from: e, reason: collision with root package name */
    private static final ia3 f9938e = new ia3(new ma3());

    /* renamed from: a, reason: collision with root package name */
    private Date f9939a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9940b;

    /* renamed from: c, reason: collision with root package name */
    private final ma3 f9941c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9942d;

    private ia3(ma3 ma3Var) {
        this.f9941c = ma3Var;
    }

    public static ia3 a() {
        return f9938e;
    }

    public final Date b() {
        Date date = this.f9939a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c(Context context) {
        if (this.f9940b) {
            return;
        }
        ma3 ma3Var = this.f9941c;
        ma3Var.d(context);
        ma3Var.g(this);
        ma3Var.e();
        this.f9942d = ma3Var.f12158r;
        this.f9940b = true;
    }

    @Override // com.google.android.gms.internal.ads.la3
    public final void e(boolean z7) {
        if (!this.f9942d && z7) {
            Date date = new Date();
            Date date2 = this.f9939a;
            if (date2 == null || date.after(date2)) {
                this.f9939a = date;
                if (this.f9940b) {
                    Iterator it = ka3.a().f().iterator();
                    while (it.hasNext()) {
                        ((q93) it.next()).g().n(b());
                    }
                }
            }
        }
        this.f9942d = z7;
    }
}
