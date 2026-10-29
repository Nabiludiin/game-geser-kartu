package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class pc3 extends mc3 {

    /* renamed from: a, reason: collision with root package name */
    private String f13818a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13819b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13820c;

    /* renamed from: d, reason: collision with root package name */
    private long f13821d;

    /* renamed from: e, reason: collision with root package name */
    private long f13822e;

    /* renamed from: f, reason: collision with root package name */
    private byte f13823f;

    pc3() {
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f13818a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 b(boolean z7) {
        this.f13819b = z7;
        this.f13823f = (byte) (this.f13823f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 c(boolean z7) {
        this.f13820c = true;
        this.f13823f = (byte) (this.f13823f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 d(boolean z7) {
        this.f13823f = (byte) (this.f13823f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 e(long j7) {
        this.f13821d = 100L;
        this.f13823f = (byte) (this.f13823f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 f(boolean z7) {
        this.f13823f = (byte) (this.f13823f | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final mc3 g(long j7) {
        this.f13822e = 300L;
        this.f13823f = (byte) (this.f13823f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mc3
    public final nc3 h() {
        String str;
        if (this.f13823f == 63 && (str = this.f13818a) != null) {
            return new qc3(str, this.f13819b, this.f13820c, false, this.f13821d, false, this.f13822e, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13818a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f13823f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f13823f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f13823f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f13823f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f13823f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f13823f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
