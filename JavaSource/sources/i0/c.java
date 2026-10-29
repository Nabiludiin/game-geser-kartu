package i0;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f24155a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f24156b;

    /* renamed from: c, reason: collision with root package name */
    private int f24157c;

    /* renamed from: d, reason: collision with root package name */
    private int f24158d;

    /* renamed from: e, reason: collision with root package name */
    d f24159e = d.a();

    protected int a(int i7) {
        return i7 + this.f24156b.getInt(i7);
    }

    protected int b(int i7) {
        if (i7 < this.f24158d) {
            return this.f24156b.getShort(this.f24157c + i7);
        }
        return 0;
    }

    protected void c(int i7, ByteBuffer byteBuffer) {
        this.f24156b = byteBuffer;
        if (byteBuffer == null) {
            this.f24155a = 0;
            this.f24157c = 0;
            this.f24158d = 0;
        } else {
            this.f24155a = i7;
            int i8 = i7 - byteBuffer.getInt(i7);
            this.f24157c = i8;
            this.f24158d = this.f24156b.getShort(i8);
        }
    }

    protected int d(int i7) {
        int i8 = i7 + this.f24155a;
        return i8 + this.f24156b.getInt(i8) + 4;
    }

    protected int e(int i7) {
        int i8 = i7 + this.f24155a;
        return this.f24156b.getInt(i8 + this.f24156b.getInt(i8));
    }
}
