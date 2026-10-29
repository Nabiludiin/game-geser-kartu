package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: MyApplication */
public final class yk4 implements oj4 {
    public yk4(gj4 gj4Var) {
    }

    public static oj4 a(gj4 gj4Var) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider a8 = vf4.a();
        if (a8 != null) {
            try {
                return wk4.a(gj4Var, a8);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new yk4(gj4Var);
    }
}
