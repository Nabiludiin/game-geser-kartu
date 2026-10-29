package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
final class xc3 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    private final od3 f18742a;

    /* renamed from: b, reason: collision with root package name */
    private final id3 f18743b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18744c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18745d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18746e = false;

    xc3(Context context, Looper looper, id3 id3Var) {
        this.f18743b = id3Var;
        this.f18742a = new od3(context, looper, this, this, 12800000);
    }

    private final void c() {
        synchronized (this.f18744c) {
            try {
                od3 od3Var = this.f18742a;
                if (!od3Var.a()) {
                    if (od3Var.f()) {
                    }
                    Binder.flushPendingCommands();
                }
                od3Var.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b() {
        synchronized (this.f18744c) {
            try {
                if (!this.f18745d) {
                    this.f18745d = true;
                    this.f18742a.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        synchronized (this.f18744c) {
            try {
                if (this.f18746e) {
                    return;
                }
                this.f18746e = true;
                try {
                    this.f18742a.o0().H2(new md3(this.f18743b.e()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p3.c.a
    public final void O(int i7) {
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
    }
}
