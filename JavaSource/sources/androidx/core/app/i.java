package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class i {

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f1574a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f1575b;

        /* renamed from: c, reason: collision with root package name */
        private final n[] f1576c;

        /* renamed from: d, reason: collision with root package name */
        private final n[] f1577d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1578e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1579f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1580g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1581h;

        /* renamed from: i, reason: collision with root package name */
        public int f1582i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f1583j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f1584k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1585l;

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.c(null, "", i7) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f1584k;
        }

        public boolean b() {
            return this.f1578e;
        }

        public Bundle c() {
            return this.f1574a;
        }

        public IconCompat d() {
            int i7;
            if (this.f1575b == null && (i7 = this.f1582i) != 0) {
                this.f1575b = IconCompat.c(null, "", i7);
            }
            return this.f1575b;
        }

        public n[] e() {
            return this.f1576c;
        }

        public int f() {
            return this.f1580g;
        }

        public boolean g() {
            return this.f1579f;
        }

        public CharSequence h() {
            return this.f1583j;
        }

        public boolean i() {
            return this.f1585l;
        }

        public boolean j() {
            return this.f1581h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z7, int i7, boolean z8, boolean z9, boolean z10) {
            this.f1579f = true;
            this.f1575b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f1582i = iconCompat.e();
            }
            this.f1583j = e.d(charSequence);
            this.f1584k = pendingIntent;
            this.f1574a = bundle == null ? new Bundle() : bundle;
            this.f1576c = nVarArr;
            this.f1577d = nVarArr2;
            this.f1578e = z7;
            this.f1580g = i7;
            this.f1579f = z8;
            this.f1581h = z9;
            this.f1585l = z10;
        }
    }

    /* compiled from: MyApplication */
    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f1586e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f1587f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1588g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f1589h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1590i;

        /* compiled from: MyApplication */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: androidx.core.app.i$b$b, reason: collision with other inner class name */
        private static class C0022b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: MyApplication */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z7) {
                bigPictureStyle.showBigPictureWhenCollapsed(z7);
            }
        }

        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            int i7 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c8 = a.c(a.b(hVar.a()), this.f1619b);
            IconCompat iconCompat = this.f1586e;
            if (iconCompat != null) {
                if (i7 >= 31) {
                    c.a(c8, this.f1586e.m(hVar instanceof j ? ((j) hVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    c8 = a.a(c8, this.f1586e.d());
                }
            }
            if (this.f1588g) {
                if (this.f1587f == null) {
                    a.d(c8, null);
                } else {
                    C0022b.a(c8, this.f1587f.m(hVar instanceof j ? ((j) hVar).f() : null));
                }
            }
            if (this.f1621d) {
                a.e(c8, this.f1620c);
            }
            if (i7 >= 31) {
                c.c(c8, this.f1590i);
                c.b(c8, this.f1589h);
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f1587f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f1588g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f1586e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    /* compiled from: MyApplication */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f1591e;

        /* compiled from: MyApplication */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.i.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            Notification.BigTextStyle a8 = a.a(a.c(a.b(hVar.a()), this.f1619b), this.f1591e);
            if (this.f1621d) {
                a.d(a8, this.f1620c);
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f1591e = e.d(charSequence);
            return this;
        }
    }

    /* compiled from: MyApplication */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: MyApplication */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected e f1618a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f1619b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f1620c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1621d = false;

        public void a(Bundle bundle) {
            if (this.f1621d) {
                bundle.putCharSequence("android.summaryText", this.f1620c);
            }
            CharSequence charSequence = this.f1619b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c8 = c();
            if (c8 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c8);
            }
        }

        public abstract void b(h hVar);

        protected abstract String c();

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public RemoteViews f(h hVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f1618a != eVar) {
                this.f1618a = eVar;
                if (eVar != null) {
                    eVar.q(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    /* compiled from: MyApplication */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        public ArrayList U;

        /* renamed from: a, reason: collision with root package name */
        public Context f1592a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f1593b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f1594c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f1595d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f1596e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f1597f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f1598g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f1599h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f1600i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f1601j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f1602k;

        /* renamed from: l, reason: collision with root package name */
        int f1603l;

        /* renamed from: m, reason: collision with root package name */
        int f1604m;

        /* renamed from: n, reason: collision with root package name */
        boolean f1605n;

        /* renamed from: o, reason: collision with root package name */
        boolean f1606o;

        /* renamed from: p, reason: collision with root package name */
        f f1607p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f1608q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f1609r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f1610s;

        /* renamed from: t, reason: collision with root package name */
        int f1611t;

        /* renamed from: u, reason: collision with root package name */
        int f1612u;

        /* renamed from: v, reason: collision with root package name */
        boolean f1613v;

        /* renamed from: w, reason: collision with root package name */
        String f1614w;

        /* renamed from: x, reason: collision with root package name */
        boolean f1615x;

        /* renamed from: y, reason: collision with root package name */
        String f1616y;

        /* renamed from: z, reason: collision with root package name */
        boolean f1617z;

        public e(Context context, String str) {
            this.f1593b = new ArrayList();
            this.f1594c = new ArrayList();
            this.f1595d = new ArrayList();
            this.f1605n = true;
            this.f1617z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f1592a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1604m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1592a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(y.b.f27470b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(y.b.f27469a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        private void l(int i7, boolean z7) {
            if (z7) {
                Notification notification = this.R;
                notification.flags = i7 | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i7) & notification2.flags;
            }
        }

        public e a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1593b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new j(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z7) {
            l(16, z7);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.f1598g = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f1597f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f1596e = d(charSequence);
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e m(Bitmap bitmap) {
            this.f1601j = e(bitmap);
            return this;
        }

        public e n(boolean z7) {
            this.f1617z = z7;
            return this;
        }

        public e o(int i7) {
            this.f1604m = i7;
            return this;
        }

        public e p(int i7) {
            this.R.icon = i7;
            return this;
        }

        public e q(f fVar) {
            if (this.f1607p != fVar) {
                this.f1607p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e r(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e s(long j7) {
            this.R.when = j7;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
