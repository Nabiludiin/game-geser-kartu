package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class i9 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f21030g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static volatile d9 f21031h;

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f21032i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f21033j = 0;

    /* renamed from: a, reason: collision with root package name */
    final c9 f21034a;

    /* renamed from: b, reason: collision with root package name */
    final String f21035b;

    /* renamed from: c, reason: collision with root package name */
    private Object f21036c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f21037d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f21038e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f21039f;

    static {
        new AtomicReference();
        y4.h.i(g9.f20978a, "BuildInfo must be non-null");
        f21032i = new AtomicInteger();
    }

    /* synthetic */ i9(c9 c9Var, String str, Object obj, boolean z7, byte[] bArr) {
        if (c9Var.f20853a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f21034a = c9Var;
        this.f21035b = str;
        this.f21036c = obj;
        this.f21039f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.d9 r0 = com.google.android.gms.internal.measurement.i9.f21031h
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.i9.f21030g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.d9 r1 = com.google.android.gms.internal.measurement.i9.f21031h     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.d9 r1 = com.google.android.gms.internal.measurement.i9.f21031h     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.l8.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.k9.b()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.s8.c()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.h9 r1 = new com.google.android.gms.internal.measurement.h9     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            y4.k r1 = y4.l.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.g8 r2 = new com.google.android.gms.internal.measurement.g8     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.i9.f21031h = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.i9.f21032i     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.b(android.content.Context):void");
    }

    public static void c() {
        f21032i.incrementAndGet();
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.i9.f21032i
            int r0 = r0.get()
            int r1 = r9.f21037d
            if (r1 >= r0) goto Lce
            monitor-enter(r9)
            int r1 = r9.f21037d     // Catch: java.lang.Throwable -> L47
            if (r1 >= r0) goto Lca
            com.google.android.gms.internal.measurement.d9 r1 = com.google.android.gms.internal.measurement.i9.f21031h     // Catch: java.lang.Throwable -> L47
            y4.g r2 = y4.g.a()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L4a
            y4.k r4 = r1.b()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            y4.k r2 = r1.b()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = y4.h.h(r2)     // Catch: java.lang.Throwable -> L47
            y4.k r2 = (y4.k) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            y4.g r2 = (y4.g) r2     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.b()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.m8 r4 = (com.google.android.gms.internal.measurement.m8) r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.c9 r5 = r9.f21034a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f20853a     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r5.f20855c     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r9.f21035b     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.a(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            goto Lcc
        L4a:
            r4 = r3
        L4b:
            if (r1 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            y4.h.n(r5, r6)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.c9 r5 = r9.f21034a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f20853a     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L76
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            boolean r7 = com.google.android.gms.internal.measurement.w8.a(r7, r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L74
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.f9 r8 = com.google.android.gms.internal.measurement.f9.f20945q     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.l8 r6 = com.google.android.gms.internal.measurement.l8.a(r7, r6, r8)     // Catch: java.lang.Throwable -> L47
            goto L86
        L74:
            r6 = r3
            goto L86
        L76:
            android.content.Context r6 = r1.a()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = y4.h.h(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.e9 r8 = com.google.android.gms.internal.measurement.e9.f20911q     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.k9 r6 = com.google.android.gms.internal.measurement.k9.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L47
        L86:
            if (r6 == 0) goto L95
            java.lang.String r7 = r9.f21035b     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.y(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L95
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L47
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L99
            goto Lb7
        L99:
            boolean r5 = r5.f20856d     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto Lb1
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.s8 r1 = com.google.android.gms.internal.measurement.s8.a(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r9.f21035b     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.y(r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb1
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L47
        Lb1:
            if (r3 != 0) goto Lb6
            java.lang.Object r6 = r9.f21036c     // Catch: java.lang.Throwable -> L47
            goto Lb7
        Lb6:
            r6 = r3
        Lb7:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lc6
            if (r4 != 0) goto Lc2
            java.lang.Object r6 = r9.f21036c     // Catch: java.lang.Throwable -> L47
            goto Lc6
        Lc2:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L47
        Lc6:
            r9.f21038e = r6     // Catch: java.lang.Throwable -> L47
            r9.f21037d = r0     // Catch: java.lang.Throwable -> L47
        Lca:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            goto Lce
        Lcc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        Lce:
            java.lang.Object r0 = r9.f21038e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.d():java.lang.Object");
    }
}
