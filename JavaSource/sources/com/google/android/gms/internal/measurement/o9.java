package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: MyApplication */
public abstract class o9 implements xb {
    protected int zza = 0;

    protected static void i(Iterable iterable, List list) {
        n9.m(iterable, list);
    }

    public final byte[] c() {
        try {
            int a8 = a();
            byte[] bArr = new byte[a8];
            int i7 = ha.f21005d;
            fa faVar = new fa(bArr, 0, a8);
            d(faVar);
            faVar.e();
            return bArr;
        } catch (IOException e8) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e8);
        }
    }

    abstract int f(ic icVar);
}
