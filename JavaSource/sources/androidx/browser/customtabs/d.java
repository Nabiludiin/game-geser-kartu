package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f1034a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1035b;

    /* compiled from: MyApplication */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* compiled from: MyApplication */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z7) {
            activityOptions.setShareIdentityEnabled(z7);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1034a = intent;
        this.f1035b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1034a.setData(uri);
        androidx.core.content.a.j(context, this.f1034a, this.f1035b);
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    public static final class C0013d {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f1038c;

        /* renamed from: d, reason: collision with root package name */
        private ActivityOptions f1039d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f1040e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f1041f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f1042g;

        /* renamed from: j, reason: collision with root package name */
        private boolean f1045j;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f1036a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0010a f1037b = new a.C0010a();

        /* renamed from: h, reason: collision with root package name */
        private int f1043h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1044i = true;

        public C0013d() {
        }

        private void c() {
            String a8 = b.a();
            if (TextUtils.isEmpty(a8)) {
                return;
            }
            Bundle bundleExtra = this.f1036a.hasExtra("com.android.browser.headers") ? this.f1036a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a8);
            this.f1036a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1036a.putExtras(bundle);
        }

        private void h() {
            if (this.f1039d == null) {
                this.f1039d = a.a();
            }
            c.a(this.f1039d, this.f1045j);
        }

        public d a() {
            if (!this.f1036a.hasExtra("android.support.customtabs.extra.SESSION")) {
                g(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f1038c;
            if (arrayList != null) {
                this.f1036a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f1040e;
            if (arrayList2 != null) {
                this.f1036a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1036a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1044i);
            this.f1036a.putExtras(this.f1037b.a().a());
            Bundle bundle = this.f1042g;
            if (bundle != null) {
                this.f1036a.putExtras(bundle);
            }
            if (this.f1041f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1041f);
                this.f1036a.putExtras(bundle2);
            }
            this.f1036a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1043h);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                c();
            }
            if (i7 >= 34) {
                h();
            }
            ActivityOptions activityOptions = this.f1039d;
            return new d(this.f1036a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0013d b(int i7) {
            if (i7 < 0 || i7 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f1036a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i7);
            return this;
        }

        public C0013d d(int i7) {
            return e(i7, 0);
        }

        public C0013d e(int i7, int i8) {
            if (i7 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i8 < 0 || i8 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f1036a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i7);
            this.f1036a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i8);
            return this;
        }

        public C0013d f(f fVar) {
            this.f1036a.setPackage(fVar.e().getPackageName());
            g(fVar.d(), fVar.f());
            return this;
        }

        public C0013d(f fVar) {
            if (fVar != null) {
                f(fVar);
            }
        }
    }
}
