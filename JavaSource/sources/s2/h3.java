package s2;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class h3 {

    /* renamed from: g, reason: collision with root package name */
    private String f26115g;

    /* renamed from: i, reason: collision with root package name */
    private String f26117i;

    /* renamed from: j, reason: collision with root package name */
    private String f26118j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26120l;

    /* renamed from: m, reason: collision with root package name */
    private String f26121m;

    /* renamed from: o, reason: collision with root package name */
    private long f26123o;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f26109a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f26110b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f26111c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f26112d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f26113e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f26114f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f26116h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f26119k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f26122n = 60000;

    final /* synthetic */ String A() {
        return this.f26117i;
    }

    final /* synthetic */ String a() {
        return this.f26118j;
    }

    final /* synthetic */ int b() {
        return this.f26119k;
    }

    final /* synthetic */ boolean c() {
        return this.f26120l;
    }

    final /* synthetic */ String d() {
        return this.f26121m;
    }

    final /* synthetic */ int e() {
        return this.f26122n;
    }

    final /* synthetic */ long f() {
        return this.f26123o;
    }

    public final void g(String str) {
        this.f26109a.add(str);
    }

    public final void h(Class cls, Bundle bundle) {
        this.f26110b.putBundle(cls.getName(), bundle);
    }

    public final void i(String str) {
        this.f26112d.add(str);
    }

    public final void j(String str) {
        this.f26112d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void k(String str) {
        this.f26115g = str;
    }

    public final void l(List list) {
        List list2 = this.f26116h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                w2.p.f("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void m(String str) {
        this.f26117i = str;
    }

    public final void n(String str) {
        this.f26118j = str;
    }

    public final void o(boolean z7) {
        this.f26119k = z7 ? 1 : 0;
    }

    public final void p(String str, String str2) {
        this.f26113e.putString(str, str2);
    }

    public final void q(String str) {
        this.f26114f.add(str);
    }

    public final void r(boolean z7) {
        this.f26120l = z7;
    }

    final /* synthetic */ HashSet s() {
        return this.f26109a;
    }

    final /* synthetic */ Bundle t() {
        return this.f26110b;
    }

    final /* synthetic */ HashMap u() {
        return this.f26111c;
    }

    final /* synthetic */ HashSet v() {
        return this.f26112d;
    }

    final /* synthetic */ Bundle w() {
        return this.f26113e;
    }

    final /* synthetic */ HashSet x() {
        return this.f26114f;
    }

    final /* synthetic */ String y() {
        return this.f26115g;
    }

    final /* synthetic */ List z() {
        return this.f26116h;
    }
}
