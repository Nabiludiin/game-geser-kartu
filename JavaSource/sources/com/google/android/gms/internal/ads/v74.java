package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: MyApplication */
public final class v74 implements o84 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f17416a;

    private v74(InputStream inputStream) {
        this.f17416a = inputStream;
    }

    public static o84 a(byte[] bArr) {
        return new v74(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.o84
    public final ho4 b() {
        try {
            return ho4.i0(this.f17416a, ez4.a());
        } finally {
            this.f17416a.close();
        }
    }
}
