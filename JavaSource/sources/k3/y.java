package k3;

import java.util.Arrays;

/* compiled from: MyApplication */
final class y extends x {

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f24523r;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f24523r = bArr;
    }

    @Override // k3.x
    final byte[] C1() {
        return this.f24523r;
    }
}
