package com.google.android.gms.internal.drive;

import java.io.IOException;

public abstract class c implements i1 {
    private static boolean zznf = false;
    protected int zzne = 0;

    public final byte[] c() {
        try {
            byte[] bArr = new byte[b()];
            w E = w.E(bArr);
            a(E);
            E.U();
            return bArr;
        } catch (IOException e8) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e8);
        }
    }

    abstract int e();

    abstract void f(int i7);
}
