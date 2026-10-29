package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: MyApplication */
final class sf implements ff {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15590a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final se f15591b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f15592c;

    /* renamed from: d, reason: collision with root package name */
    private final xe f15593d;

    sf(se seVar, BlockingQueue blockingQueue, xe xeVar) {
        this.f15593d = xeVar;
        this.f15591b = seVar;
        this.f15592c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final synchronized void a(gf gfVar) {
        try {
            Map map = this.f15590a;
            String o7 = gfVar.o();
            List list = (List) map.remove(o7);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (rf.f14885b) {
                rf.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), o7);
            }
            gf gfVar2 = (gf) list.remove(0);
            map.put(o7, list);
            gfVar2.A(this);
            try {
                this.f15592c.put(gfVar2);
            } catch (InterruptedException e8) {
                rf.c("Couldn't add request to queue. %s", e8.toString());
                Thread.currentThread().interrupt();
                this.f15591b.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void b(gf gfVar, lf lfVar) {
        List list;
        pe peVar = lfVar.f11595b;
        if (peVar == null || peVar.a(System.currentTimeMillis())) {
            a(gfVar);
            return;
        }
        String o7 = gfVar.o();
        synchronized (this) {
            list = (List) this.f15590a.remove(o7);
        }
        if (list != null) {
            if (rf.f14885b) {
                rf.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), o7);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15593d.a((gf) it.next(), lfVar, null);
            }
        }
    }

    final synchronized boolean c(gf gfVar) {
        try {
            Map map = this.f15590a;
            String o7 = gfVar.o();
            if (!map.containsKey(o7)) {
                map.put(o7, null);
                gfVar.A(this);
                if (rf.f14885b) {
                    rf.b("new request, sending to network %s", o7);
                }
                return false;
            }
            List list = (List) map.get(o7);
            if (list == null) {
                list = new ArrayList();
            }
            gfVar.d("waiting-for-response");
            list.add(gfVar);
            map.put(o7, list);
            if (rf.f14885b) {
                rf.b("Request for cacheKey=%s is in flight, putting on hold.", o7);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
