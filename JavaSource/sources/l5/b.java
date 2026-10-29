package l5;

import java.io.OutputStream;

/* compiled from: MyApplication */
final class b extends OutputStream {

    /* renamed from: q, reason: collision with root package name */
    private long f24637q = 0;

    b() {
    }

    long a() {
        return this.f24637q;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.f24637q++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f24637q += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= bArr.length && i8 >= 0 && (i9 = i7 + i8) <= bArr.length && i9 >= 0) {
            this.f24637q += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
