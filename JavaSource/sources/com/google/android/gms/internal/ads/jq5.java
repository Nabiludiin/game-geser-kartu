package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public final class jq5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10717a;

    /* renamed from: b, reason: collision with root package name */
    public final xp5 f10718b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f10719c;

    private jq5(CopyOnWriteArrayList copyOnWriteArrayList, int i7, xp5 xp5Var) {
        this.f10719c = copyOnWriteArrayList;
        this.f10717a = 0;
        this.f10718b = xp5Var;
    }

    public final jq5 a(int i7, xp5 xp5Var) {
        return new jq5(this.f10719c, 0, xp5Var);
    }

    public final void b(Handler handler, kq5 kq5Var) {
        this.f10719c.add(new bq5(handler, kq5Var));
    }

    public final void c(kq5 kq5Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10719c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            bq5 bq5Var = (bq5) it.next();
            if (bq5Var.f5929b == kq5Var) {
                copyOnWriteArrayList.remove(bq5Var);
            }
        }
    }

    public final void d(final op5 op5Var, final tp5 tp5Var, final int i7) {
        i(new th1() { // from class: com.google.android.gms.internal.ads.iq5
            @Override // com.google.android.gms.internal.ads.th1
            public final /* synthetic */ void d(Object obj) {
                ((kq5) obj).p(0, jq5.this.f10718b, op5Var, tp5Var, i7);
            }
        });
    }

    public final void e(final op5 op5Var, final tp5 tp5Var) {
        i(new th1() { // from class: com.google.android.gms.internal.ads.cq5
            @Override // com.google.android.gms.internal.ads.th1
            public final /* synthetic */ void d(Object obj) {
                ((kq5) obj).c0(0, jq5.this.f10718b, op5Var, tp5Var);
            }
        });
    }

    public final void f(final op5 op5Var, final tp5 tp5Var) {
        i(new th1() { // from class: com.google.android.gms.internal.ads.dq5
            @Override // com.google.android.gms.internal.ads.th1
            public final /* synthetic */ void d(Object obj) {
                ((kq5) obj).V(0, jq5.this.f10718b, op5Var, tp5Var);
            }
        });
    }

    public final void g(final op5 op5Var, final tp5 tp5Var, final IOException iOException, final boolean z7) {
        i(new th1() { // from class: com.google.android.gms.internal.ads.fq5
            @Override // com.google.android.gms.internal.ads.th1
            public final /* synthetic */ void d(Object obj) {
                ((kq5) obj).j(0, jq5.this.f10718b, op5Var, tp5Var, iOException, z7);
            }
        });
    }

    public final void h(final tp5 tp5Var) {
        i(new th1() { // from class: com.google.android.gms.internal.ads.gq5
            @Override // com.google.android.gms.internal.ads.th1
            public final /* synthetic */ void d(Object obj) {
                ((kq5) obj).Q(0, jq5.this.f10718b, tp5Var);
            }
        });
    }

    public final void i(final th1 th1Var) {
        Iterator it = this.f10719c.iterator();
        while (it.hasNext()) {
            bq5 bq5Var = (bq5) it.next();
            final kq5 kq5Var = bq5Var.f5929b;
            hi2.A(bq5Var.f5928a, new Runnable() { // from class: com.google.android.gms.internal.ads.hq5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    th1.this.d(kq5Var);
                }
            });
        }
    }

    public jq5() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
