package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import l3.a;
import m3.o1;
import m3.r0;

/* compiled from: MyApplication */
final class b implements r0 {
    private final Lock C;

    /* renamed from: q, reason: collision with root package name */
    private final Context f4441q;

    /* renamed from: r, reason: collision with root package name */
    private final u f4442r;

    /* renamed from: s, reason: collision with root package name */
    private final Looper f4443s;

    /* renamed from: t, reason: collision with root package name */
    private final x f4444t;

    /* renamed from: u, reason: collision with root package name */
    private final x f4445u;

    /* renamed from: v, reason: collision with root package name */
    private final Map f4446v;

    /* renamed from: x, reason: collision with root package name */
    private final a.f f4448x;

    /* renamed from: y, reason: collision with root package name */
    private Bundle f4449y;

    /* renamed from: w, reason: collision with root package name */
    private final Set f4447w = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: z, reason: collision with root package name */
    private k3.b f4450z = null;
    private k3.b A = null;
    private boolean B = false;
    private int D = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private b(Context context, u uVar, Lock lock, Looper looper, k3.h hVar, Map map, Map map2, p3.d dVar, a.AbstractC0106a abstractC0106a, a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f4441q = context;
        this.f4442r = uVar;
        this.C = lock;
        this.f4443s = looper;
        this.f4448x = fVar;
        this.f4444t = new x(context, uVar, lock, looper, hVar, map2, null, map4, null, arrayList2, new c0(this, null));
        this.f4445u = new x(context, uVar, lock, looper, hVar, map, dVar, map3, abstractC0106a, arrayList, new d0(this, 0 == true ? 1 : 0));
        r.a aVar = new r.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((a.c) it.next(), this.f4444t);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((a.c) it2.next(), this.f4445u);
        }
        this.f4446v = Collections.unmodifiableMap(aVar);
    }

    private final void f(k3.b bVar) {
        int i7 = this.D;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.D = 0;
            }
            this.f4442r.a(bVar);
        }
        g();
        this.D = 0;
    }

    private final void g() {
        Iterator it = this.f4447w.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f4447w.clear();
    }

    private final boolean h() {
        k3.b bVar = this.A;
        return bVar != null && bVar.M0() == 4;
    }

    private final boolean i(a aVar) {
        x xVar = (x) this.f4446v.get(aVar.t());
        p3.o.n(xVar, "GoogleApiClient is not configured to use the API required for this call.");
        return xVar.equals(this.f4445u);
    }

    private static boolean j(k3.b bVar) {
        return bVar != null && bVar.Q0();
    }

    public static b l(Context context, u uVar, Lock lock, Looper looper, k3.h hVar, Map map, p3.d dVar, Map map2, a.AbstractC0106a abstractC0106a, ArrayList arrayList) {
        r.a aVar = new r.a();
        r.a aVar2 = new r.a();
        a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar2 = (a.f) entry.getValue();
            if (true == fVar2.b()) {
                fVar = fVar2;
            }
            if (fVar2.t()) {
                aVar.put((a.c) entry.getKey(), fVar2);
            } else {
                aVar2.put((a.c) entry.getKey(), fVar2);
            }
        }
        p3.o.q(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        r.a aVar3 = new r.a();
        r.a aVar4 = new r.a();
        for (l3.a aVar5 : map2.keySet()) {
            a.c b8 = aVar5.b();
            if (aVar.containsKey(b8)) {
                aVar3.put(aVar5, (Boolean) map2.get(aVar5));
            } else {
                if (!aVar2.containsKey(b8)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(aVar5, (Boolean) map2.get(aVar5));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            o1 o1Var = (o1) arrayList.get(i7);
            if (aVar3.containsKey(o1Var.f24837q)) {
                arrayList2.add(o1Var);
            } else {
                if (!aVar4.containsKey(o1Var.f24837q)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(o1Var);
            }
        }
        return new b(context, uVar, lock, looper, hVar, aVar, aVar2, dVar, abstractC0106a, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    static /* bridge */ /* synthetic */ void s(b bVar, int i7, boolean z7) {
        bVar.f4442r.c(i7, z7);
        bVar.A = null;
        bVar.f4450z = null;
    }

    static /* bridge */ /* synthetic */ void t(b bVar, Bundle bundle) {
        Bundle bundle2 = bVar.f4449y;
        if (bundle2 == null) {
            bVar.f4449y = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void u(b bVar) {
        k3.b bVar2;
        if (!j(bVar.f4450z)) {
            if (bVar.f4450z != null && j(bVar.A)) {
                bVar.f4445u.d();
                bVar.f((k3.b) p3.o.m(bVar.f4450z));
                return;
            }
            k3.b bVar3 = bVar.f4450z;
            if (bVar3 == null || (bVar2 = bVar.A) == null) {
                return;
            }
            if (bVar.f4445u.C < bVar.f4444t.C) {
                bVar3 = bVar2;
            }
            bVar.f(bVar3);
            return;
        }
        if (!j(bVar.A) && !bVar.h()) {
            k3.b bVar4 = bVar.A;
            if (bVar4 != null) {
                if (bVar.D == 1) {
                    bVar.g();
                    return;
                } else {
                    bVar.f(bVar4);
                    bVar.f4444t.d();
                    return;
                }
            }
            return;
        }
        int i7 = bVar.D;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                bVar.D = 0;
            }
            ((u) p3.o.m(bVar.f4442r)).b(bVar.f4449y);
        }
        bVar.g();
        bVar.D = 0;
    }

    private final PendingIntent w() {
        a.f fVar = this.f4448x;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f4441q, System.identityHashCode(this.f4442r), fVar.s(), n4.g.f25023a | 134217728);
    }

    @Override // m3.r0
    public final void a() {
        this.D = 2;
        this.B = false;
        this.A = null;
        this.f4450z = null;
        this.f4444t.a();
        this.f4445u.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.D == 1) goto L11;
     */
    @Override // m3.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.C
            r0.lock()
            com.google.android.gms.common.api.internal.x r0 = r3.f4444t     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.x r0 = r3.f4445u     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.h()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.D     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.C
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.C
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b.b():boolean");
    }

    @Override // m3.r0
    public final a c(a aVar) {
        if (!i(aVar)) {
            return this.f4444t.c(aVar);
        }
        if (!h()) {
            return this.f4445u.c(aVar);
        }
        aVar.a(new Status(4, (String) null, w()));
        return aVar;
    }

    @Override // m3.r0
    public final void d() {
        this.A = null;
        this.f4450z = null;
        this.D = 0;
        this.f4444t.d();
        this.f4445u.d();
        g();
    }

    @Override // m3.r0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f4445u.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f4444t.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
