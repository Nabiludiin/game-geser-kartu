package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class zl5 extends or0 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f20220i = Float.floatToIntBits(Float.NaN);

    private static void o(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == f20220i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer h8;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f13450b.f10655c;
        if (i8 == 21) {
            h8 = h((i7 / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), h8);
                position += 3;
            }
        } else if (i8 == 22) {
            h8 = h(i7);
            while (position < limit) {
                int i9 = byteBuffer.get(position) & 255;
                int i10 = (byteBuffer.get(position + 1) & 255) << 8;
                o(i9 | i10 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), h8);
                position += 4;
            }
        } else if (i8 == 1342177280) {
            h8 = h((i7 / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h8);
                position += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            h8 = h(i7);
            while (position < limit) {
                int i11 = byteBuffer.get(position + 3) & 255;
                int i12 = (byteBuffer.get(position + 2) & 255) << 8;
                o(i11 | i12 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h8);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        h8.flip();
    }

    @Override // com.google.android.gms.internal.ads.or0
    public final jn0 k(jn0 jn0Var) {
        int i7 = jn0Var.f10655c;
        String str = hi2.f9535a;
        if (i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736) {
            return new jn0(jn0Var.f10653a, jn0Var.f10654b, 4);
        }
        if (i7 == 4) {
            return jn0.f10652e;
        }
        throw new lp0("Unhandled input format:", jn0Var);
    }
}
