package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class ei3 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f7647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f7649c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fi3 f7650d;

    ei3(fi3 fi3Var, Context context, String str, View view, Activity activity) {
        this.f7647a = context;
        this.f7648b = str;
        this.f7649c = view;
        Objects.requireNonNull(fi3Var);
        this.f7650d = fi3Var;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* bridge */ /* synthetic */ a5.d d(Object obj) {
        return this.f7650d.g().d(this.f7647a, this.f7648b, this.f7649c, null);
    }
}
