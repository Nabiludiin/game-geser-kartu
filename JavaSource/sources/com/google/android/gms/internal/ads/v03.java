package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class v03 {

    /* renamed from: a, reason: collision with root package name */
    private s2.b5 f17321a;

    /* renamed from: b, reason: collision with root package name */
    private s2.g5 f17322b;

    /* renamed from: c, reason: collision with root package name */
    private String f17323c;

    /* renamed from: d, reason: collision with root package name */
    private s2.u4 f17324d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17325e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f17326f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f17327g;

    /* renamed from: h, reason: collision with root package name */
    private z10 f17328h;

    /* renamed from: i, reason: collision with root package name */
    private s2.m5 f17329i;

    /* renamed from: j, reason: collision with root package name */
    private n2.a f17330j;

    /* renamed from: k, reason: collision with root package name */
    private n2.f f17331k;

    /* renamed from: l, reason: collision with root package name */
    private s2.l1 f17332l;

    /* renamed from: n, reason: collision with root package name */
    private f80 f17334n;

    /* renamed from: r, reason: collision with root package name */
    private ai2 f17338r;

    /* renamed from: t, reason: collision with root package name */
    private Bundle f17340t;

    /* renamed from: v, reason: collision with root package name */
    private s2.p1 f17342v;

    /* renamed from: m, reason: collision with root package name */
    private int f17333m = 1;

    /* renamed from: o, reason: collision with root package name */
    private final j03 f17335o = new j03();

    /* renamed from: p, reason: collision with root package name */
    private boolean f17336p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17337q = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17339s = false;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicLong f17341u = new AtomicLong();

    public final s2.b5 A() {
        return this.f17321a;
    }

    public final v03 B(s2.g5 g5Var) {
        this.f17322b = g5Var;
        return this;
    }

    public final v03 C(boolean z7) {
        this.f17336p = z7;
        return this;
    }

    public final v03 D(boolean z7) {
        this.f17337q = z7;
        return this;
    }

    public final s2.g5 E() {
        return this.f17322b;
    }

    public final v03 F(String str) {
        this.f17323c = str;
        return this;
    }

    public final String G() {
        return this.f17323c;
    }

    public final v03 H(s2.u4 u4Var) {
        this.f17324d = u4Var;
        return this;
    }

    public final j03 I() {
        return this.f17335o;
    }

    public final v03 J(boolean z7) {
        this.f17325e = z7;
        return this;
    }

    public final v03 K(int i7) {
        this.f17333m = i7;
        return this;
    }

    public final v03 L(ArrayList arrayList) {
        this.f17326f = arrayList;
        return this;
    }

    public final v03 M(ArrayList arrayList) {
        this.f17327g = arrayList;
        return this;
    }

    public final v03 N(z10 z10Var) {
        this.f17328h = z10Var;
        return this;
    }

    public final v03 O(s2.m5 m5Var) {
        this.f17329i = m5Var;
        return this;
    }

    public final v03 P(f80 f80Var) {
        this.f17334n = f80Var;
        this.f17324d = new s2.u4(false, true, false);
        return this;
    }

    public final v03 Q(n2.f fVar) {
        this.f17331k = fVar;
        if (fVar != null) {
            this.f17325e = fVar.a();
            this.f17332l = fVar.M0();
        }
        return this;
    }

    public final v03 R(n2.a aVar) {
        this.f17330j = aVar;
        if (aVar != null) {
            this.f17325e = aVar.M0();
        }
        return this;
    }

    public final v03 S(ai2 ai2Var) {
        this.f17338r = ai2Var;
        return this;
    }

    public final v03 T(boolean z7) {
        this.f17339s = true;
        return this;
    }

    public final v03 U(Bundle bundle) {
        this.f17340t = bundle;
        return this;
    }

    public final long V() {
        return this.f17341u.get();
    }

    public final v03 W(long j7) {
        this.f17341u.set(j7);
        return this;
    }

    public final v03 X(w03 w03Var) {
        this.f17335o.a(w03Var.f17970p.f10839a);
        this.f17321a = w03Var.f17958d;
        this.f17322b = w03Var.f17960f;
        this.f17342v = w03Var.f17976v;
        this.f17323c = w03Var.f17961g;
        this.f17324d = w03Var.f17955a;
        this.f17326f = w03Var.f17962h;
        this.f17327g = w03Var.f17963i;
        this.f17328h = w03Var.f17964j;
        this.f17329i = w03Var.f17965k;
        R(w03Var.f17967m);
        Q(w03Var.f17968n);
        this.f17336p = w03Var.f17971q;
        this.f17337q = w03Var.f17972r;
        this.f17338r = w03Var.f17957c;
        this.f17339s = w03Var.f17973s;
        this.f17340t = w03Var.f17974t;
        this.f17341u.set(w03Var.f17975u.get());
        return this;
    }

    public final w03 Y() {
        p3.o.n(this.f17323c, "ad unit must not be null");
        p3.o.n(this.f17322b, "ad size must not be null");
        p3.o.n(this.f17321a, "ad request must not be null");
        return new w03(this, null);
    }

    public final boolean a() {
        return this.f17336p;
    }

    public final boolean b() {
        return this.f17337q;
    }

    final /* synthetic */ s2.b5 c() {
        return this.f17321a;
    }

    final /* synthetic */ s2.g5 d() {
        return this.f17322b;
    }

    final /* synthetic */ String e() {
        return this.f17323c;
    }

    final /* synthetic */ s2.u4 f() {
        return this.f17324d;
    }

    final /* synthetic */ boolean g() {
        return this.f17325e;
    }

    final /* synthetic */ ArrayList h() {
        return this.f17326f;
    }

    final /* synthetic */ ArrayList i() {
        return this.f17327g;
    }

    final /* synthetic */ z10 j() {
        return this.f17328h;
    }

    final /* synthetic */ s2.m5 k() {
        return this.f17329i;
    }

    final /* synthetic */ n2.a l() {
        return this.f17330j;
    }

    final /* synthetic */ n2.f m() {
        return this.f17331k;
    }

    final /* synthetic */ s2.l1 n() {
        return this.f17332l;
    }

    final /* synthetic */ int o() {
        return this.f17333m;
    }

    final /* synthetic */ f80 p() {
        return this.f17334n;
    }

    final /* synthetic */ j03 q() {
        return this.f17335o;
    }

    final /* synthetic */ boolean r() {
        return this.f17336p;
    }

    final /* synthetic */ boolean s() {
        return this.f17337q;
    }

    final /* synthetic */ ai2 t() {
        return this.f17338r;
    }

    final /* synthetic */ boolean u() {
        return this.f17339s;
    }

    final /* synthetic */ Bundle v() {
        return this.f17340t;
    }

    final /* synthetic */ AtomicLong w() {
        return this.f17341u;
    }

    public final v03 x(s2.p1 p1Var) {
        this.f17342v = p1Var;
        return this;
    }

    final /* synthetic */ s2.p1 y() {
        return this.f17342v;
    }

    public final v03 z(s2.b5 b5Var) {
        this.f17321a = b5Var;
        return this;
    }
}
