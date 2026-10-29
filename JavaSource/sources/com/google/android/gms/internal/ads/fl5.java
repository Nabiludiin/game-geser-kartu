package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class fl5 implements fk5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sl5 f8321a;

    /* synthetic */ fl5(sl5 sl5Var, byte[] bArr) {
        Objects.requireNonNull(sl5Var);
        this.f8321a = sl5Var;
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final void K(long j7) {
        sl5 sl5Var = this.f8321a;
        if (sl5Var.D() != null) {
            ((vl5) sl5Var.D()).f17669a.x1().d(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final void a(long j7, long j8, long j9, long j10) {
        sl5 sl5Var = this.f8321a;
        long y7 = sl5Var.y();
        long A = sl5Var.A();
        int length = String.valueOf(j7).length();
        int length2 = String.valueOf(j8).length();
        int length3 = String.valueOf(j9).length();
        int length4 = String.valueOf(j10).length();
        StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(y7).length() + 2 + String.valueOf(A).length());
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(y7);
        sb.append(", ");
        sb.append(A);
        gv1.c("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final void b(long j7, long j8, long j9, long j10) {
        sl5 sl5Var = this.f8321a;
        long y7 = sl5Var.y();
        long A = sl5Var.A();
        int length = String.valueOf(j7).length();
        int length2 = String.valueOf(j8).length();
        int length3 = String.valueOf(j9).length();
        int length4 = String.valueOf(j10).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(y7).length() + 2 + String.valueOf(A).length());
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(y7);
        sb.append(", ");
        sb.append(A);
        gv1.c("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final void f(long j7) {
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j7);
        gv1.c("DefaultAudioSink", sb.toString());
    }
}
