package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: MyApplication */
public final class yr {

    /* renamed from: b, reason: collision with root package name */
    int f19730b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f19729a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f19731c = new LinkedList();

    public final boolean a(xr xrVar) {
        synchronized (this.f19729a) {
            try {
                return this.f19731c.contains(xrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(xr xrVar) {
        synchronized (this.f19729a) {
            try {
                Iterator it = this.f19731c.iterator();
                while (it.hasNext()) {
                    xr xrVar2 = (xr) it.next();
                    if (r2.t.l().q().d()) {
                        if (!r2.t.l().q().c() && !xrVar.equals(xrVar2) && xrVar2.c().equals(xrVar.c())) {
                            it.remove();
                            return true;
                        }
                    } else if (!xrVar.equals(xrVar2) && xrVar2.b().equals(xrVar.b())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(xr xrVar) {
        synchronized (this.f19729a) {
            try {
                List list = this.f19731c;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String sb2 = sb.toString();
                    int i7 = v2.n1.f26802b;
                    w2.p.a(sb2);
                    list.remove(0);
                }
                int i8 = this.f19730b;
                this.f19730b = i8 + 1;
                xrVar.k(i8);
                xrVar.h();
                list.add(xrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
