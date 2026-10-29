package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class hk5 extends or0 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f9565i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f9566j;

    @Override // com.google.android.gms.internal.ads.nq0
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f9566j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h8 = h(((limit - position) / this.f13450b.f10656d) * this.f13451c.f10656d);
        while (position < limit) {
            for (int i7 : iArr) {
                int e8 = (hi2.e(this.f13450b.f10655c) * i7) + position;
                int i8 = this.f13450b.f10655c;
                if (i8 != 2) {
                    if (i8 == 3) {
                        h8.put(byteBuffer.get(e8));
                    } else if (i8 != 4) {
                        if (i8 != 21) {
                            if (i8 != 22) {
                                if (i8 != 268435456) {
                                    if (i8 != 1342177280) {
                                        if (i8 != 1610612736) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 21);
                                            sb.append("Unexpected encoding: ");
                                            sb.append(i8);
                                            throw new IllegalStateException(sb.toString());
                                        }
                                    }
                                }
                            }
                            h8.putInt(byteBuffer.getInt(e8));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b8 = byteBuffer.get(order == byteOrder ? e8 : e8 + 2);
                        byte b9 = byteBuffer.get(e8 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            e8 += 2;
                        }
                        int i9 = ((b8 << 24) & (-16777216)) | ((b9 << 16) & 16711680) | ((byteBuffer.get(e8) << 8) & 65280);
                        int i10 = i9 >> 8;
                        rx3.f((i10 & (-16777216)) == 0 || (i10 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i10));
                        rx3.a(h8.remaining() >= 3);
                        h8.put((byte) (h8.order() == byteOrder ? (i9 >> 24) & 255 : i10 & 255)).put((byte) ((i9 >> 16) & 255)).put((byte) (h8.order() == byteOrder ? i10 & 255 : (i9 >> 24) & 255));
                    } else {
                        h8.putFloat(byteBuffer.getFloat(e8));
                    }
                }
                h8.putShort(byteBuffer.getShort(e8));
            }
            position += this.f13450b.f10656d;
        }
        byteBuffer.position(limit);
        h8.flip();
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final jn0 k(jn0 jn0Var) {
        int[] iArr = this.f9565i;
        if (iArr == null) {
            return jn0.f10652e;
        }
        int i7 = jn0Var.f10655c;
        if (!hi2.a(i7)) {
            throw new lp0("Unhandled input format:", jn0Var);
        }
        int i8 = jn0Var.f10654b;
        boolean z7 = i8 != iArr.length;
        int i9 = 0;
        while (true) {
            int length = iArr.length;
            if (i9 >= length) {
                return z7 ? new jn0(jn0Var.f10653a, length, i7) : jn0.f10652e;
            }
            int i10 = iArr[i9];
            if (i10 >= i8) {
                String arrays = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 59);
                sb.append("Channel map (");
                sb.append(arrays);
                sb.append(") trying to access non-existent input channel.");
                throw new lp0(sb.toString(), jn0Var);
            }
            z7 |= i10 != i9;
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final void m() {
        this.f9566j = this.f9565i;
    }

    @Override // com.google.android.gms.internal.ads.or0
    protected final void n() {
        this.f9566j = null;
        this.f9565i = null;
    }

    public final void o(int[] iArr) {
        this.f9565i = iArr;
    }
}
