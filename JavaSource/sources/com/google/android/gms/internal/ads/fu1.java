package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MyApplication */
public final class fu1 {

    /* renamed from: a, reason: collision with root package name */
    private final pd1 f8491a;

    /* renamed from: b, reason: collision with root package name */
    private final zn1 f8492b;

    /* renamed from: c, reason: collision with root package name */
    private final bq1 f8493c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f8494d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f8495e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f8496f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8497g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8498h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8499i;

    public fu1(Looper looper, pd1 pd1Var, bq1 bq1Var) {
        this(new CopyOnWriteArraySet(), looper, pd1Var, bq1Var, true);
    }

    private final void h() {
        if (this.f8499i) {
            rx3.h(Thread.currentThread() == this.f8492b.a().getThread());
        }
    }

    public final fu1 a(Looper looper, bq1 bq1Var) {
        return new fu1(this.f8494d, looper, this.f8491a, bq1Var, this.f8499i);
    }

    public final void b(Object obj) {
        synchronized (this.f8497g) {
            try {
                if (this.f8498h) {
                    return;
                }
                this.f8494d.add(new cr1(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        h();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f8494d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            cr1 cr1Var = (cr1) it.next();
            if (cr1Var.f6583a.equals(obj)) {
                cr1Var.a(this.f8493c);
                copyOnWriteArraySet.remove(cr1Var);
            }
        }
    }

    public final void d(final int i7, final ap1 ap1Var) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f8494d);
        this.f8496f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.ds1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ap1 ap1Var2 = ap1Var;
                    ((cr1) it.next()).b(i7, ap1Var2);
                }
            }
        });
    }

    public final void e() {
        h();
        ArrayDeque arrayDeque = this.f8496f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        zn1 zn1Var = this.f8492b;
        if (!zn1Var.b(1)) {
            zn1Var.l(zn1Var.R(1));
        }
        ArrayDeque arrayDeque2 = this.f8495e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void f() {
        h();
        synchronized (this.f8497g) {
            this.f8498h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f8494d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((cr1) it.next()).a(this.f8493c);
        }
        copyOnWriteArraySet.clear();
    }

    final /* synthetic */ boolean g(Message message) {
        Iterator it = this.f8494d.iterator();
        while (it.hasNext()) {
            ((cr1) it.next()).c(this.f8493c);
            if (this.f8492b.b(1)) {
                break;
            }
        }
        return true;
    }

    private fu1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, pd1 pd1Var, bq1 bq1Var, boolean z7) {
        this.f8491a = pd1Var;
        this.f8494d = copyOnWriteArraySet;
        this.f8493c = bq1Var;
        this.f8497g = new Object();
        this.f8495e = new ArrayDeque();
        this.f8496f = new ArrayDeque();
        this.f8492b = pd1Var.c(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.et1
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                fu1.this.g(message);
                return true;
            }
        });
        this.f8499i = z7;
    }
}
