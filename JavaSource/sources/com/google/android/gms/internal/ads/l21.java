package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class l21 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11355a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11356b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11357c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f11358d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f11359e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f11360f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f11361g;

    /* renamed from: h, reason: collision with root package name */
    private final w85 f11362h;

    /* renamed from: i, reason: collision with root package name */
    private final w85 f11363i;

    /* renamed from: j, reason: collision with root package name */
    private final w85 f11364j;

    private l21(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        this.f11355a = w85Var;
        this.f11356b = w85Var2;
        this.f11357c = w85Var3;
        this.f11358d = w85Var4;
        this.f11359e = w85Var5;
        this.f11360f = w85Var6;
        this.f11361g = w85Var7;
        this.f11362h = w85Var8;
        this.f11363i = w85Var9;
        this.f11364j = w85Var10;
    }

    public static l21 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        return new l21(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8, w85Var9, w85Var10);
    }

    public static k21 d(q41 q41Var, Context context, d03 d03Var, View view, mr0 mr0Var, p41 p41Var, ao1 ao1Var, ri1 ri1Var, h85 h85Var, Executor executor) {
        return new k21(q41Var, context, d03Var, view, mr0Var, p41Var, ao1Var, ri1Var, h85Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k21 b() {
        return new k21(((a71) this.f11355a).b(), (Context) this.f11356b.b(), ((r21) this.f11357c).a(), ((q21) this.f11358d).a(), ((g31) this.f11359e).a(), ((s21) this.f11360f).a(), ((ul1) this.f11361g).a(), (ri1) this.f11362h.b(), m85.c(this.f11363i), (Executor) this.f11364j.b());
    }
}
