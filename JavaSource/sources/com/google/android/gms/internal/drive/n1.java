package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

final class n1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    private final i1 f20687a;

    /* renamed from: b, reason: collision with root package name */
    private final l2 f20688b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20689c;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f20690d;

    private n1(l2 l2Var, b0 b0Var, i1 i1Var) {
        this.f20688b = l2Var;
        this.f20689c = b0Var.f(i1Var);
        this.f20690d = b0Var;
        this.f20687a = i1Var;
    }

    static n1 h(l2 l2Var, b0 b0Var, i1 i1Var) {
        return new n1(l2Var, b0Var, i1Var);
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final int a(Object obj) {
        l2 l2Var = this.f20688b;
        int h8 = l2Var.h(l2Var.g(obj));
        return this.f20689c ? h8 + this.f20690d.c(obj).m() : h8;
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final void b(Object obj, f3 f3Var) {
        Iterator c8 = this.f20690d.c(obj).c();
        if (c8.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) c8.next()).getKey());
            throw null;
        }
        l2 l2Var = this.f20688b;
        l2Var.b(l2Var.g(obj), f3Var);
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final void c(Object obj, Object obj2) {
        w1.g(this.f20688b, obj, obj2);
        if (this.f20689c) {
            w1.e(this.f20690d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final void d(Object obj) {
        this.f20688b.c(obj);
        this.f20690d.e(obj);
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final boolean e(Object obj) {
        return this.f20690d.c(obj).b();
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final boolean f(Object obj, Object obj2) {
        if (!this.f20688b.g(obj).equals(this.f20688b.g(obj2))) {
            return false;
        }
        if (this.f20689c) {
            return this.f20690d.c(obj).equals(this.f20690d.c(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final int g(Object obj) {
        int hashCode = this.f20688b.g(obj).hashCode();
        return this.f20689c ? (hashCode * 53) + this.f20690d.c(obj).hashCode() : hashCode;
    }
}
