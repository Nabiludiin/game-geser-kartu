package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class pi5 {

    /* renamed from: d, reason: collision with root package name */
    public static final pi5 f13891d;

    /* renamed from: a, reason: collision with root package name */
    public final int f13892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13893b;

    /* renamed from: c, reason: collision with root package name */
    private final g14 f13894c;

    static {
        pi5 pi5Var;
        if (Build.VERSION.SDK_INT >= 33) {
            f14 f14Var = new f14();
            for (int i7 = 1; i7 <= 10; i7++) {
                f14Var.g(Integer.valueOf(hi2.b(i7)));
            }
            pi5Var = new pi5(2, f14Var.j());
        } else {
            pi5Var = new pi5(2, 10);
        }
        f13891d = pi5Var;
    }

    public pi5(int i7, int i8) {
        this.f13892a = i7;
        this.f13893b = i8;
        this.f13894c = null;
    }

    public final boolean a(int i7) {
        g14 g14Var = this.f13894c;
        if (g14Var == null) {
            return i7 <= this.f13893b;
        }
        int b8 = hi2.b(i7);
        if (b8 == 0) {
            return false;
        }
        return g14Var.contains(Integer.valueOf(b8));
    }

    public final int b(int i7, mb1 mb1Var) {
        boolean isDirectPlaybackSupported;
        if (this.f13894c != null) {
            return this.f13893b;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) yi5.f19610e.getOrDefault(Integer.valueOf(this.f13892a), 0);
            num.getClass();
            return num.intValue();
        }
        int i8 = this.f13892a;
        for (int i9 = 10; i9 > 0; i9--) {
            int b8 = hi2.b(i9);
            if (b8 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i7).setChannelMask(b8).build(), mb1Var.a());
                if (isDirectPlaybackSupported) {
                    return i9;
                }
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi5)) {
            return false;
        }
        pi5 pi5Var = (pi5) obj;
        return this.f13892a == pi5Var.f13892a && this.f13893b == pi5Var.f13893b && Objects.equals(this.f13894c, pi5Var.f13894c);
    }

    public final int hashCode() {
        g14 g14Var = this.f13894c;
        return (((this.f13892a * 31) + this.f13893b) * 31) + (g14Var == null ? 0 : g14Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13894c);
        int i7 = this.f13892a;
        int length = String.valueOf(i7).length();
        int i8 = this.f13893b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i8).length() + 15 + valueOf.length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i7);
        sb.append(", maxChannelCount=");
        sb.append(i8);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public pi5(int i7, Set set) {
        this.f13892a = i7;
        g14 s7 = g14.s(set);
        this.f13894c = s7;
        j34 c8 = s7.c();
        int i8 = 0;
        while (c8.hasNext()) {
            i8 = Math.max(i8, Integer.bitCount(((Integer) c8.next()).intValue()));
        }
        this.f13893b = i8;
    }
}
