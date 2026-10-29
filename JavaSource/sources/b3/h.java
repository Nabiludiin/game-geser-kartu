package b3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.m64;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.uy;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class h implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rf0 f3244a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f3245b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f3246c;

    h(w wVar, rf0 rf0Var, boolean z7) {
        this.f3244a = rf0Var;
        this.f3245b = z7;
        Objects.requireNonNull(wVar);
        this.f3246c = wVar;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        try {
            rf0 rf0Var = this.f3244a;
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
        List<Uri> list = (List) obj;
        try {
            w wVar = this.f3246c;
            wVar.W8(list);
            this.f3244a.W0(list);
            if (!wVar.n8() && !this.f3245b) {
                return;
            }
            for (Uri uri : list) {
                if (wVar.M8(uri)) {
                    J8 = w.J8(uri, wVar.w8(), "1");
                    wVar.l8().b(J8.toString(), null, null, null);
                } else {
                    if (((Boolean) s2.b0.c().d(uy.Z7)).booleanValue()) {
                        wVar.l8().b(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("", e8);
        }
    }
}
