package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class e84 {
    static final bo4 a(s84 s84Var) {
        try {
            return ((si4) wh4.a().k(null, si4.class)).c();
        } catch (GeneralSecurityException e8) {
            throw new dj4("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e8);
        }
    }

    public static final s84 b(s84 s84Var) {
        return s84Var != null ? s84Var : y84.b(a(null).e());
    }
}
