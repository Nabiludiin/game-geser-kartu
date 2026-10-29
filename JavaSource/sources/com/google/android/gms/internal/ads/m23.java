package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: MyApplication */
final class m23 {

    /* renamed from: b, reason: collision with root package name */
    private final int f12040b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12041c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f12039a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final m33 f12042d = new m33();

    public m23(int i7, int i8) {
        this.f12040b = i7;
        this.f12041c = i8;
    }

    private final void i() {
        while (true) {
            LinkedList linkedList = this.f12039a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (r2.t.o().a() - ((w23) linkedList.getFirst()).f17995d < this.f12041c) {
                return;
            }
            this.f12042d.c();
            linkedList.remove();
        }
    }

    public final boolean a(w23 w23Var) {
        this.f12042d.a();
        i();
        LinkedList linkedList = this.f12039a;
        if (linkedList.size() == this.f12040b) {
            return false;
        }
        linkedList.add(w23Var);
        return true;
    }

    public final w23 b() {
        m33 m33Var = this.f12042d;
        m33Var.a();
        i();
        LinkedList linkedList = this.f12039a;
        if (linkedList.isEmpty()) {
            return null;
        }
        w23 w23Var = (w23) linkedList.remove();
        if (w23Var != null) {
            m33Var.b();
        }
        return w23Var;
    }

    public final int c() {
        i();
        return this.f12039a.size();
    }

    public final long d() {
        return this.f12042d.d();
    }

    public final long e() {
        return this.f12042d.e();
    }

    public final int f() {
        return this.f12042d.f();
    }

    public final String g() {
        return this.f12042d.h();
    }

    public final k33 h() {
        return this.f12042d.g();
    }
}
