package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: MyApplication */
final class q extends HandlerThread implements Handler.Callback {

    /* renamed from: q, reason: collision with root package name */
    private vj1 f14181q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f14182r;

    /* renamed from: s, reason: collision with root package name */
    private Error f14183s;

    /* renamed from: t, reason: collision with root package name */
    private RuntimeException f14184t;

    /* renamed from: u, reason: collision with root package name */
    private r f14185u;

    public q() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final r a(int i7) {
        boolean z7;
        start();
        this.f14182r = new Handler(getLooper(), this);
        this.f14181q = new vj1(this.f14182r, null);
        synchronized (this) {
            z7 = false;
            this.f14182r.obtainMessage(1, i7, 0).sendToTarget();
            while (this.f14185u == null && this.f14184t == null && this.f14183s == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f14184t;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f14183s;
        if (error != null) {
            throw error;
        }
        r rVar = this.f14185u;
        rVar.getClass();
        return rVar;
    }

    public final void b() {
        Handler handler = this.f14182r;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        vj1 vj1Var;
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    try {
                        int i8 = message.arg1;
                        vj1 vj1Var2 = this.f14181q;
                        if (vj1Var2 == null) {
                            throw null;
                        }
                        vj1Var2.a(i8);
                        this.f14185u = new r(this, this.f14181q.c(), i8 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (wk1 e8) {
                        gv1.f("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                        this.f14184t = new IllegalStateException(e8);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e9) {
                    gv1.f("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f14183s = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    gv1.f("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f14184t = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    vj1Var = this.f14181q;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (vj1Var == null) {
                    throw null;
                }
                vj1Var.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
