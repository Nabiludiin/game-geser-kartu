package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class jq3 {

    /* renamed from: a, reason: collision with root package name */
    private final File f10713a;

    /* renamed from: b, reason: collision with root package name */
    private final gc3 f10714b;

    /* renamed from: c, reason: collision with root package name */
    private final nu3 f10715c;

    public jq3(File file, gc3 gc3Var, nu3 nu3Var) {
        this.f10713a = file;
        this.f10714b = gc3Var;
        this.f10715c = nu3Var;
    }

    public final boolean a(byte[] bArr) {
        boolean z7;
        try {
            File file = this.f10713a;
            y34.b(file);
            y34.a(bArr, file);
            z7 = this.f10714b.a(file);
        } catch (IOException | GeneralSecurityException e8) {
            this.f10715c.d(2027, e8);
            z7 = false;
        }
        try {
            this.f10713a.delete();
        } catch (SecurityException unused) {
        }
        return z7;
    }
}
