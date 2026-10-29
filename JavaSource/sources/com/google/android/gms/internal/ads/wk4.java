package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class wk4 implements oj4 {
    private wk4(gj4 gj4Var, Provider provider) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            gj4Var.c().c();
            gj4Var.f();
            new SecretKeySpec(gj4Var.e().c(z74.a()), "AES");
        } catch (NoSuchAlgorithmException e8) {
            throw new GeneralSecurityException("AES-CMAC not available.", e8);
        }
    }

    public static oj4 a(gj4 gj4Var, Provider provider) {
        return new wk4(gj4Var, provider);
    }
}
