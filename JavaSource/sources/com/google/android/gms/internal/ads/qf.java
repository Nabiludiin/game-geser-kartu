package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class qf {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f14418c = rf.f14885b;

    /* renamed from: a, reason: collision with root package name */
    private final List f14419a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f14420b = false;

    qf() {
    }

    public final synchronized void a(String str, long j7) {
        if (this.f14420b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f14419a.add(new pf(str, j7, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f14420b = true;
        List<pf> list = this.f14419a;
        long j7 = list.size() == 0 ? 0L : ((pf) list.get(list.size() - 1)).f13867c - ((pf) list.get(0)).f13867c;
        if (j7 > 0) {
            long j8 = ((pf) list.get(0)).f13867c;
            rf.b("(%-4d ms) %s", Long.valueOf(j7), str);
            for (pf pfVar : list) {
                long j9 = pfVar.f13867c;
                rf.b("(+%-4d) [%2d] %s", Long.valueOf(j9 - j8), Long.valueOf(pfVar.f13866b), pfVar.f13865a);
                j8 = j9;
            }
        }
    }

    protected final void finalize() {
        if (this.f14420b) {
            return;
        }
        b("Request on the loose");
        rf.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
