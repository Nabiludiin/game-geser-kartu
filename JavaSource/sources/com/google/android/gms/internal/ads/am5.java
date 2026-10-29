package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class am5 extends or0 {

    /* renamed from: i, reason: collision with root package name */
    private int f5041i;

    /* renamed from: j, reason: collision with root package name */
    private int f5042j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5043k;

    /* renamed from: l, reason: collision with root package name */
    private int f5044l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f5045m = hi2.f9536b;

    /* renamed from: n, reason: collision with root package name */
    private int f5046n;

    /* renamed from: o, reason: collision with root package name */
    private long f5047o;

    @Override // com.google.android.gms.internal.ads.or0, com.google.android.gms.internal.ads.nq0
    public final long K(long j7) {
        return Math.max(0L, j7 - hi2.O(this.f5042j + this.f5041i, this.f13450b.f10653a));
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f5044l);
        this.f5047o += min / this.f13450b.f10656d;
        this.f5044l -= min;
        byteBuffer.position(position + min);
        if (this.f5044l <= 0) {
            int i8 = i7 - min;
            int length = (this.f5046n + i8) - this.f5045m.length;
            ByteBuffer h8 = h(length);
            int i9 = this.f5046n;
            String str = hi2.f9535a;
            int max = Math.max(0, Math.min(length, i9));
            h8.put(this.f5045m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i8));
            byteBuffer.limit(byteBuffer.position() + max2);
            h8.put(byteBuffer);
            byteBuffer.limit(limit);
            int i10 = i8 - max2;
            int i11 = this.f5046n - max;
            this.f5046n = i11;
            byte[] bArr = this.f5045m;
            System.arraycopy(bArr, max, bArr, 0, i11);
            byteBuffer.get(this.f5045m, this.f5046n, i10);
            this.f5046n += i10;
            h8.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.or0, com.google.android.gms.internal.ads.nq0
    public final ByteBuffer e() {
        int i7;
        if (super.f() && (i7 = this.f5046n) > 0) {
            h(i7).put(this.f5045m, 0, this.f5046n).flip();
            this.f5046n = 0;
        }
        return super.e();
    }

    @Override // com.google.android.gms.internal.ads.or0, com.google.android.gms.internal.ads.nq0
    public final boolean f() {
        return super.f() && this.f5046n == 0;
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final jn0 k(jn0 jn0Var) {
        if (!hi2.a(jn0Var.f10655c)) {
            throw new lp0("Unhandled input format:", jn0Var);
        }
        this.f5043k = true;
        return (this.f5041i == 0 && this.f5042j == 0) ? jn0.f10652e : jn0Var;
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final void l() {
        if (this.f5043k) {
            if (this.f5046n > 0) {
                this.f5047o += r0 / this.f13450b.f10656d;
            }
            this.f5046n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final void m() {
        if (this.f5043k) {
            this.f5043k = false;
            int i7 = this.f5042j;
            int i8 = this.f13450b.f10656d;
            this.f5045m = new byte[i7 * i8];
            this.f5044l = this.f5041i * i8;
        }
        this.f5046n = 0;
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final void n() {
        this.f5045m = hi2.f9536b;
    }

    public final void o(int i7, int i8) {
        this.f5041i = i7;
        this.f5042j = i8;
    }

    public final void p() {
        this.f5047o = 0L;
    }

    public final long q() {
        return this.f5047o;
    }
}
