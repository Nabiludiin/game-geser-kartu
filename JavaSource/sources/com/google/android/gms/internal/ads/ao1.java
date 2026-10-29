package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: MyApplication */
public final class ao1 {

    /* renamed from: h, reason: collision with root package name */
    public static final ao1 f5183h = new ao1(new yn1());

    /* renamed from: a, reason: collision with root package name */
    private final l30 f5184a;

    /* renamed from: b, reason: collision with root package name */
    private final i30 f5185b;

    /* renamed from: c, reason: collision with root package name */
    private final y30 f5186c;

    /* renamed from: d, reason: collision with root package name */
    private final v30 f5187d;

    /* renamed from: e, reason: collision with root package name */
    private final o80 f5188e;

    /* renamed from: f, reason: collision with root package name */
    private final r.h f5189f;

    /* renamed from: g, reason: collision with root package name */
    private final r.h f5190g;

    /* synthetic */ ao1(yn1 yn1Var, byte[] bArr) {
        this(yn1Var);
    }

    public final l30 a() {
        return this.f5184a;
    }

    public final i30 b() {
        return this.f5185b;
    }

    public final y30 c() {
        return this.f5186c;
    }

    public final v30 d() {
        return this.f5187d;
    }

    public final o80 e() {
        return this.f5188e;
    }

    public final r30 f(String str) {
        if (str == null) {
            return null;
        }
        return (r30) this.f5189f.get(str);
    }

    public final o30 g(String str) {
        return (o30) this.f5190g.get(str);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f5186c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f5184a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f5185b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f5189f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f5188e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList i() {
        r.h hVar = this.f5189f;
        ArrayList arrayList = new ArrayList(hVar.size());
        for (int i7 = 0; i7 < hVar.size(); i7++) {
            arrayList.add((String) hVar.i(i7));
        }
        return arrayList;
    }

    private ao1(yn1 yn1Var) {
        this.f5184a = yn1Var.f19685a;
        this.f5185b = yn1Var.f19686b;
        this.f5186c = yn1Var.f19687c;
        this.f5189f = new r.h(yn1Var.f19690f);
        this.f5190g = new r.h(yn1Var.f19691g);
        this.f5187d = yn1Var.f19688d;
        this.f5188e = yn1Var.f19689e;
    }
}
