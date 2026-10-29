package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import n2.e;

/* compiled from: MyApplication */
public final class w03 {

    /* renamed from: a, reason: collision with root package name */
    public final s2.u4 f17955a;

    /* renamed from: b, reason: collision with root package name */
    public final f80 f17956b;

    /* renamed from: c, reason: collision with root package name */
    public final ai2 f17957c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.b5 f17958d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f17959e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.g5 f17960f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17961g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17962h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17963i;

    /* renamed from: j, reason: collision with root package name */
    public final z10 f17964j;

    /* renamed from: k, reason: collision with root package name */
    public final s2.m5 f17965k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17966l;

    /* renamed from: m, reason: collision with root package name */
    public final n2.a f17967m;

    /* renamed from: n, reason: collision with root package name */
    public final n2.f f17968n;

    /* renamed from: o, reason: collision with root package name */
    public final s2.l1 f17969o;

    /* renamed from: p, reason: collision with root package name */
    public final k03 f17970p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f17971q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17972r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17973s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f17974t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f17975u;

    /* renamed from: v, reason: collision with root package name */
    public final s2.p1 f17976v;

    /* synthetic */ w03(v03 v03Var, byte[] bArr) {
        this.f17960f = v03Var.d();
        this.f17961g = v03Var.e();
        this.f17976v = v03Var.y();
        this.f17959e = v03Var.c().R;
        s2.b5 c8 = v03Var.c();
        s2.b5 c9 = v03Var.c();
        s2.b5 c10 = v03Var.c();
        s2.b5 c11 = v03Var.c();
        s2.b5 c12 = v03Var.c();
        s2.b5 c13 = v03Var.c();
        s2.b5 c14 = v03Var.c();
        int i7 = v03Var.c().f26056q;
        long j7 = c14.f26057r;
        Bundle bundle = c13.f26058s;
        int i8 = c12.f26059t;
        List list = c11.f26060u;
        boolean z7 = c10.f26061v;
        int i9 = c9.f26062w;
        boolean z8 = true;
        if (!c8.f26063x && !v03Var.g()) {
            z8 = false;
        }
        s2.b5 b5Var = new s2.b5(i7, j7, bundle, i8, list, z7, i9, z8, v03Var.c().f26064y, v03Var.c().f26065z, v03Var.c().A, v03Var.c().B, v03Var.c().C, v03Var.c().D, v03Var.c().E, v03Var.c().F, v03Var.c().G, v03Var.c().H, v03Var.c().I, v03Var.c().J, v03Var.c().K, v03Var.c().L, v2.f2.A(v03Var.c().M), v03Var.c().N, v03Var.c().O, v03Var.c().P, v03Var.c().Q);
        this.f17958d = b5Var;
        this.f17955a = v03Var.f() != null ? v03Var.f() : v03Var.j() != null ? v03Var.j().f19959v : null;
        this.f17962h = v03Var.h();
        this.f17963i = v03Var.i();
        this.f17964j = v03Var.h() == null ? null : v03Var.j() == null ? new z10(new e.a().a()) : v03Var.j();
        this.f17965k = v03Var.k();
        this.f17966l = v03Var.o();
        this.f17967m = v03Var.l();
        this.f17968n = v03Var.m();
        this.f17969o = v03Var.n();
        this.f17956b = v03Var.p();
        this.f17970p = new k03(v03Var.q(), null);
        this.f17971q = v03Var.r();
        this.f17972r = v03Var.s();
        this.f17957c = v03Var.t();
        this.f17973s = v03Var.u();
        this.f17974t = v03Var.v();
        this.f17975u = b5Var.Q != 0 ? new AtomicLong(b5Var.Q) : v03Var.w();
    }

    public final boolean a() {
        return this.f17961g.matches((String) s2.b0.c().d(uy.J3));
    }
}
