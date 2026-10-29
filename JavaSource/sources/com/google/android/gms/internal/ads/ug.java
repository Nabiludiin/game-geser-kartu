package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: MyApplication */
public final class ug extends v75 {
    private Date A;
    private long B;
    private long C;
    private double D;
    private float E;
    private g85 F;
    private long G;

    /* renamed from: z, reason: collision with root package name */
    private Date f16744z;

    public ug() {
        super("mvhd");
        this.D = 1.0d;
        this.E = 1.0f;
        this.F = g85.f8699j;
    }

    @Override // com.google.android.gms.internal.ads.t75
    public final void c(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.f16744z = a85.a(qg.d(byteBuffer));
            this.A = a85.a(qg.d(byteBuffer));
            this.B = qg.a(byteBuffer);
            this.C = qg.d(byteBuffer);
        } else {
            this.f16744z = a85.a(qg.a(byteBuffer));
            this.A = a85.a(qg.a(byteBuffer));
            this.B = qg.a(byteBuffer);
            this.C = qg.a(byteBuffer);
        }
        this.D = qg.e(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.E = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        qg.b(byteBuffer);
        qg.a(byteBuffer);
        qg.a(byteBuffer);
        this.F = new g85(qg.e(byteBuffer), qg.e(byteBuffer), qg.e(byteBuffer), qg.e(byteBuffer), qg.f(byteBuffer), qg.f(byteBuffer), qg.f(byteBuffer), qg.e(byteBuffer), qg.e(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.G = qg.a(byteBuffer);
    }

    public final long h() {
        return this.B;
    }

    public final long i() {
        return this.C;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f16744z + ";modificationTime=" + this.A + ";timescale=" + this.B + ";duration=" + this.C + ";rate=" + this.D + ";volume=" + this.E + ";matrix=" + this.F + ";nextTrackId=" + this.G + "]";
    }
}
