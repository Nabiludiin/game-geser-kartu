package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class di3 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f7118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f7119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Activity f7120c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fi3 f7121d;

    di3(fi3 fi3Var, Context context, String str, View view, Activity activity) {
        this.f7118a = context;
        this.f7119b = view;
        this.f7120c = activity;
        Objects.requireNonNull(fi3Var);
        this.f7121d = fi3Var;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* bridge */ /* synthetic */ a5.d d(Object obj) {
        return this.f7121d.g().c(this.f7118a, null, this.f7119b, this.f7120c);
    }
}
