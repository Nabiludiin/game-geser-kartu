package i0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MyApplication */
public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i7, ByteBuffer byteBuffer) {
        g(i7, byteBuffer);
        return this;
    }

    public void g(int i7, ByteBuffer byteBuffer) {
        c(i7, byteBuffer);
    }

    public a j(a aVar, int i7) {
        int b8 = b(6);
        if (b8 != 0) {
            return aVar.f(a(d(b8) + (i7 * 4)), this.f24156b);
        }
        return null;
    }

    public int k() {
        int b8 = b(6);
        if (b8 != 0) {
            return e(b8);
        }
        return 0;
    }

    public int l() {
        int b8 = b(4);
        if (b8 != 0) {
            return this.f24156b.getInt(b8 + this.f24155a);
        }
        return 0;
    }
}
