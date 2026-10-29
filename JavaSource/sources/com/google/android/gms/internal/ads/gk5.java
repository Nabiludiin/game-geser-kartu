package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class gk5 {
    private long A;
    private boolean B;
    private long C;
    private pd1 D;

    /* renamed from: a, reason: collision with root package name */
    private final fk5 f8975a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8976b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f8977c;

    /* renamed from: d, reason: collision with root package name */
    private ek5 f8978d;

    /* renamed from: e, reason: collision with root package name */
    private int f8979e;

    /* renamed from: f, reason: collision with root package name */
    private long f8980f;

    /* renamed from: g, reason: collision with root package name */
    private float f8981g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8982h;

    /* renamed from: i, reason: collision with root package name */
    private long f8983i;

    /* renamed from: j, reason: collision with root package name */
    private long f8984j;

    /* renamed from: k, reason: collision with root package name */
    private long f8985k;

    /* renamed from: l, reason: collision with root package name */
    private Method f8986l;

    /* renamed from: m, reason: collision with root package name */
    private long f8987m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8988n;

    /* renamed from: o, reason: collision with root package name */
    private long f8989o;

    /* renamed from: p, reason: collision with root package name */
    private long f8990p;

    /* renamed from: q, reason: collision with root package name */
    private long f8991q;

    /* renamed from: r, reason: collision with root package name */
    private long f8992r;

    /* renamed from: s, reason: collision with root package name */
    private int f8993s;

    /* renamed from: t, reason: collision with root package name */
    private int f8994t;

    /* renamed from: u, reason: collision with root package name */
    private long f8995u;

    /* renamed from: v, reason: collision with root package name */
    private long f8996v;

    /* renamed from: w, reason: collision with root package name */
    private long f8997w;

    /* renamed from: x, reason: collision with root package name */
    private long f8998x;

    /* renamed from: y, reason: collision with root package name */
    boolean f8999y;

    /* renamed from: z, reason: collision with root package name */
    private long f9000z;

    public gk5(fk5 fk5Var) {
        this.f8975a = fk5Var;
        try {
            this.f8986l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f8976b = new long[10];
        this.A = -9223372036854775807L;
        this.f9000z = -9223372036854775807L;
        this.D = pd1.f13828a;
    }

    private final void j(long j7) {
        if (this.f8999y) {
            long j8 = this.f8983i;
            if (j8 == -9223372036854775807L || j7 < j8) {
                return;
            }
            long a8 = this.D.a() - hi2.M(hi2.T(j7 - j8, this.f8981g));
            this.f8983i = -9223372036854775807L;
            this.f8975a.K(a8);
        }
    }

    private final long k(long j7) {
        long max = Math.max(0L, (this.f8994t == 0 ? this.f8995u != -9223372036854775807L ? hi2.O(o(), this.f8979e) : m() : hi2.S(j7 + this.f8984j, this.f8981g)) - this.f8987m);
        return this.f8995u != -9223372036854775807L ? Math.min(hi2.O(this.f8998x, this.f8979e), max) : max;
    }

    private final void l() {
        this.f8984j = 0L;
        this.f8994t = 0;
        this.f8993s = 0;
        this.f8985k = 0L;
        this.f9000z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.f8982h = false;
    }

    private final long m() {
        return hi2.O(n(), this.f8979e);
    }

    private final long n() {
        if (this.f8995u != -9223372036854775807L) {
            return Math.min(this.f8998x, o());
        }
        long b8 = this.D.b();
        if (b8 - this.f8990p >= 5) {
            AudioTrack audioTrack = this.f8977c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f8991q <= 0 || playState != 3) {
                        this.f8996v = -9223372036854775807L;
                    } else if (this.f8996v == -9223372036854775807L) {
                        this.f8996v = b8;
                    }
                }
                if (this.f8991q > playbackHeadPosition) {
                    this.f8992r++;
                }
                this.f8991q = playbackHeadPosition;
            }
            this.f8990p = b8;
        }
        return this.f8991q + this.C + (this.f8992r << 32);
    }

    private final long o() {
        AudioTrack audioTrack = this.f8977c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f8997w;
        }
        return this.f8997w + hi2.P(hi2.S(hi2.N(this.D.b()) - this.f8995u, this.f8981g), this.f8979e);
    }

    public final void a(AudioTrack audioTrack, int i7, int i8, int i9, boolean z7) {
        this.f8977c = audioTrack;
        this.f8978d = new ek5(audioTrack, this.f8975a);
        this.f8979e = audioTrack.getSampleRate();
        boolean a8 = hi2.a(i7);
        this.f8988n = a8;
        this.f8980f = a8 ? hi2.O(i9 / i8, this.f8979e) : -9223372036854775807L;
        this.f8991q = 0L;
        this.f8992r = 0L;
        this.B = false;
        this.C = 0L;
        this.f8995u = -9223372036854775807L;
        this.f8996v = -9223372036854775807L;
        this.f8989o = 0L;
        this.f8987m = 0L;
        this.f8981g = 1.0f;
        this.f8983i = -9223372036854775807L;
        this.f8999y = z7;
    }

    public final long b() {
        long j7;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.f8977c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long d8 = this.D.d() / 1000;
            if (d8 - this.f8985k >= 30000) {
                long m7 = m();
                if (m7 != 0) {
                    long[] jArr = this.f8976b;
                    jArr[this.f8993s] = hi2.T(m7, this.f8981g) - d8;
                    this.f8993s = (this.f8993s + 1) % 10;
                    int i7 = this.f8994t;
                    if (i7 < 10) {
                        this.f8994t = i7 + 1;
                    }
                    this.f8985k = d8;
                    this.f8984j = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.f8994t;
                        if (i8 >= i9) {
                            break;
                        }
                        this.f8984j += jArr[i8] / i9;
                        i8++;
                    }
                }
            }
            if (this.f8988n && (method = this.f8986l) != null && d8 - this.f8989o >= 500000) {
                try {
                    audioTrack = this.f8977c;
                } catch (Exception unused) {
                    this.f8986l = null;
                }
                if (audioTrack == null) {
                    throw null;
                }
                Integer num = (Integer) method.invoke(audioTrack, null);
                String str = hi2.f9535a;
                long intValue = (num.intValue() * 1000) - this.f8980f;
                this.f8987m = intValue;
                long max = Math.max(intValue, 0L);
                this.f8987m = max;
                if (max > 5000000) {
                    this.f8975a.f(max);
                    this.f8987m = 0L;
                }
                this.f8989o = d8;
            }
            ek5 ek5Var = this.f8978d;
            ek5Var.getClass();
            ek5Var.a(d8, this.f8981g, k(d8));
        }
        long d9 = this.D.d() / 1000;
        ek5 ek5Var2 = this.f8978d;
        ek5Var2.getClass();
        boolean b8 = ek5Var2.b();
        long e8 = b8 ? ek5Var2.e(d9, this.f8981g) : k(d9);
        int playState = audioTrack2.getPlayState();
        if (playState == 3) {
            if (b8 || !ek5Var2.c()) {
                j(e8);
            }
            long j8 = this.A;
            if (j8 != -9223372036854775807L) {
                long j9 = e8 - this.f9000z;
                long S = hi2.S(d9 - j8, this.f8981g);
                j7 = -9223372036854775807L;
                long j10 = this.f9000z + S;
                long abs = Math.abs(j10 - e8);
                if (j9 != 0 && abs < 1000000) {
                    long j11 = (S * 10) / 100;
                    e8 = Math.max(j10 - j11, Math.min(e8, j10 + j11));
                }
            } else {
                j7 = -9223372036854775807L;
            }
            if (!this.f8999y && !this.f8982h) {
                long j12 = this.f9000z;
                if (j12 != j7 && e8 > j12) {
                    this.f8982h = true;
                    String str2 = hi2.f9535a;
                    this.f8975a.K(this.D.a() - hi2.M(hi2.T(hi2.M(e8 - j12), this.f8981g)));
                }
            }
            this.A = d9;
            this.f9000z = e8;
        } else if (playState == 1) {
            j(e8);
            return e8;
        }
        return e8;
    }

    public final void c() {
        if (this.f8995u != -9223372036854775807L) {
            this.f8995u = hi2.N(this.D.b());
        }
        this.f8983i = m();
        ek5 ek5Var = this.f8978d;
        ek5Var.getClass();
        ek5Var.d();
    }

    public final boolean d() {
        AudioTrack audioTrack = this.f8977c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean e(long j7) {
        return this.f8996v != -9223372036854775807L && j7 > 0 && this.D.b() - this.f8996v >= 200;
    }

    public final void f(long j7) {
        this.f8997w = n();
        this.f8995u = hi2.N(this.D.b());
        this.f8998x = j7;
    }

    public final void g() {
        l();
        if (this.f8995u == -9223372036854775807L) {
            ek5 ek5Var = this.f8978d;
            ek5Var.getClass();
            ek5Var.d();
        }
        this.f8997w = n();
    }

    public final void h() {
        l();
        this.f8977c = null;
        this.f8978d = null;
    }

    public final void i(pd1 pd1Var) {
        this.D = pd1Var;
    }
}
