package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class uv4 implements il4 {
    public static il4 b(gl4 gl4Var) {
        il4 b8 = ml4.b(gl4Var);
        try {
            return new tv4(b8, nl4.b(gl4Var), null);
        } catch (GeneralSecurityException unused) {
            return b8;
        }
    }
}
