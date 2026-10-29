package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final b.b f995a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f996b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f997c;

    /* compiled from: MyApplication */
    class a extends a.AbstractBinderC0058a {

        /* renamed from: q, reason: collision with root package name */
        private Handler f998q = new Handler(Looper.getMainLooper());

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f999r;

        /* compiled from: MyApplication */
        /* renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0011a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Bundle f1001q;

            RunnableC0011a(Bundle bundle) {
                this.f1001q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.j(this.f1001q);
            }
        }

        /* compiled from: MyApplication */
        class b implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f1003q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Bundle f1004r;

            b(int i7, Bundle bundle) {
                this.f1003q = i7;
                this.f1004r = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.g(this.f1003q, this.f1004r);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0012c implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ String f1006q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Bundle f1007r;

            RunnableC0012c(String str, Bundle bundle) {
                this.f1006q = str;
                this.f1007r = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.a(this.f1006q, this.f1007r);
            }
        }

        /* compiled from: MyApplication */
        class d implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Bundle f1009q;

            d(Bundle bundle) {
                this.f1009q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.e(this.f1009q);
            }
        }

        /* compiled from: MyApplication */
        class e implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ String f1011q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Bundle f1012r;

            e(String str, Bundle bundle) {
                this.f1011q = str;
                this.f1012r = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.h(this.f1011q, this.f1012r);
            }
        }

        /* compiled from: MyApplication */
        class f implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f1014q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Uri f1015r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f1016s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bundle f1017t;

            f(int i7, Uri uri, boolean z7, Bundle bundle) {
                this.f1014q = i7;
                this.f1015r = uri;
                this.f1016s = z7;
                this.f1017t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.i(this.f1014q, this.f1015r, this.f1016s, this.f1017t);
            }
        }

        /* compiled from: MyApplication */
        class g implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f1019q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f1020r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Bundle f1021s;

            g(int i7, int i8, Bundle bundle) {
                this.f1019q = i7;
                this.f1020r = i8;
                this.f1021s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.d(this.f1019q, this.f1020r, this.f1021s);
            }
        }

        /* compiled from: MyApplication */
        class h implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Bundle f1023q;

            h(Bundle bundle) {
                this.f1023q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.k(this.f1023q);
            }
        }

        /* compiled from: MyApplication */
        class i implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f1025q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f1026r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f1027s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f1028t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ int f1029u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ Bundle f1030v;

            i(int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
                this.f1025q = i7;
                this.f1026r = i8;
                this.f1027s = i9;
                this.f1028t = i10;
                this.f1029u = i11;
                this.f1030v = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.c(this.f1025q, this.f1026r, this.f1027s, this.f1028t, this.f1029u, this.f1030v);
            }
        }

        /* compiled from: MyApplication */
        class j implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Bundle f1032q;

            j(Bundle bundle) {
                this.f1032q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f999r.f(this.f1032q);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f999r = bVar;
        }

        @Override // b.a
        public void D7(int i7, Uri uri, boolean z7, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new f(i7, uri, z7, bundle));
        }

        @Override // b.a
        public void F5(String str, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new RunnableC0012c(str, bundle));
        }

        @Override // b.a
        public void M4(int i7, int i8, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new g(i7, i8, bundle));
        }

        @Override // b.a
        public void W5(Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new h(bundle));
        }

        @Override // b.a
        public void f4(Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new j(bundle));
        }

        @Override // b.a
        public void k7(String str, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new e(str, bundle));
        }

        @Override // b.a
        public void q2(int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new i(i7, i8, i9, i10, i11, bundle));
        }

        @Override // b.a
        public void q6(int i7, Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new b(i7, bundle));
        }

        @Override // b.a
        public Bundle r3(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f999r;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // b.a
        public void r4(Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new RunnableC0011a(bundle));
        }

        @Override // b.a
        public void v7(Bundle bundle) {
            if (this.f999r == null) {
                return;
            }
            this.f998q.post(new d(bundle));
        }
    }

    c(b.b bVar, ComponentName componentName, Context context) {
        this.f995a = bVar;
        this.f996b = componentName;
        this.f997c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0058a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z7) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z7 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean o42;
        a.AbstractBinderC0058a b8 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                o42 = this.f995a.P5(b8, bundle);
            } else {
                o42 = this.f995a.o4(b8);
            }
            if (o42) {
                return new f(this.f995a, b8, this.f996b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j7) {
        try {
            return this.f995a.W3(j7);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
