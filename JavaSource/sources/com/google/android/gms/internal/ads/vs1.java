package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class vs1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final r2.a f17741a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17742b;

    /* renamed from: c, reason: collision with root package name */
    private final rx1 f17743c;

    /* renamed from: d, reason: collision with root package name */
    private final v82 f17744d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f17745e;

    /* renamed from: f, reason: collision with root package name */
    private final fn f17746f;

    /* renamed from: g, reason: collision with root package name */
    private final w2.a f17747g;

    /* renamed from: h, reason: collision with root package name */
    private final x73 f17748h;

    /* renamed from: i, reason: collision with root package name */
    private final i92 f17749i;

    /* renamed from: j, reason: collision with root package name */
    private final a13 f17750j;

    public vs1(Context context, Executor executor, fn fnVar, w2.a aVar, r2.a aVar2, ds0 ds0Var, v82 v82Var, x73 x73Var, rx1 rx1Var, i92 i92Var, a13 a13Var) {
        this.f17742b = context;
        this.f17745e = executor;
        this.f17746f = fnVar;
        this.f17747g = aVar;
        this.f17741a = aVar2;
        this.f17744d = v82Var;
        this.f17748h = x73Var;
        this.f17743c = rx1Var;
        this.f17749i = i92Var;
        this.f17750j = a13Var;
    }

    final /* synthetic */ r2.a a() {
        return this.f17741a;
    }

    final /* synthetic */ Context b() {
        return this.f17742b;
    }

    final /* synthetic */ rx1 c() {
        return this.f17743c;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        xs1 xs1Var = new xs1(this);
        xs1Var.a();
        return xs1Var;
    }

    final /* synthetic */ v82 d() {
        return this.f17744d;
    }

    final /* synthetic */ Executor e() {
        return this.f17745e;
    }

    final /* synthetic */ fn f() {
        return this.f17746f;
    }

    final /* synthetic */ w2.a g() {
        return this.f17747g;
    }

    final /* synthetic */ x73 h() {
        return this.f17748h;
    }

    final /* synthetic */ i92 i() {
        return this.f17749i;
    }

    final /* synthetic */ a13 j() {
        return this.f17750j;
    }
}
