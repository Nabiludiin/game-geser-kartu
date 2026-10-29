package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class t13 {

    /* renamed from: d, reason: collision with root package name */
    private static t13 f15941d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15942a;

    /* renamed from: b, reason: collision with root package name */
    private final s2.v1 f15943b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f15944c = new AtomicReference();

    t13(Context context, s2.v1 v1Var) {
        this.f15942a = context;
        this.f15943b = v1Var;
    }

    public static t13 a(Context context) {
        synchronized (t13.class) {
            try {
                t13 t13Var = f15941d;
                if (t13Var != null) {
                    return t13Var;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) x00.f18498b.e()).longValue();
                s2.v1 v1Var = null;
                if (longValue > 0 && longValue <= 253830000) {
                    v1Var = f(applicationContext);
                }
                t13 t13Var2 = new t13(applicationContext, v1Var);
                f15941d = t13Var2;
                return t13Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static s2.v1 f(Context context) {
        try {
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            e = e8;
        }
        try {
            return s2.u1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException e9) {
            e = e9;
            int i7 = v2.n1.f26802b;
            w2.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            int i72 = v2.n1.f26802b;
            w2.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            int i722 = v2.n1.f26802b;
            w2.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            int i7222 = v2.n1.f26802b;
            w2.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            int i72222 = v2.n1.f26802b;
            w2.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final s2.y3 g() {
        s2.v1 v1Var = this.f15943b;
        if (v1Var != null) {
            try {
                return v1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final w2.a b(int i7, boolean z7, int i8) {
        s2.y3 g8;
        r2.t.g();
        boolean i9 = v2.f2.i(this.f15942a);
        w2.a aVar = new w2.a(ModuleDescriptor.MODULE_VERSION, i8, true, i9);
        return (((Boolean) x00.f18499c.e()).booleanValue() && (g8 = g()) != null) ? new w2.a(ModuleDescriptor.MODULE_VERSION, g8.M0(), true, i9) : aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.kb0 r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.x00.f18497a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            s2.v1 r0 = r3.f15943b
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.kb0 r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.f15944c
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            m3.l1.a(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f15944c
            m3.l1.a(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t13.c(com.google.android.gms.internal.ads.kb0):void");
    }

    public final kb0 d() {
        return (kb0) this.f15944c.get();
    }

    public final String e() {
        s2.y3 g8 = g();
        if (g8 != null) {
            return g8.N0();
        }
        return null;
    }
}
