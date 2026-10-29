package b3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.m64;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.uy;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: MyApplication */
final class g implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rf0 f3238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f3239b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f3240c;

    g(w wVar, rf0 rf0Var, boolean z7) {
        this.f3238a = rf0Var;
        this.f3239b = z7;
        Objects.requireNonNull(wVar);
        this.f3240c = wVar;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        try {
            rf0 rf0Var = this.f3238a;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            rf0Var.u(sb.toString());
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Uri J8;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f3238a.W0(arrayList);
            w wVar = this.f3240c;
            if (!wVar.m8() && !this.f3239b) {
                return;
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                Uri uri = (Uri) obj2;
                if (wVar.L8(uri)) {
                    J8 = w.J8(uri, wVar.w8(), "1");
                    wVar.l8().b(J8.toString(), null, null, null);
                } else {
                    if (((Boolean) s2.b0.c().d(uy.Z7)).booleanValue()) {
                        wVar.l8().b(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.d("", e8);
        }
    }
}
