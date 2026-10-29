package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: MyApplication */
final class x34 extends s34 {

    /* renamed from: a, reason: collision with root package name */
    private final File f18528a;

    /* renamed from: b, reason: collision with root package name */
    private final g14 f18529b;

    /* synthetic */ x34(File file, w34[] w34VarArr, byte[] bArr) {
        file.getClass();
        this.f18528a = file;
        this.f18529b = g14.t(w34VarArr);
    }

    @Override // com.google.android.gms.internal.ads.s34
    public final /* bridge */ /* synthetic */ OutputStream a() {
        return new FileOutputStream(this.f18528a, this.f18529b.contains(w34.APPEND));
    }

    public final String toString() {
        String obj = this.f18528a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f18529b);
        StringBuilder sb = new StringBuilder(length + 19 + valueOf.length() + 1);
        sb.append("Files.asByteSink(");
        sb.append(obj);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
