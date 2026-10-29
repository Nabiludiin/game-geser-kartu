package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: MyApplication */
public abstract class ay4 implements v05 {
    protected int zzq = 0;

    protected static void j(Iterable iterable, List list) {
        zx4.k(iterable, list);
    }

    private String k(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public qy4 d() {
        try {
            int m7 = m();
            qy4 qy4Var = qy4.f14669r;
            byte[] bArr = new byte[m7];
            int i7 = az4.f5414d;
            xy4 xy4Var = new xy4(bArr, 0, m7);
            n(xy4Var);
            return my4.a(xy4Var, bArr);
        } catch (IOException e8) {
            throw new RuntimeException(k("ByteString"), e8);
        }
    }

    public byte[] e() {
        try {
            int m7 = m();
            byte[] bArr = new byte[m7];
            int i7 = az4.f5414d;
            xy4 xy4Var = new xy4(bArr, 0, m7);
            n(xy4Var);
            xy4Var.f();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(k("byte array"), e8);
        }
    }

    abstract int f();

    abstract void g(int i7);

    abstract int h(n15 n15Var);

    x15 i() {
        return new x15(this);
    }

    @Override // com.google.android.gms.internal.ads.v05
    public void o(OutputStream outputStream) {
        zy4 zy4Var = new zy4(outputStream, az4.D(m()));
        n(zy4Var);
        zy4Var.C();
    }
}
