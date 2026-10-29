package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MyApplication */
public final class vj3 implements ak3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f17653a;

    public vj3(byte[] bArr) {
        this.f17653a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* synthetic */ void a(Object obj, OutputStream outputStream) {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        try {
            return v34.a(inputStream);
        } catch (IOException e8) {
            throw new wj3("Cannot read bytes.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* synthetic */ Object d() {
        return this.f17653a;
    }
}
