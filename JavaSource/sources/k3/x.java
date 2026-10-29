package k3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p3.o0;
import p3.t1;

/* compiled from: MyApplication */
abstract class x extends t1 {

    /* renamed from: q, reason: collision with root package name */
    private final int f24522q;

    protected x(byte[] bArr) {
        p3.o.a(bArr.length == 25);
        this.f24522q = Arrays.hashCode(bArr);
    }

    protected static byte[] r0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    abstract byte[] C1();

    @Override // p3.o0
    public final int d() {
        return this.f24522q;
    }

    public final boolean equals(Object obj) {
        w3.a h8;
        if (obj != null && (obj instanceof o0)) {
            try {
                o0 o0Var = (o0) obj;
                if (o0Var.d() == this.f24522q && (h8 = o0Var.h()) != null) {
                    return Arrays.equals(C1(), (byte[]) w3.b.r0(h8));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    @Override // p3.o0
    public final w3.a h() {
        return w3.b.C1(C1());
    }

    public final int hashCode() {
        return this.f24522q;
    }
}
