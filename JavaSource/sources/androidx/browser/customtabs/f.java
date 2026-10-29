package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1048a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b.b f1049b;

    /* renamed from: c, reason: collision with root package name */
    private final b.a f1050c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f1051d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f1052e;

    f(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1049b = bVar;
        this.f1050c = aVar;
        this.f1051d = componentName;
        this.f1052e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1052e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1052e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f1050c.asBinder();
    }

    ComponentName e() {
        return this.f1051d;
    }

    PendingIntent f() {
        return this.f1052e;
    }

    public int g(String str, Bundle bundle) {
        int d22;
        Bundle b8 = b(bundle);
        synchronized (this.f1048a) {
            try {
                try {
                    d22 = this.f1049b.d2(this.f1050c, str, b8);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d22;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle c8 = c(uri2);
            if (c8 == null) {
                return this.f1049b.H4(this.f1050c, uri);
            }
            bundle.putAll(c8);
            return this.f1049b.L1(this.f1050c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
