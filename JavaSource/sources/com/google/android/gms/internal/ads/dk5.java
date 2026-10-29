package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: MyApplication */
final class dk5 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f7147a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f7148b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f7149c;

    /* renamed from: d, reason: collision with root package name */
    private long f7150d;

    /* renamed from: e, reason: collision with root package name */
    private long f7151e;

    /* renamed from: f, reason: collision with root package name */
    private long f7152f;

    public dk5(AudioTrack audioTrack) {
        this.f7147a = audioTrack;
    }

    public final boolean a() {
        AudioTrack audioTrack = this.f7147a;
        AudioTimestamp audioTimestamp = this.f7148b;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j7 = audioTimestamp.framePosition;
            if (this.f7150d > j7) {
                this.f7149c++;
            }
            this.f7150d = j7;
            this.f7151e = j7 + this.f7152f + (this.f7149c << 32);
        }
        return timestamp;
    }

    public final long b() {
        return this.f7148b.nanoTime / 1000;
    }

    public final long c() {
        return this.f7151e;
    }
}
