package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;
import p3.c;

/* compiled from: MyApplication */
public abstract class l42 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final im0 f11412a = new im0();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f11413b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f11414c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f11415d = false;

    /* renamed from: e, reason: collision with root package name */
    protected eh0 f11416e;

    /* renamed from: f, reason: collision with root package name */
    protected hg0 f11417f;

    static void c(Context context, a5.d dVar, Executor executor) {
        if (((Boolean) o00.f13130j.e()).booleanValue() || ((Boolean) o00.f13128h.e()).booleanValue()) {
            p64.r(dVar, new i42(context), executor);
        }
    }

    @Override // p3.c.a
    public void O(int i7) {
        int i8 = v2.n1.f26802b;
        w2.p.a("Cannot connect to remote service, fallback to local instance.");
    }

    public void a(k3.b bVar) {
        int i7 = v2.n1.f26802b;
        w2.p.a("Disconnected from remote ad request service.");
        this.f11412a.e(new b52(1));
    }

    protected final void b() {
        synchronized (this.f11413b) {
            try {
                this.f11415d = true;
                if (!this.f11417f.a()) {
                    if (this.f11417f.f()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f11417f.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
