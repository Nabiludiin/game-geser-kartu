package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MyApplication */
abstract class k {

    /* compiled from: MyApplication */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f2072a;

        a(ByteBuffer byteBuffer) {
            this.f2072a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public int a() {
            return this.f2072a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public void b(int i7) {
            ByteBuffer byteBuffer = this.f2072a;
            byteBuffer.position(byteBuffer.position() + i7);
        }

        @Override // androidx.emoji2.text.k.c
        public long c() {
            return k.c(this.f2072a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.f2072a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() {
            return k.d(this.f2072a.getShort());
        }
    }

    /* compiled from: MyApplication */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f2073a;

        /* renamed from: b, reason: collision with root package name */
        private final long f2074b;

        b(long j7, long j8) {
            this.f2073a = j7;
            this.f2074b = j8;
        }

        long a() {
            return this.f2073a;
        }
    }

    /* compiled from: MyApplication */
    private interface c {
        int a();

        void b(int i7);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j7;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i7 = 0;
        while (true) {
            if (i7 >= readUnsignedShort) {
                j7 = -1;
                break;
            }
            int a8 = cVar.a();
            cVar.b(4);
            j7 = cVar.c();
            cVar.b(4);
            if (1835365473 == a8) {
                break;
            }
            i7++;
        }
        if (j7 != -1) {
            cVar.b((int) (j7 - cVar.getPosition()));
            cVar.b(12);
            long c8 = cVar.c();
            for (int i8 = 0; i8 < c8; i8++) {
                int a9 = cVar.a();
                long c9 = cVar.c();
                long c10 = cVar.c();
                if (1164798569 == a9 || 1701669481 == a9) {
                    return new b(c9 + j7, c10);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static i0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return i0.b.h(duplicate);
    }

    static long c(int i7) {
        return i7 & 4294967295L;
    }

    static int d(short s7) {
        return s7 & 65535;
    }
}
