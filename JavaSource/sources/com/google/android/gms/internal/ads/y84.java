package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class y84 {
    public static byte[] a(s84 s84Var) {
        return ((si4) wh4.a().k(s84Var, si4.class)).c().e();
    }

    public static s84 b(byte[] bArr) {
        try {
            bo4 g02 = bo4.g0(bArr, ez4.a());
            wh4 a8 = wh4.a();
            si4 b8 = si4.b(g02);
            return !a8.i(b8) ? new dh4(b8) : a8.j(b8);
        } catch (IOException e8) {
            throw new GeneralSecurityException("Failed to parse proto", e8);
        }
    }
}
