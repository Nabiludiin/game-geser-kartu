package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class s1 extends x1 {

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference f21369q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private boolean f21370r;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D2(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L32
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L32
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s1.D2(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle C1(long j7) {
        Bundle bundle;
        AtomicReference atomicReference = this.f21369q;
        synchronized (atomicReference) {
            if (!this.f21370r) {
                try {
                    atomicReference.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f21369q.get();
        }
        return bundle;
    }

    public final String O(long j7) {
        return (String) D2(C1(j7), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.y1
    public final void P0(Bundle bundle) {
        AtomicReference atomicReference = this.f21369q;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f21370r = true;
                } finally {
                    this.f21369q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Long r0(long j7) {
        return (Long) D2(C1(j7), Long.class);
    }
}
