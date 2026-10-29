package r2;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.z13;
import java.util.Objects;
import v2.n1;

/* compiled from: MyApplication */
final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f25820a;

    o(s sVar) {
        Objects.requireNonNull(sVar);
        this.f25820a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.f25820a;
        if (sVar.p8() != null) {
            try {
                sVar.p8().u0(z13.d(1, null, null));
            } catch (RemoteException e8) {
                int i7 = n1.f26802b;
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
        s sVar2 = this.f25820a;
        if (sVar2.p8() != null) {
            try {
                sVar2.p8().R(0);
            } catch (RemoteException e9) {
                int i8 = n1.f26802b;
                w2.p.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        s sVar = this.f25820a;
        if (str.startsWith(sVar.m8())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (sVar.p8() != null) {
                try {
                    sVar.p8().u0(z13.d(3, null, null));
                } catch (RemoteException e8) {
                    int i7 = n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e8);
                }
            }
            s sVar2 = this.f25820a;
            if (sVar2.p8() != null) {
                try {
                    sVar2.p8().R(3);
                } catch (RemoteException e9) {
                    int i8 = n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e9);
                }
            }
            this.f25820a.k8(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f25820a;
            if (sVar3.p8() != null) {
                try {
                    sVar3.p8().u0(z13.d(1, null, null));
                } catch (RemoteException e10) {
                    int i9 = n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e10);
                }
            }
            s sVar4 = this.f25820a;
            if (sVar4.p8() != null) {
                try {
                    sVar4.p8().R(0);
                } catch (RemoteException e11) {
                    int i10 = n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e11);
                }
            }
            this.f25820a.k8(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f25820a;
            if (sVar5.p8() != null) {
                try {
                    sVar5.p8().e();
                } catch (RemoteException e12) {
                    int i11 = n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e12);
                }
            }
            s sVar6 = this.f25820a;
            sVar6.k8(sVar6.j8(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar7 = this.f25820a;
        if (sVar7.p8() != null) {
            try {
                sVar7.p8().g();
                sVar7.p8().c();
            } catch (RemoteException e13) {
                int i12 = n1.f26802b;
                w2.p.i("#007 Could not call remote method.", e13);
            }
        }
        this.f25820a.n8(str);
        return true;
    }
}
