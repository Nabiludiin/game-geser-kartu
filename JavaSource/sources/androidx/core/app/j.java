package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
class j implements androidx.core.app.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1622a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f1623b;

    /* renamed from: c, reason: collision with root package name */
    private final i.e f1624c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f1625d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f1626e;

    /* renamed from: f, reason: collision with root package name */
    private final List f1627f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f1628g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f1629h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f1630i;

    /* compiled from: MyApplication */
    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setPriority(i7);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z7) {
            return builder.setUsesChronometer(z7);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setShowWhen(z7);
        }
    }

    /* compiled from: MyApplication */
    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* compiled from: MyApplication */
    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i7, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: MyApplication */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    /* compiled from: MyApplication */
    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: MyApplication */
    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: MyApplication */
    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        static Notification.Builder d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    /* compiled from: MyApplication */
    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i7) {
            return builder.setSemanticAction(i7);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.app.j$j, reason: collision with other inner class name */
    static class C0023j {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: MyApplication */
    static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setForegroundServiceBehavior(i7);
        }
    }

    j(i.e eVar) {
        int i7;
        this.f1624c = eVar;
        Context context = eVar.f1592a;
        this.f1622a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1623b = h.a(context, eVar.K);
        } else {
            this.f1623b = new Notification.Builder(eVar.f1592a);
        }
        Notification notification = eVar.R;
        this.f1623b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1600i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1596e).setContentText(eVar.f1597f).setContentInfo(eVar.f1602k).setContentIntent(eVar.f1598g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1599h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1601j).setNumber(eVar.f1603l).setProgress(eVar.f1611t, eVar.f1612u, eVar.f1613v);
        a.b(a.d(a.c(this.f1623b, eVar.f1608q), eVar.f1606o), eVar.f1604m);
        ArrayList arrayList = eVar.f1593b;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            b((i.a) obj);
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f1628g.putAll(bundle);
        }
        int i9 = Build.VERSION.SDK_INT;
        this.f1625d = eVar.H;
        this.f1626e = eVar.I;
        b.a(this.f1623b, eVar.f1605n);
        d.i(this.f1623b, eVar.f1617z);
        d.g(this.f1623b, eVar.f1614w);
        d.j(this.f1623b, eVar.f1616y);
        d.h(this.f1623b, eVar.f1615x);
        this.f1629h = eVar.O;
        e.b(this.f1623b, eVar.C);
        e.c(this.f1623b, eVar.E);
        e.f(this.f1623b, eVar.F);
        e.d(this.f1623b, eVar.G);
        e.e(this.f1623b, notification.sound, notification.audioAttributes);
        List e8 = i9 < 28 ? e(g(eVar.f1594c), eVar.U) : eVar.U;
        if (e8 != null && !e8.isEmpty()) {
            Iterator it = e8.iterator();
            while (it.hasNext()) {
                e.a(this.f1623b, (String) it.next());
            }
        }
        this.f1630i = eVar.J;
        if (eVar.f1595d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < eVar.f1595d.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), androidx.core.app.k.a((i.a) eVar.f1595d.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1628g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj2 = eVar.T;
        if (obj2 != null) {
            f.b(this.f1623b, obj2);
        }
        if (i11 >= 24) {
            c.a(this.f1623b, eVar.D);
            g.e(this.f1623b, eVar.f1610s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                g.c(this.f1623b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                g.b(this.f1623b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                g.d(this.f1623b, remoteViews3);
            }
        }
        if (i11 >= 26) {
            h.b(this.f1623b, eVar.L);
            h.e(this.f1623b, eVar.f1609r);
            h.f(this.f1623b, eVar.M);
            h.g(this.f1623b, eVar.N);
            h.d(this.f1623b, eVar.O);
            if (eVar.B) {
                h.c(this.f1623b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f1623b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it2 = eVar.f1594c.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        if (i11 >= 29) {
            C0023j.a(this.f1623b, eVar.Q);
            C0023j.b(this.f1623b, i.d.a(null));
        }
        if (i11 >= 31 && (i7 = eVar.P) != 0) {
            k.b(this.f1623b, i7);
        }
        if (eVar.S) {
            if (this.f1624c.f1615x) {
                this.f1629h = 2;
            } else {
                this.f1629h = 1;
            }
            this.f1623b.setVibrate(null);
            this.f1623b.setSound(null);
            int i12 = notification.defaults & (-4);
            notification.defaults = i12;
            this.f1623b.setDefaults(i12);
            if (i11 >= 26) {
                if (TextUtils.isEmpty(this.f1624c.f1614w)) {
                    d.g(this.f1623b, "silent");
                }
                h.d(this.f1623b, this.f1629h);
            }
        }
    }

    private void b(i.a aVar) {
        IconCompat d8 = aVar.d();
        Notification.Action.Builder a8 = f.a(d8 != null ? d8.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : n.b(aVar.e())) {
                d.c(a8, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            g.a(a8, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i7 >= 28) {
            i.b(a8, aVar.f());
        }
        if (i7 >= 29) {
            C0023j.c(a8, aVar.j());
        }
        if (i7 >= 31) {
            k.a(a8, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a8, bundle);
        d.a(this.f1623b, d.d(a8));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        r.b bVar = new r.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.f1623b;
    }

    public Notification c() {
        Bundle a8;
        RemoteViews f8;
        RemoteViews d8;
        i.f fVar = this.f1624c.f1607p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e8 = fVar != null ? fVar.e(this) : null;
        Notification d9 = d();
        if (e8 != null) {
            d9.contentView = e8;
        } else {
            RemoteViews remoteViews = this.f1624c.H;
            if (remoteViews != null) {
                d9.contentView = remoteViews;
            }
        }
        if (fVar != null && (d8 = fVar.d(this)) != null) {
            d9.bigContentView = d8;
        }
        if (fVar != null && (f8 = this.f1624c.f1607p.f(this)) != null) {
            d9.headsUpContentView = f8;
        }
        if (fVar != null && (a8 = androidx.core.app.i.a(d9)) != null) {
            fVar.a(a8);
        }
        return d9;
    }

    protected Notification d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            return a.a(this.f1623b);
        }
        if (i7 >= 24) {
            Notification a8 = a.a(this.f1623b);
            if (this.f1629h != 0) {
                if (d.f(a8) != null && (a8.flags & 512) != 0 && this.f1629h == 2) {
                    h(a8);
                }
                if (d.f(a8) != null && (a8.flags & 512) == 0 && this.f1629h == 1) {
                    h(a8);
                }
            }
            return a8;
        }
        c.a(this.f1623b, this.f1628g);
        Notification a9 = a.a(this.f1623b);
        RemoteViews remoteViews = this.f1625d;
        if (remoteViews != null) {
            a9.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1626e;
        if (remoteViews2 != null) {
            a9.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1630i;
        if (remoteViews3 != null) {
            a9.headsUpContentView = remoteViews3;
        }
        if (this.f1629h != 0) {
            if (d.f(a9) != null && (a9.flags & 512) != 0 && this.f1629h == 2) {
                h(a9);
            }
            if (d.f(a9) != null && (a9.flags & 512) == 0 && this.f1629h == 1) {
                h(a9);
            }
        }
        return a9;
    }

    Context f() {
        return this.f1622a;
    }
}
