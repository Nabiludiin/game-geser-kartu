package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: MyApplication */
public abstract /* synthetic */ class o8 {
    public static Object a(n8 n8Var) {
        try {
            return n8Var.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return n8Var.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
