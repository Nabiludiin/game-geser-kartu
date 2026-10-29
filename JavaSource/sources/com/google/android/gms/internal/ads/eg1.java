package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class eg1 {

    /* renamed from: q, reason: collision with root package name */
    protected final Map f7606q = new HashMap();

    protected eg1(Set set) {
        D0(set);
    }

    public final synchronized void D0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w0((hi1) it.next());
        }
    }

    protected final synchronized void K0(final dg1 dg1Var) {
        for (Map.Entry entry : this.f7606q.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cg1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        dg1.this.d(key);
                    } catch (Throwable th) {
                        r2.t.l().j(th, "EventEmitter.notify");
                        v2.n1.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void w0(hi1 hi1Var) {
        y0(hi1Var.f9533a, hi1Var.f9534b);
    }

    public final synchronized void y0(Object obj, Executor executor) {
        this.f7606q.put(obj, executor);
    }
}
