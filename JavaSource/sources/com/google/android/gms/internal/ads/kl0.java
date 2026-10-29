package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: MyApplication */
public final class kl0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f11093a;

    /* renamed from: b, reason: collision with root package name */
    private final tl0 f11094b;

    /* renamed from: e, reason: collision with root package name */
    private final String f11097e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11098f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f11096d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f11099g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f11100h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f11101i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f11102j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f11103k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f11095c = new LinkedList();

    kl0(com.google.android.gms.common.util.e eVar, tl0 tl0Var, String str, String str2) {
        this.f11093a = eVar;
        this.f11094b = tl0Var;
        this.f11097e = str;
        this.f11098f = str2;
    }

    public final void a(s2.b5 b5Var) {
        synchronized (this.f11096d) {
            long b8 = this.f11093a.b();
            this.f11102j = b8;
            this.f11094b.e(b5Var, b8);
        }
    }

    public final void b() {
        synchronized (this.f11096d) {
            this.f11094b.f();
        }
    }

    public final void c() {
        synchronized (this.f11096d) {
            this.f11094b.g();
        }
    }

    public final void d(long j7) {
        synchronized (this.f11096d) {
            try {
                this.f11103k = j7;
                if (j7 != -1) {
                    this.f11094b.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f11096d) {
            try {
                if (this.f11103k != -1 && this.f11099g == -1) {
                    this.f11099g = this.f11093a.b();
                    this.f11094b.a(this);
                }
                this.f11094b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f11096d) {
            try {
                if (this.f11103k != -1) {
                    jl0 jl0Var = new jl0(this);
                    jl0Var.c();
                    this.f11095c.add(jl0Var);
                    this.f11101i++;
                    tl0 tl0Var = this.f11094b;
                    tl0Var.c();
                    tl0Var.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f11096d) {
            try {
                if (this.f11103k != -1) {
                    LinkedList linkedList = this.f11095c;
                    if (!linkedList.isEmpty()) {
                        jl0 jl0Var = (jl0) linkedList.getLast();
                        if (jl0Var.a() == -1) {
                            jl0Var.b();
                            this.f11094b.a(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(boolean z7) {
        synchronized (this.f11096d) {
            try {
                if (this.f11103k != -1) {
                    this.f11100h = this.f11093a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle i() {
        Bundle bundle;
        synchronized (this.f11096d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f11097e);
                bundle.putString("slotid", this.f11098f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f11102j);
                bundle.putLong("tresponse", this.f11103k);
                bundle.putLong("timp", this.f11099g);
                bundle.putLong("tload", this.f11100h);
                bundle.putLong("pcc", this.f11101i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f11095c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jl0) it.next()).d());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String j() {
        return this.f11097e;
    }

    final /* synthetic */ com.google.android.gms.common.util.e k() {
        return this.f11093a;
    }
}
