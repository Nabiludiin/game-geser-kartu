package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class hx2 {
    public static void a(AtomicReference atomicReference, gx2 gx2Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            gx2Var.d(obj);
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            int i8 = v2.n1.f26802b;
            w2.p.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
