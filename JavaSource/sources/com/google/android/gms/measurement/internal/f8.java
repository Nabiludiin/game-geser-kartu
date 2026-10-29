package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* compiled from: MyApplication */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    final Context f22133a;

    /* renamed from: b, reason: collision with root package name */
    Boolean f22134b;

    /* renamed from: c, reason: collision with root package name */
    long f22135c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.h2 f22136d;

    /* renamed from: e, reason: collision with root package name */
    boolean f22137e;

    /* renamed from: f, reason: collision with root package name */
    final Long f22138f;

    /* renamed from: g, reason: collision with root package name */
    String f22139g;

    public f8(Context context, com.google.android.gms.internal.measurement.h2 h2Var, Long l7) {
        this.f22137e = true;
        p3.o.m(context);
        Context applicationContext = context.getApplicationContext();
        p3.o.m(applicationContext);
        this.f22133a = applicationContext;
        this.f22138f = l7;
        if (h2Var != null) {
            this.f22136d = h2Var;
            this.f22137e = h2Var.f20995s;
            this.f22135c = h2Var.f20994r;
            this.f22139g = h2Var.f20997u;
            Bundle bundle = h2Var.f20996t;
            if (bundle != null) {
                this.f22134b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
