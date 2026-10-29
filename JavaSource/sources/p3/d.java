package p3;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f25150a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f25151b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f25152c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f25153d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25154e;

    /* renamed from: f, reason: collision with root package name */
    private final View f25155f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25156g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25157h;

    /* renamed from: i, reason: collision with root package name */
    private final u4.a f25158i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f25159j;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f25160a;

        /* renamed from: b, reason: collision with root package name */
        private r.b f25161b;

        /* renamed from: c, reason: collision with root package name */
        private String f25162c;

        /* renamed from: d, reason: collision with root package name */
        private String f25163d;

        /* renamed from: e, reason: collision with root package name */
        private final u4.a f25164e = u4.a.f26553k;

        public d a() {
            return new d(this.f25160a, this.f25161b, null, 0, null, this.f25162c, this.f25163d, this.f25164e, false);
        }

        public a b(String str) {
            this.f25162c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f25161b == null) {
                this.f25161b = new r.b();
            }
            this.f25161b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f25160a = account;
            return this;
        }

        public final a e(String str) {
            this.f25163d = str;
            return this;
        }
    }

    public d(Account account, Set set, Map map, int i7, View view, String str, String str2, u4.a aVar, boolean z7) {
        this.f25150a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f25151b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f25153d = map;
        this.f25155f = view;
        this.f25154e = i7;
        this.f25156g = str;
        this.f25157h = str2;
        this.f25158i = aVar == null ? u4.a.f26553k : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f25152c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f25150a;
    }

    public Account b() {
        Account account = this.f25150a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f25152c;
    }

    public int d() {
        return this.f25154e;
    }

    public String e() {
        return this.f25156g;
    }

    public Set f() {
        return this.f25151b;
    }

    public View g() {
        return this.f25155f;
    }

    public final u4.a h() {
        return this.f25158i;
    }

    public final Integer i() {
        return this.f25159j;
    }

    public final String j() {
        return this.f25157h;
    }

    public final Map k() {
        return this.f25153d;
    }

    public final void l(Integer num) {
        this.f25159j = num;
    }
}
