package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
abstract class n54 extends f64 implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f12592z = 0;

    /* renamed from: x, reason: collision with root package name */
    a5.d f12593x;

    /* renamed from: y, reason: collision with root package name */
    Object f12594y;

    n54(a5.d dVar, Object obj) {
        dVar.getClass();
        this.f12593x = dVar;
        this.f12594y = obj;
    }

    abstract void D(Object obj);

    abstract Object E(Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.b54
    protected final void n() {
        w(this.f12593x);
        this.f12593x = null;
        this.f12594y = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        String str;
        a5.d dVar = this.f12593x;
        Object obj = this.f12594y;
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
        if (obj == null) {
            if (o7 != null) {
                return str.concat(o7);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + obj3.length() + 1);
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.d dVar = this.f12593x;
        Object obj = this.f12594y;
        if ((isCancelled() | (dVar == null)) || (obj == null)) {
            return;
        }
        this.f12593x = null;
        if (dVar.isCancelled()) {
            v(dVar);
            return;
        }
        try {
            try {
                Object E = E(obj, p64.s(dVar));
                this.f12594y = null;
                D(E);
            } catch (Throwable th) {
                try {
                    i74.a(th);
                    m(th);
                } finally {
                    this.f12594y = null;
                }
            }
        } catch (Error e8) {
            m(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e9) {
            m(e9.getCause());
        } catch (Exception e10) {
            m(e10);
        }
    }
}
