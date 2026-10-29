package k3;

import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
abstract class z extends x {

    /* renamed from: s, reason: collision with root package name */
    private static final WeakReference f24524s = new WeakReference(null);

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f24525r;

    z(byte[] bArr) {
        super(bArr);
        this.f24525r = f24524s;
    }

    @Override // k3.x
    final byte[] C1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f24525r.get();
                if (bArr == null) {
                    bArr = D2();
                    this.f24525r = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] D2();
}
