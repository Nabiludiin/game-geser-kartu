package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class u44 extends f64 implements Runnable {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    a5.d f16579x;

    /* renamed from: y, reason: collision with root package name */
    Class f16580y;

    /* renamed from: z, reason: collision with root package name */
    Object f16581z;

    u44(a5.d dVar, Class cls, Object obj) {
        dVar.getClass();
        this.f16579x = dVar;
        this.f16580y = cls;
        this.f16581z = obj;
    }

    abstract void D(Object obj);

    abstract Object E(Object obj, Throwable th);

    @Override // com.google.android.gms.internal.ads.b54
    protected final void n() {
        w(this.f16579x);
        this.f16579x = null;
        this.f16580y = null;
        this.f16581z = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        String str;
        a5.d dVar = this.f16579x;
        Class cls = this.f16580y;
        Object obj = this.f16581z;
        String o7 = super.o();
        if (dVar != null) {
            String obj2 = dVar.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (o7 != null) {
                return str.concat(o7);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 13 + obj4.length() + 1);
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj3);
        sb2.append("], fallback=[");
        sb2.append(obj4);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            a5.d r0 = r9.f16579x
            java.lang.Class r1 = r9.f16580y
            java.lang.Object r2 = r9.f16581z
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Lb3
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L21
            goto Lb3
        L21:
            r3 = 0
            r9.f16579x = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.s74     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.android.gms.internal.ads.s74 r4 = (com.google.android.gms.internal.ads.s74) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.p64.s(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L86
        L3c:
            r5 = r3
            goto L86
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L84
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 19
            int r8 = r4.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 16
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L84:
            r4 = r5
            goto L3c
        L86:
            if (r4 != 0) goto L8c
            r9.l(r5)
            return
        L8c:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Lb0
            java.lang.Object r0 = r9.E(r2, r4)     // Catch: java.lang.Throwable -> L9e
            r9.f16580y = r3
            r9.f16581z = r3
            r9.D(r0)
            return
        L9e:
            r0 = move-exception
            com.google.android.gms.internal.ads.i74.a(r0)     // Catch: java.lang.Throwable -> Laa
            r9.m(r0)     // Catch: java.lang.Throwable -> Laa
            r9.f16580y = r3
            r9.f16581z = r3
            return
        Laa:
            r0 = move-exception
            r9.f16580y = r3
            r9.f16581z = r3
            throw r0
        Lb0:
            r9.v(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u44.run():void");
    }
}
