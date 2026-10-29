package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: MyApplication */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f13671a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f13672b;

    public p5() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13671a = byteArrayOutputStream;
        this.f13672b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(o5 o5Var) {
        ByteArrayOutputStream byteArrayOutputStream = this.f13671a;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.f13672b;
            b(dataOutputStream, o5Var.f13191a);
            b(dataOutputStream, o5Var.f13192b);
            dataOutputStream.writeLong(o5Var.f13193c);
            dataOutputStream.writeLong(o5Var.f13194d);
            dataOutputStream.write(o5Var.f13195e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
