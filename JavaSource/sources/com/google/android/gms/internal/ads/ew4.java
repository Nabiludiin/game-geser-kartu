package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class ew4 {
    public static String a(qv4 qv4Var) {
        fw4.b(qv4Var);
        return qv4Var.toString().concat("withECDSA");
    }

    public static String b(qv4 qv4Var) {
        int ordinal = qv4Var.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(qv4Var.toString()));
    }
}
