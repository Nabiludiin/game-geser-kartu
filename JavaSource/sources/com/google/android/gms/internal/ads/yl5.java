package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class yl5 extends or0 {

    /* renamed from: i, reason: collision with root package name */
    private int f19641i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19642j;

    /* renamed from: k, reason: collision with root package name */
    private int f19643k;

    /* renamed from: l, reason: collision with root package name */
    private long f19644l;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f19646n;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f19649q;

    /* renamed from: m, reason: collision with root package name */
    private int f19645m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f19647o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f19648p = 0;

    public yl5() {
        byte[] bArr = hi2.f9536b;
        this.f19646n = bArr;
        this.f19649q = bArr;
    }

    private final void q(boolean z7) {
        int i7;
        int i8;
        int i9 = this.f19648p;
        int length = this.f19646n.length;
        if (i9 != length) {
            if (!z7) {
                return;
            } else {
                z7 = true;
            }
        }
        if (this.f19645m == 0) {
            if (z7) {
                s(i9, 3);
                i8 = i9;
            } else {
                rx3.h(i9 >= (length >> 1));
                i8 = this.f19646n.length >> 1;
                s(i8, 0);
            }
            i7 = i8;
        } else {
            int i10 = length >> 1;
            int i11 = i9 - i10;
            if (z7) {
                int r7 = r(i11) + (this.f19646n.length >> 1);
                s(r7, 2);
                int i12 = i10 + i11;
                i7 = r7;
                i8 = i12;
            } else {
                int r8 = r(i11);
                s(r8, 1);
                i7 = r8;
                i8 = i11;
            }
        }
        if (i8 % this.f19641i != 0) {
            throw new IllegalStateException(iy3.d("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i8)));
        }
        rx3.h(i9 >= i7);
        this.f19648p -= i8;
        int i13 = this.f19647o + i8;
        this.f19647o = i13;
        this.f19647o = i13 % this.f19646n.length;
        this.f19645m = this.f19645m + (i7 / this.f19641i);
        this.f19644l += (i8 - i7) / r2;
    }

    private final int r(int i7) {
        int u7 = ((u(2000000L) - this.f19645m) * this.f19641i) - (this.f19646n.length >> 1);
        rx3.h(u7 >= 0);
        int min = (int) Math.min((i7 * 0.2f) + 0.5f, u7);
        int i8 = this.f19641i;
        return (min / i8) * i8;
    }

    private final void s(int i7, int i8) {
        int i9;
        if (i7 == 0) {
            return;
        }
        rx3.a(this.f19648p >= i7);
        if (i8 == 2) {
            int i10 = this.f19647o;
            int i11 = this.f19648p;
            int i12 = i10 + i11;
            byte[] bArr = this.f19646n;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i7, this.f19649q, 0, i7);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i7) {
                    System.arraycopy(bArr, i13 - i7, this.f19649q, 0, i7);
                } else {
                    int i14 = i7 - i13;
                    System.arraycopy(bArr, length - i14, this.f19649q, 0, i14);
                    System.arraycopy(this.f19646n, 0, this.f19649q, i14, i13);
                }
            }
        } else {
            int i15 = this.f19647o;
            int i16 = i15 + i7;
            byte[] bArr2 = this.f19646n;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.f19649q, 0, i7);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.f19649q, 0, i17);
                System.arraycopy(this.f19646n, 0, this.f19649q, i17, i7 - i17);
            }
        }
        rx3.d(i7 % this.f19641i == 0, "sizeToOutput is not aligned to frame size: %s", i7);
        rx3.h(this.f19647o < this.f19646n.length);
        byte[] bArr3 = this.f19649q;
        rx3.d(i7 % this.f19641i == 0, "byteOutput size is not aligned to frame size %s", i7);
        if (i8 != 3) {
            for (int i18 = 0; i18 < i7; i18 += 2) {
                int i19 = i18 + 1;
                int t7 = t(bArr3[i19], bArr3[i18]);
                if (i8 == 0) {
                    i9 = ((((i18 * 1000) / (i7 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i9 = 10;
                    if (i8 == 2) {
                        i9 = 10 + (((90000 * i18) / (i7 - 1)) / 1000);
                    }
                }
                int i20 = (t7 * i9) / 100;
                if (i20 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i20 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = Byte.MIN_VALUE;
                } else {
                    bArr3[i18] = (byte) (i20 & 255);
                    bArr3[i19] = (byte) (i20 >> 8);
                }
            }
        }
        h(i7).put(bArr3, 0, i7).flip();
    }

    private static int t(byte b8, byte b9) {
        return (b8 << 8) | (b9 & 255);
    }

    private final int u(long j7) {
        return (int) ((j7 * this.f13450b.f10653a) / 1000000);
    }

    private static final boolean v(byte b8, byte b9) {
        return Math.abs(t(b8, b9)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int i7;
        int position;
        while (byteBuffer.hasRemaining() && !j()) {
            if (this.f19643k != 0) {
                rx3.h(this.f19647o < this.f19646n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (v(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i8 = this.f19641i;
                            limit = i8 * (position2 / i8);
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i9 = this.f19647o;
                int i10 = this.f19648p;
                int i11 = i9 + i10;
                int length = this.f19646n.length;
                if (i11 < length) {
                    i7 = length - i11;
                } else {
                    i11 = i10 - (length - i9);
                    i7 = i9 - i11;
                }
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f19646n, i11, min);
                int i12 = this.f19648p + min;
                this.f19648p = i12;
                rx3.h(i12 <= this.f19646n.length);
                boolean z7 = limit < limit2 && position3 < i7;
                q(z7);
                if (z7) {
                    this.f19643k = 0;
                    this.f19645m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f19646n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (v(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i13 = this.f19641i;
                            position = ((limit4 / i13) * i13) + i13;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f19643k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    h(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.or0, com.google.android.gms.internal.ads.nq0
    public final boolean d() {
        return super.d() && this.f19642j;
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final jn0 k(jn0 jn0Var) {
        if (jn0Var.f10655c == 2) {
            return jn0Var.f10653a == -1 ? jn0.f10652e : jn0Var;
        }
        throw new lp0("Unhandled input format:", jn0Var);
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final void l() {
        if (this.f19648p > 0) {
            q(true);
            this.f19645m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final void m() {
        if (d()) {
            int i7 = this.f13450b.f10654b;
            this.f19641i = i7 + i7;
            int u7 = u(100000L) / 2;
            int i8 = this.f19641i;
            int i9 = (u7 / i8) * i8;
            int i10 = i9 + i9;
            if (this.f19646n.length != i10) {
                this.f19646n = new byte[i10];
                this.f19649q = new byte[i10];
            }
        }
        this.f19643k = 0;
        this.f19644l = 0L;
        this.f19645m = 0;
        this.f19647o = 0;
        this.f19648p = 0;
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final void n() {
        this.f19642j = false;
        byte[] bArr = hi2.f9536b;
        this.f19646n = bArr;
        this.f19649q = bArr;
    }

    public final void o(boolean z7) {
        this.f19642j = z7;
    }

    public final long p() {
        return this.f19644l;
    }
}
