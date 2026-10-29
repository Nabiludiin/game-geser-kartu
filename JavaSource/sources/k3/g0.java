package k3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p3.t1;

/* compiled from: MyApplication */
public final class g0 extends q3.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: q, reason: collision with root package name */
    private final String f24494q;

    /* renamed from: r, reason: collision with root package name */
    private final x f24495r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f24496s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f24497t;

    g0(String str, x xVar, boolean z7, boolean z8) {
        this.f24494q = str;
        this.f24495r = xVar;
        this.f24496s = z7;
        this.f24497t = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f24494q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        x xVar = this.f24495r;
        if (xVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            xVar = null;
        }
        q3.c.k(parcel, 2, xVar, false);
        q3.c.c(parcel, 3, this.f24496s);
        q3.c.c(parcel, 4, this.f24497t);
        q3.c.b(parcel, a8);
    }

    g0(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f24494q = str;
        y yVar = null;
        if (iBinder != null) {
            try {
                w3.a h8 = t1.O(iBinder).h();
                byte[] bArr = h8 == null ? null : (byte[]) w3.b.r0(h8);
                if (bArr != null) {
                    yVar = new y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f24495r = yVar;
        this.f24496s = z7;
        this.f24497t = z8;
    }
}
