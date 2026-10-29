package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class ol3 implements yk3 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f13378a;

    /* renamed from: b, reason: collision with root package name */
    private final h85 f13379b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f13380c;

    /* renamed from: d, reason: collision with root package name */
    private final ft3 f13381d;

    /* renamed from: e, reason: collision with root package name */
    private final h85 f13382e;

    /* renamed from: f, reason: collision with root package name */
    private final b95 f13383f;

    /* renamed from: g, reason: collision with root package name */
    private final li3 f13384g;

    ol3(ExecutorService executorService, h85 h85Var, h85 h85Var2, ft3 ft3Var, h85 h85Var3, b95 b95Var, li3 li3Var) {
        this.f13378a = executorService;
        this.f13379b = h85Var;
        this.f13380c = h85Var2;
        this.f13381d = ft3Var;
        this.f13382e = h85Var3;
        this.f13383f = b95Var;
        this.f13384g = li3Var;
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final String a() {
        return "1.808261137";
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d b() {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.nl3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ol3.this.h();
                return null;
            }
        }, this.f13378a);
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d c(Context context, String str, View view, Activity activity) {
        h85 h85Var = this.f13382e;
        Map d8 = this.f13381d.d();
        ((wl3) h85Var.b()).b(d8);
        gm3 c8 = ((gm3) this.f13383f.b()).c(context);
        c8.g(view);
        c8.f(null);
        c8.y(str);
        c8.b(d8);
        c8.e(jj3.CLICK);
        c8.d(xk.g1());
        return c8.a().a().a();
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d d(Context context) {
        gm3 c8 = ((gm3) this.f13383f.b()).c(context);
        c8.b(this.f13381d.b());
        c8.d(xk.g1());
        c8.e(jj3.QUERY);
        return c8.a().a().a();
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d e(Context context, String str, View view, Activity activity) {
        gm3 c8 = ((gm3) this.f13383f.b()).c(context);
        c8.g(view);
        c8.f(activity);
        c8.y(true != this.f13384g.l0() ? "" : null);
        c8.b(this.f13381d.c(context, view));
        c8.d(xk.g1());
        c8.e(jj3.VIEW);
        return c8.a().a().a();
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final int f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final void g(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((wl3) this.f13382e.b()).a((MotionEvent) inputEvent);
        }
    }

    final /* synthetic */ Void h() {
        ((jm3) this.f13380c.b()).a();
        ((dn3) this.f13379b.b()).a();
        return null;
    }
}
