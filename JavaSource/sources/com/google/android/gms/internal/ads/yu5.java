package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

/* compiled from: MyApplication */
final class yu5 extends Handler implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final zu5 f19804q;

    /* renamed from: r, reason: collision with root package name */
    private final long f19805r;

    /* renamed from: s, reason: collision with root package name */
    private vu5 f19806s;

    /* renamed from: t, reason: collision with root package name */
    private IOException f19807t;

    /* renamed from: u, reason: collision with root package name */
    private int f19808u;

    /* renamed from: v, reason: collision with root package name */
    private Thread f19809v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f19810w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f19811x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ dv5 f19812y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu5(dv5 dv5Var, Looper looper, zu5 zu5Var, vu5 vu5Var, int i7, long j7) {
        super(looper);
        Objects.requireNonNull(dv5Var);
        this.f19812y = dv5Var;
        this.f19804q = zu5Var;
        this.f19806s = vu5Var;
        this.f19805r = j7;
    }

    private final void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = elapsedRealtime - this.f19805r;
        vu5 vu5Var = this.f19806s;
        vu5Var.getClass();
        vu5Var.c(this.f19804q, elapsedRealtime, j7, this.f19808u);
        this.f19807t = null;
        dv5 dv5Var = this.f19812y;
        yu5 j8 = dv5Var.j();
        j8.getClass();
        dv5Var.i().execute(j8);
    }

    public final void a(int i7) {
        IOException iOException = this.f19807t;
        if (iOException != null && this.f19808u > i7) {
            throw iOException;
        }
    }

    public final void b(long j7) {
        dv5 dv5Var = this.f19812y;
        rx3.h(dv5Var.j() == null);
        dv5Var.k(this);
        if (j7 > 0) {
            sendEmptyMessageDelayed(1, j7);
        } else {
            d();
        }
    }

    public final void c(boolean z7) {
        this.f19811x = z7;
        this.f19807t = null;
        if (hasMessages(1)) {
            this.f19810w = true;
            removeMessages(1);
            if (!z7) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f19810w = true;
                    this.f19804q.b();
                    Thread thread = this.f19809v;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.f19812y.k(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            vu5 vu5Var = this.f19806s;
            vu5Var.getClass();
            vu5Var.l(this.f19804q, elapsedRealtime, elapsedRealtime - this.f19805r, true);
            this.f19806s = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f19811x) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            d();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        dv5 dv5Var = this.f19812y;
        dv5Var.k(null);
        long j7 = this.f19805r;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = elapsedRealtime - j7;
        vu5 vu5Var = this.f19806s;
        vu5Var.getClass();
        if (this.f19810w) {
            vu5Var.l(this.f19804q, elapsedRealtime, j8, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 2) {
            try {
                vu5Var.i(this.f19804q, elapsedRealtime, j8);
                return;
            } catch (RuntimeException e8) {
                gv1.f("LoadTask", "Unexpected exception handling load completed", e8);
                this.f19812y.l(new cv5(e8));
                return;
            }
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19807t = iOException;
        int i9 = this.f19808u + 1;
        this.f19808u = i9;
        xu5 e9 = vu5Var.e(this.f19804q, elapsedRealtime, j8, iOException, i9);
        if (e9.b() == 3) {
            dv5Var.l(this.f19807t);
        } else if (e9.b() != 2) {
            if (e9.b() == 1) {
                this.f19808u = 1;
            }
            b(e9.c() != -9223372036854775807L ? e9.c() : Math.min((this.f19808u - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            synchronized (this) {
                z7 = this.f19810w;
                this.f19809v = Thread.currentThread();
            }
            if (!z7) {
                zu5 zu5Var = this.f19804q;
                String simpleName = zu5Var.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zu5Var.d();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19809v = null;
                Thread.interrupted();
            }
            if (this.f19811x) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e8) {
            if (this.f19811x) {
                return;
            }
            obtainMessage(3, e8).sendToTarget();
        } catch (Exception e9) {
            if (this.f19811x) {
                return;
            }
            gv1.f("LoadTask", "Unexpected exception loading stream", e9);
            obtainMessage(3, new cv5(e9)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f19811x) {
                return;
            }
            gv1.f("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new cv5(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f19811x) {
                gv1.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
