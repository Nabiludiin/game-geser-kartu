package y3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import c4.s;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l3.a;
import l3.f;
import q4.r;
import q4.u;
import q4.x;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final a.g f27660a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0106a f27661b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC0106a f27662c;

    /* renamed from: d, reason: collision with root package name */
    public static final Scope f27663d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f27664e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f27665f;

    /* renamed from: g, reason: collision with root package name */
    public static final l3.a f27666g;

    /* renamed from: h, reason: collision with root package name */
    public static final Scope f27667h;

    /* renamed from: i, reason: collision with root package name */
    private static final l3.a f27668i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f27669j;

    /* renamed from: k, reason: collision with root package name */
    public static final z3.a f27670k;

    /* renamed from: l, reason: collision with root package name */
    private static final a4.a f27671l;

    /* renamed from: m, reason: collision with root package name */
    public static final b4.a f27672m;

    /* renamed from: n, reason: collision with root package name */
    public static final e4.a f27673n;

    /* renamed from: o, reason: collision with root package name */
    public static final f4.a f27674o;

    /* renamed from: p, reason: collision with root package name */
    public static final h4.a f27675p;

    /* renamed from: q, reason: collision with root package name */
    public static final g4.b f27676q;

    /* renamed from: r, reason: collision with root package name */
    private static final f4.b f27677r;

    /* renamed from: s, reason: collision with root package name */
    public static final j f27678s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f27679t;

    /* renamed from: u, reason: collision with root package name */
    public static final i4.a f27680u;

    /* renamed from: v, reason: collision with root package name */
    public static final j4.a f27681v;

    /* renamed from: w, reason: collision with root package name */
    public static final k4.b f27682w;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    /* renamed from: y3.b$b, reason: collision with other inner class name */
    static abstract class AbstractC0155b extends a.AbstractC0106a {
        private AbstractC0155b() {
        }

        @Override // l3.a.e
        public int b() {
            return 1;
        }

        @Override // l3.a.AbstractC0106a
        public /* synthetic */ a.f c(Context context, Looper looper, p3.d dVar, Object obj, f.b bVar, f.c cVar) {
            a aVar = (a) obj;
            if (aVar == null) {
                aVar = new a.C0154a(null).a();
            }
            return new s(context, looper, dVar, aVar, bVar, cVar);
        }

        /* synthetic */ AbstractC0155b(q qVar) {
            this();
        }
    }

    /* compiled from: MyApplication */
    public static abstract class c extends com.google.android.gms.common.api.internal.a {
        public c(l3.f fVar) {
            super(b.f27660a, fVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a4.a, q4.d] */
    static {
        a.g gVar = new a.g();
        f27660a = gVar;
        q qVar = new q();
        f27661b = qVar;
        p pVar = new p();
        f27662c = pVar;
        f27663d = new Scope("https://www.googleapis.com/auth/games");
        f27664e = new Scope("https://www.googleapis.com/auth/games_lite");
        f27665f = new Scope("https://www.googleapis.com/auth/drive.appdata");
        f27666g = new l3.a("Games.API", qVar, gVar);
        f27667h = new Scope("https://www.googleapis.com/auth/games.firstparty");
        f27668i = new l3.a("Games.API_1P", pVar, gVar);
        f27669j = new q4.f();
        f27670k = new x();
        f27671l = new q4.d();
        f27672m = new q4.e();
        f27673n = new q4.i();
        f27674o = new q4.g();
        f27675p = new q4.s();
        f27676q = new q4.q();
        f27677r = new q4.n();
        f27678s = new q4.o();
        f27679t = new q4.m();
        f27680u = new q4.p();
        f27681v = new r();
        f27682w = new u();
    }

    public static s a(l3.f fVar) {
        return b(fVar, true);
    }

    public static s b(l3.f fVar, boolean z7) {
        p3.o.b(fVar != null, "GoogleApiClient parameter is required.");
        p3.o.q(fVar.l(), "GoogleApiClient must be connected.");
        return c(fVar, z7);
    }

    public static s c(l3.f fVar, boolean z7) {
        l3.a aVar = f27666g;
        p3.o.q(fVar.j(aVar), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean k7 = fVar.k(aVar);
        if (z7 && !k7) {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        if (k7) {
            return (s) fVar.h(f27660a);
        }
        return null;
    }

    /* compiled from: MyApplication */
    public static final class a implements a.d.InterfaceC0107a, a.d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27683b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27684c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27685d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27686e;

        /* renamed from: f, reason: collision with root package name */
        public final int f27687f;

        /* renamed from: g, reason: collision with root package name */
        public final String f27688g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f27689h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f27690i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f27691j;

        /* renamed from: k, reason: collision with root package name */
        public final GoogleSignInAccount f27692k;

        /* renamed from: l, reason: collision with root package name */
        public final String f27693l;

        /* renamed from: m, reason: collision with root package name */
        private final int f27694m;

        private a(boolean z7, boolean z8, int i7, boolean z9, int i8, String str, ArrayList arrayList, boolean z10, boolean z11, GoogleSignInAccount googleSignInAccount, String str2, int i9) {
            this.f27683b = z7;
            this.f27684c = z8;
            this.f27685d = i7;
            this.f27686e = z9;
            this.f27687f = i8;
            this.f27688g = str;
            this.f27689h = arrayList;
            this.f27690i = z10;
            this.f27691j = z11;
            this.f27692k = googleSignInAccount;
            this.f27693l = str2;
            this.f27694m = i9;
        }

        @Override // l3.a.d.InterfaceC0107a
        public final GoogleSignInAccount a() {
            return this.f27692k;
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f27683b);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f27684c);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f27685d);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.f27686e);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.f27687f);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f27688g);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.f27689h);
            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.f27690i);
            bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", this.f27691j);
            bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.f27692k);
            bundle.putString("com.google.android.gms.games.key.realClientPackageName", this.f27693l);
            return bundle;
        }

        public final boolean equals(Object obj) {
            String str;
            GoogleSignInAccount googleSignInAccount;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27683b == aVar.f27683b && this.f27684c == aVar.f27684c && this.f27685d == aVar.f27685d && this.f27686e == aVar.f27686e && this.f27687f == aVar.f27687f && ((str = this.f27688g) != null ? str.equals(aVar.f27688g) : aVar.f27688g == null) && this.f27689h.equals(aVar.f27689h) && this.f27690i == aVar.f27690i && this.f27691j == aVar.f27691j && ((googleSignInAccount = this.f27692k) != null ? googleSignInAccount.equals(aVar.f27692k) : aVar.f27692k == null) && TextUtils.equals(this.f27693l, aVar.f27693l) && this.f27694m == aVar.f27694m;
        }

        public final int hashCode() {
            int i7 = ((((((((((this.f27683b ? 1 : 0) + 527) * 31) + (this.f27684c ? 1 : 0)) * 31) + this.f27685d) * 31) + (this.f27686e ? 1 : 0)) * 31) + this.f27687f) * 31;
            String str = this.f27688g;
            int hashCode = (((((((i7 + (str == null ? 0 : str.hashCode())) * 31) + this.f27689h.hashCode()) * 31) + (this.f27690i ? 1 : 0)) * 31) + (this.f27691j ? 1 : 0)) * 31;
            GoogleSignInAccount googleSignInAccount = this.f27692k;
            int hashCode2 = (hashCode + (googleSignInAccount == null ? 0 : googleSignInAccount.hashCode())) * 31;
            String str2 = this.f27693l;
            return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27694m;
        }

        /* compiled from: MyApplication */
        /* renamed from: y3.b$a$a, reason: collision with other inner class name */
        public static final class C0154a {

            /* renamed from: m, reason: collision with root package name */
            private static final AtomicInteger f27695m = new AtomicInteger(0);

            /* renamed from: a, reason: collision with root package name */
            private boolean f27696a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f27697b;

            /* renamed from: c, reason: collision with root package name */
            private int f27698c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f27699d;

            /* renamed from: e, reason: collision with root package name */
            private int f27700e;

            /* renamed from: f, reason: collision with root package name */
            private String f27701f;

            /* renamed from: g, reason: collision with root package name */
            private ArrayList f27702g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f27703h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f27704i;

            /* renamed from: j, reason: collision with root package name */
            GoogleSignInAccount f27705j;

            /* renamed from: k, reason: collision with root package name */
            private String f27706k;

            /* renamed from: l, reason: collision with root package name */
            private int f27707l;

            private C0154a() {
                this.f27696a = false;
                this.f27697b = true;
                this.f27698c = 17;
                this.f27699d = false;
                this.f27700e = 4368;
                this.f27701f = null;
                this.f27702g = new ArrayList();
                this.f27703h = false;
                this.f27704i = false;
                this.f27705j = null;
                this.f27706k = null;
                this.f27707l = 0;
            }

            public final a a() {
                return new a(this.f27696a, this.f27697b, this.f27698c, this.f27699d, this.f27700e, this.f27701f, this.f27702g, this.f27703h, this.f27704i, this.f27705j, this.f27706k, this.f27707l, null);
            }

            /* synthetic */ C0154a(q qVar) {
                this();
            }
        }

        /* synthetic */ a(boolean z7, boolean z8, int i7, boolean z9, int i8, String str, ArrayList arrayList, boolean z10, boolean z11, GoogleSignInAccount googleSignInAccount, String str2, int i9, q qVar) {
            this(z7, z8, i7, z9, i8, str, arrayList, z10, z11, googleSignInAccount, str2, i9);
        }
    }
}
