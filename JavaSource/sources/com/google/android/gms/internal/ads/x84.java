package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class x84 {
    public static n84 a(String str) {
        try {
            try {
                try {
                    ho4 h02 = ho4.h0(a84.a(str).b().e(), ez4.a());
                    for (go4 go4Var : h02.e0()) {
                        if (go4Var.e0().f0() == wn4.UNKNOWN_KEYMATERIAL || go4Var.e0().f0() == wn4.SYMMETRIC || go4Var.e0().f0() == wn4.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", go4Var.e0().f0().name(), go4Var.e0().d0()));
                        }
                    }
                    return n84.a(h02);
                } catch (e05 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (e05 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
