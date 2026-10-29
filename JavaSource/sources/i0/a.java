package i0;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class a extends c {
    public a f(int i7, ByteBuffer byteBuffer) {
        g(i7, byteBuffer);
        return this;
    }

    public void g(int i7, ByteBuffer byteBuffer) {
        c(i7, byteBuffer);
    }

    public int h(int i7) {
        int b8 = b(16);
        if (b8 != 0) {
            return this.f24156b.getInt(d(b8) + (i7 * 4));
        }
        return 0;
    }

    public int i() {
        int b8 = b(16);
        if (b8 != 0) {
            return e(b8);
        }
        return 0;
    }

    public boolean j() {
        int b8 = b(6);
        return (b8 == 0 || this.f24156b.get(b8 + this.f24155a) == 0) ? false : true;
    }

    public short k() {
        int b8 = b(14);
        if (b8 != 0) {
            return this.f24156b.getShort(b8 + this.f24155a);
        }
        return (short) 0;
    }

    public int l() {
        int b8 = b(4);
        if (b8 != 0) {
            return this.f24156b.getInt(b8 + this.f24155a);
        }
        return 0;
    }

    public short m() {
        int b8 = b(8);
        if (b8 != 0) {
            return this.f24156b.getShort(b8 + this.f24155a);
        }
        return (short) 0;
    }

    public short n() {
        int b8 = b(12);
        if (b8 != 0) {
            return this.f24156b.getShort(b8 + this.f24155a);
        }
        return (short) 0;
    }
}
