package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: MyApplication */
final class ls {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f11762a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f11763b = new Base64OutputStream(this.f11762a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.f11763b.close();
        } catch (IOException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            try {
                this.f11762a.close();
                str = this.f11762a.toString();
            } catch (IOException e9) {
                int i8 = v2.n1.f26802b;
                w2.p.d("HashManager: Unable to convert to Base64.", e9);
                str = "";
            }
            return str;
        } finally {
            this.f11762a = null;
            this.f11763b = null;
        }
    }
}
