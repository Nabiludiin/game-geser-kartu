package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public final class nu5 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f12930a = new CopyOnWriteArrayList();

    public final void a(Handler handler, ou5 ou5Var) {
        b(ou5Var);
        this.f12930a.add(new mu5(handler, ou5Var));
    }

    public final void b(ou5 ou5Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12930a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            mu5 mu5Var = (mu5) it.next();
            if (mu5Var.c() == ou5Var) {
                mu5Var.a();
                copyOnWriteArrayList.remove(mu5Var);
            }
        }
    }

    public final void c(final int i7, final long j7, final long j8) {
        Iterator it = this.f12930a.iterator();
        while (it.hasNext()) {
            final mu5 mu5Var = (mu5) it.next();
            if (!mu5Var.d()) {
                mu5Var.b().post(new Runnable() { // from class: com.google.android.gms.internal.ads.lu5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        mu5.this.c().D(i7, j7, j8);
                    }
                });
            }
        }
    }
}
