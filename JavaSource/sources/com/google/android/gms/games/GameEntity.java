package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p3.n;
import q3.c;

/* compiled from: MyApplication */
public final class GameEntity extends GamesDowngradeableSafeParcel implements y3.a {
    public static final Parcelable.Creator<GameEntity> CREATOR = new a();
    private final Uri A;
    private final boolean B;
    private final boolean C;
    private final String D;
    private final int E;
    private final int F;
    private final int G;
    private final boolean H;
    private final boolean I;
    private final String J;
    private final String K;
    private final String L;
    private final boolean M;
    private final boolean N;
    private final boolean O;
    private final String P;
    private final boolean Q;

    /* renamed from: s, reason: collision with root package name */
    private final String f4598s;

    /* renamed from: t, reason: collision with root package name */
    private final String f4599t;

    /* renamed from: u, reason: collision with root package name */
    private final String f4600u;

    /* renamed from: v, reason: collision with root package name */
    private final String f4601v;

    /* renamed from: w, reason: collision with root package name */
    private final String f4602w;

    /* renamed from: x, reason: collision with root package name */
    private final String f4603x;

    /* renamed from: y, reason: collision with root package name */
    private final Uri f4604y;

    /* renamed from: z, reason: collision with root package name */
    private final Uri f4605z;

    /* compiled from: MyApplication */
    static final class a extends b {
        a() {
        }

        @Override // com.google.android.gms.games.b
        public final GameEntity a(Parcel parcel) {
            boolean z7;
            if (GamesDowngradeableSafeParcel.P0(DowngradeableSafeParcel.N0()) || DowngradeableSafeParcel.M0(GameEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            Uri parse3 = readString9 != null ? Uri.parse(readString9) : null;
            boolean z8 = true;
            if (parcel.readInt() > 0) {
                z7 = true;
            } else {
                z7 = true;
                z8 = false;
            }
            return new GameEntity(readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, parse3, z8, parcel.readInt() > 0 ? z7 : false, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z7, boolean z8, String str7, int i7, int i8, int i9, boolean z9, boolean z10, String str8, String str9, String str10, boolean z11, boolean z12, boolean z13, String str11, boolean z14) {
        this.f4598s = str;
        this.f4599t = str2;
        this.f4600u = str3;
        this.f4601v = str4;
        this.f4602w = str5;
        this.f4603x = str6;
        this.f4604y = uri;
        this.J = str8;
        this.f4605z = uri2;
        this.K = str9;
        this.A = uri3;
        this.L = str10;
        this.B = z7;
        this.C = z8;
        this.D = str7;
        this.E = i7;
        this.F = i8;
        this.G = i9;
        this.H = z9;
        this.I = z10;
        this.M = z11;
        this.N = z12;
        this.O = z13;
        this.P = str11;
        this.Q = z14;
    }

    static int Q0(y3.a aVar) {
        return n.b(aVar.H(), aVar.k(), aVar.L(), aVar.o0(), aVar.getDescription(), aVar.S(), aVar.u(), aVar.r(), aVar.K0(), Boolean.valueOf(aVar.b()), Boolean.valueOf(aVar.h()), aVar.c(), Integer.valueOf(aVar.n0()), Integer.valueOf(aVar.T()), Boolean.valueOf(aVar.C0()), Boolean.valueOf(aVar.v0()), Boolean.valueOf(aVar.e()), Boolean.valueOf(aVar.d()), Boolean.valueOf(aVar.j0()), aVar.f0(), Boolean.valueOf(aVar.F0()));
    }

    static boolean T0(y3.a aVar, Object obj) {
        if (!(obj instanceof y3.a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        y3.a aVar2 = (y3.a) obj;
        return n.a(aVar2.H(), aVar.H()) && n.a(aVar2.k(), aVar.k()) && n.a(aVar2.L(), aVar.L()) && n.a(aVar2.o0(), aVar.o0()) && n.a(aVar2.getDescription(), aVar.getDescription()) && n.a(aVar2.S(), aVar.S()) && n.a(aVar2.u(), aVar.u()) && n.a(aVar2.r(), aVar.r()) && n.a(aVar2.K0(), aVar.K0()) && n.a(Boolean.valueOf(aVar2.b()), Boolean.valueOf(aVar.b())) && n.a(Boolean.valueOf(aVar2.h()), Boolean.valueOf(aVar.h())) && n.a(aVar2.c(), aVar.c()) && n.a(Integer.valueOf(aVar2.n0()), Integer.valueOf(aVar.n0())) && n.a(Integer.valueOf(aVar2.T()), Integer.valueOf(aVar.T())) && n.a(Boolean.valueOf(aVar2.C0()), Boolean.valueOf(aVar.C0())) && n.a(Boolean.valueOf(aVar2.v0()), Boolean.valueOf(aVar.v0())) && n.a(Boolean.valueOf(aVar2.e()), Boolean.valueOf(aVar.e())) && n.a(Boolean.valueOf(aVar2.d()), Boolean.valueOf(aVar.d())) && n.a(Boolean.valueOf(aVar2.j0()), Boolean.valueOf(aVar.j0())) && n.a(aVar2.f0(), aVar.f0()) && n.a(Boolean.valueOf(aVar2.F0()), Boolean.valueOf(aVar.F0()));
    }

    static String U0(y3.a aVar) {
        return n.c(aVar).a("ApplicationId", aVar.H()).a("DisplayName", aVar.k()).a("PrimaryCategory", aVar.L()).a("SecondaryCategory", aVar.o0()).a("Description", aVar.getDescription()).a("DeveloperName", aVar.S()).a("IconImageUri", aVar.u()).a("IconImageUrl", aVar.getIconImageUrl()).a("HiResImageUri", aVar.r()).a("HiResImageUrl", aVar.getHiResImageUrl()).a("FeaturedImageUri", aVar.K0()).a("FeaturedImageUrl", aVar.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(aVar.b())).a("InstanceInstalled", Boolean.valueOf(aVar.h())).a("InstancePackageName", aVar.c()).a("AchievementTotalCount", Integer.valueOf(aVar.n0())).a("LeaderboardCount", Integer.valueOf(aVar.T())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(aVar.C0())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(aVar.v0())).a("AreSnapshotsEnabled", Boolean.valueOf(aVar.j0())).a("ThemeColor", aVar.f0()).a("HasGamepadSupport", Boolean.valueOf(aVar.F0())).toString();
    }

    @Override // y3.a
    public final boolean C0() {
        return this.H;
    }

    @Override // y3.a
    public final boolean F0() {
        return this.Q;
    }

    @Override // y3.a
    public final String H() {
        return this.f4598s;
    }

    @Override // y3.a
    public final Uri K0() {
        return this.A;
    }

    @Override // y3.a
    public final String L() {
        return this.f4600u;
    }

    @Override // y3.a
    public final String S() {
        return this.f4603x;
    }

    @Override // y3.a
    public final int T() {
        return this.G;
    }

    @Override // y3.a
    public final boolean b() {
        return this.B;
    }

    @Override // y3.a
    public final String c() {
        return this.D;
    }

    @Override // y3.a
    public final boolean d() {
        return this.N;
    }

    @Override // y3.a
    public final boolean e() {
        return this.M;
    }

    public final boolean equals(Object obj) {
        return T0(this, obj);
    }

    @Override // y3.a
    public final String f0() {
        return this.P;
    }

    @Override // y3.a
    public final String getDescription() {
        return this.f4602w;
    }

    @Override // y3.a
    public final String getFeaturedImageUrl() {
        return this.L;
    }

    @Override // y3.a
    public final String getHiResImageUrl() {
        return this.K;
    }

    @Override // y3.a
    public final String getIconImageUrl() {
        return this.J;
    }

    @Override // y3.a
    public final boolean h() {
        return this.C;
    }

    public final int hashCode() {
        return Q0(this);
    }

    @Override // y3.a
    public final boolean j0() {
        return this.O;
    }

    @Override // y3.a
    public final String k() {
        return this.f4599t;
    }

    @Override // y3.a
    public final int n0() {
        return this.F;
    }

    @Override // y3.a
    public final String o0() {
        return this.f4601v;
    }

    @Override // y3.a
    public final Uri r() {
        return this.f4605z;
    }

    public final String toString() {
        return U0(this);
    }

    @Override // y3.a
    public final Uri u() {
        return this.f4604y;
    }

    @Override // y3.a
    public final boolean v0() {
        return this.I;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        if (O0()) {
            parcel.writeString(this.f4598s);
            parcel.writeString(this.f4599t);
            parcel.writeString(this.f4600u);
            parcel.writeString(this.f4601v);
            parcel.writeString(this.f4602w);
            parcel.writeString(this.f4603x);
            Uri uri = this.f4604y;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f4605z;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.A;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeString(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeInt(this.G);
            return;
        }
        int a8 = c.a(parcel);
        c.r(parcel, 1, H(), false);
        c.r(parcel, 2, k(), false);
        c.r(parcel, 3, L(), false);
        c.r(parcel, 4, o0(), false);
        c.r(parcel, 5, getDescription(), false);
        c.r(parcel, 6, S(), false);
        c.q(parcel, 7, u(), i7, false);
        c.q(parcel, 8, r(), i7, false);
        c.q(parcel, 9, K0(), i7, false);
        c.c(parcel, 10, this.B);
        c.c(parcel, 11, this.C);
        c.r(parcel, 12, this.D, false);
        c.l(parcel, 13, this.E);
        c.l(parcel, 14, n0());
        c.l(parcel, 15, T());
        c.c(parcel, 16, C0());
        c.c(parcel, 17, v0());
        c.r(parcel, 18, getIconImageUrl(), false);
        c.r(parcel, 19, getHiResImageUrl(), false);
        c.r(parcel, 20, getFeaturedImageUrl(), false);
        c.c(parcel, 21, this.M);
        c.c(parcel, 22, this.N);
        c.c(parcel, 23, j0());
        c.r(parcel, 24, f0(), false);
        c.c(parcel, 25, F0());
        c.b(parcel, a8);
    }
}
