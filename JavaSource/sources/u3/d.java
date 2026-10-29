package u3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.n;

/* compiled from: MyApplication */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f26550a;

    public d(Context context) {
        this.f26550a = context;
    }

    public int a(String str) {
        return this.f26550a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f26550a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i7) {
        return this.f26550a.getPackageManager().getApplicationInfo(str, i7);
    }

    public CharSequence d(String str) {
        Context context = this.f26550a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public androidx.core.util.d e(String str) {
        ApplicationInfo applicationInfo = this.f26550a.getPackageManager().getApplicationInfo(str, 0);
        return androidx.core.util.d.a(this.f26550a.getPackageManager().getApplicationLabel(applicationInfo), this.f26550a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i7) {
        return this.f26550a.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f26550a);
        }
        if (!n.f() || (nameForUid = this.f26550a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f26550a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public final boolean h(int i7, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f26550a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i7, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
