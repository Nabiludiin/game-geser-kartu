package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3.o;
import r5.d;
import r5.f;
import w4.i;
import w4.j;
import w4.l;

/* compiled from: MyApplication */
public class b implements p5.c {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f23014m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f23015n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c5.e f23016a;

    /* renamed from: b, reason: collision with root package name */
    private final r5.c f23017b;

    /* renamed from: c, reason: collision with root package name */
    private final q5.c f23018c;

    /* renamed from: d, reason: collision with root package name */
    private final f f23019d;

    /* renamed from: e, reason: collision with root package name */
    private final q5.b f23020e;

    /* renamed from: f, reason: collision with root package name */
    private final p5.e f23021f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f23022g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f23023h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f23024i;

    /* renamed from: j, reason: collision with root package name */
    private String f23025j;

    /* renamed from: k, reason: collision with root package name */
    private Set f23026k;

    /* renamed from: l, reason: collision with root package name */
    private final List f23027l;

    /* compiled from: MyApplication */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f23028a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f23028a.getAndIncrement())));
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: com.google.firebase.installations.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0080b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23029a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23030b;

        static {
            int[] iArr = new int[f.b.values().length];
            f23030b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23030b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23030b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f23029a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23029a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    b(c5.e eVar, o5.b bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23015n), eVar, new r5.c(eVar.j(), bVar), new q5.c(eVar), f.c(), new q5.b(eVar), new p5.e());
    }

    private i c() {
        j jVar = new j();
        d(new d(jVar));
        return jVar.a();
    }

    private void d(e eVar) {
        synchronized (this.f23022g) {
            this.f23027l.add(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r3) {
        /*
            r2 = this;
            q5.d r0 = r2.n()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.c -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.c -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.f r3 = r2.f23019d     // Catch: com.google.firebase.installations.c -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.c -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            q5.d r3 = r2.g(r0)     // Catch: com.google.firebase.installations.c -> L1d
            goto L28
        L24:
            q5.d r3 = r2.t(r0)     // Catch: com.google.firebase.installations.c -> L1d
        L28:
            r2.q(r3)
            r2.x(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.w(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.c r3 = new com.google.firebase.installations.c
            com.google.firebase.installations.c$a r0 = com.google.firebase.installations.c.a.BAD_CONFIG
            r3.<init>(r0)
            r2.u(r3)
            return
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.u(r3)
            return
        L5d:
            r2.v(r3)
            return
        L61:
            r2.u(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.e(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final boolean z7) {
        q5.d o7 = o();
        if (z7) {
            o7 = o7.p();
        }
        v(o7);
        this.f23024i.execute(new Runnable() { // from class: p5.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.b.this.e(z7);
            }
        });
    }

    private q5.d g(q5.d dVar) {
        r5.f e8 = this.f23017b.e(h(), dVar.d(), p(), dVar.f());
        int i7 = C0080b.f23030b[e8.b().ordinal()];
        if (i7 == 1) {
            return dVar.o(e8.c(), e8.d(), this.f23019d.b());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        w(null);
        return dVar.r();
    }

    private synchronized String j() {
        return this.f23025j;
    }

    public static b l() {
        return m(c5.e.k());
    }

    public static b m(c5.e eVar) {
        o.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (b) eVar.i(p5.c.class);
    }

    /* JADX WARN: Finally extract failed */
    private q5.d n() {
        q5.d d8;
        synchronized (f23014m) {
            try {
                com.google.firebase.installations.a a8 = com.google.firebase.installations.a.a(this.f23016a.j(), "generatefid.lock");
                try {
                    d8 = this.f23018c.d();
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private q5.d o() {
        q5.d d8;
        synchronized (f23014m) {
            try {
                com.google.firebase.installations.a a8 = com.google.firebase.installations.a.a(this.f23016a.j(), "generatefid.lock");
                try {
                    d8 = this.f23018c.d();
                    if (d8.j()) {
                        d8 = this.f23018c.b(d8.t(s(d8)));
                    }
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private void q(q5.d dVar) {
        synchronized (f23014m) {
            try {
                com.google.firebase.installations.a a8 = com.google.firebase.installations.a.a(this.f23016a.j(), "generatefid.lock");
                try {
                    this.f23018c.b(dVar);
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r() {
        o.h(i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.h(p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.h(h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(f.h(i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(f.g(h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String s(q5.d dVar) {
        if ((!this.f23016a.l().equals("CHIME_ANDROID_SDK") && !this.f23016a.t()) || !dVar.m()) {
            return this.f23021f.a();
        }
        String f8 = this.f23020e.f();
        return TextUtils.isEmpty(f8) ? this.f23021f.a() : f8;
    }

    private q5.d t(q5.d dVar) {
        r5.d d8 = this.f23017b.d(h(), dVar.d(), p(), i(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f23020e.i());
        int i7 = C0080b.f23029a[d8.e().ordinal()];
        if (i7 == 1) {
            return dVar.s(d8.c(), d8.d(), this.f23019d.b(), d8.b().c(), d8.b().d());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
    }

    private void u(Exception exc) {
        synchronized (this.f23022g) {
            try {
                Iterator it = this.f23027l.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void v(q5.d dVar) {
        synchronized (this.f23022g) {
            try {
                Iterator it = this.f23027l.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void w(String str) {
        this.f23025j = str;
    }

    private synchronized void x(q5.d dVar, q5.d dVar2) {
        if (this.f23026k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator it = this.f23026k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    String h() {
        return this.f23016a.m().b();
    }

    String i() {
        return this.f23016a.m().c();
    }

    public i k() {
        r();
        String j7 = j();
        if (j7 != null) {
            return l.e(j7);
        }
        i c8 = c();
        this.f23023h.execute(new Runnable() { // from class: p5.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.b.this.f(false);
            }
        });
        return c8;
    }

    String p() {
        return this.f23016a.m().e();
    }

    b(ExecutorService executorService, c5.e eVar, r5.c cVar, q5.c cVar2, f fVar, q5.b bVar, p5.e eVar2) {
        this.f23022g = new Object();
        this.f23026k = new HashSet();
        this.f23027l = new ArrayList();
        this.f23016a = eVar;
        this.f23017b = cVar;
        this.f23018c = cVar2;
        this.f23019d = fVar;
        this.f23020e = bVar;
        this.f23021f = eVar2;
        this.f23023h = executorService;
        this.f23024i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23015n);
    }
}
