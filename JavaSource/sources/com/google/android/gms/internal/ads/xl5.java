package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: MyApplication */
public final class xl5 {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f18864d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f18865e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f18866a = nq0.f12841a;

    /* renamed from: c, reason: collision with root package name */
    private int f18868c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f18867b = 2;

    private static final void c(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z7 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(q44.a(i8));
    }

    public final void a(wj4 wj4Var, List list) {
        int i7;
        ByteBuffer byteBuffer;
        int i8;
        ByteBuffer byteBuffer2 = wj4Var.f18271d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - wj4Var.f18271d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f18867b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = wj4Var.f18271d;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i9 = limit - position;
        int i10 = (i9 + 255) / 255;
        int i11 = i10 + 27 + i9;
        if (this.f18867b == 2) {
            i7 = bArr != null ? bArr.length + 28 : 47;
            i11 += i7 + 44;
        } else {
            i7 = 0;
        }
        if (this.f18866a.capacity() < i11) {
            this.f18866a = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f18866a.clear();
        }
        ByteBuffer byteBuffer4 = this.f18866a;
        if (this.f18867b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i8 = 22;
                c(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(q44.a(length));
                byteBuffer.put(bArr);
                int i12 = length + 28;
                byteBuffer.putInt(22, hi2.h(byteBuffer.array(), byteBuffer.arrayOffset(), i12, 0));
                byteBuffer.position(i12);
            } else {
                byteBuffer = byteBuffer4;
                i8 = 22;
                byteBuffer.put(f18864d);
            }
            byteBuffer.put(f18865e);
        } else {
            byteBuffer = byteBuffer4;
            i8 = 22;
        }
        int c8 = this.f18868c + l3.c(byteBuffer3);
        this.f18868c = c8;
        int i13 = i8;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, c8, this.f18867b, i10, false);
        for (int i14 = 0; i14 < i10; i14++) {
            if (i9 >= 255) {
                byteBuffer5.put((byte) -1);
                i9 -= 255;
            } else {
                byteBuffer5.put((byte) i9);
                i9 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f18867b == 2) {
            byteBuffer5.putInt(i7 + 66, hi2.h(byteBuffer5.array(), byteBuffer5.arrayOffset() + i7 + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i13, hi2.h(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f18867b++;
        this.f18866a = byteBuffer5;
        wj4Var.a();
        wj4Var.j(this.f18866a.remaining());
        wj4Var.f18271d.put(this.f18866a);
        wj4Var.l();
    }

    public final void b() {
        this.f18866a = nq0.f12841a;
        this.f18868c = 0;
        this.f18867b = 2;
    }
}
