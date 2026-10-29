package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p3.n;
import q3.c;
import y3.g;
import y3.i;
import y3.m;

/* compiled from: MyApplication */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements g {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new a();
    private final String A;
    private final String B;
    private final d4.a C;
    private final i D;
    private final boolean E;
    private final boolean F;
    private final String G;
    private final String H;
    private final Uri I;
    private final String J;
    private final Uri K;
    private final String L;
    private final int M;
    private final long N;
    private final boolean O;
    private final long P;
    private final m Q;

    /* renamed from: s, reason: collision with root package name */
    private String f4606s;

    /* renamed from: t, reason: collision with root package name */
    private String f4607t;

    /* renamed from: u, reason: collision with root package name */
    private final Uri f4608u;

    /* renamed from: v, reason: collision with root package name */
    private final Uri f4609v;

    /* renamed from: w, reason: collision with root package name */
    private final long f4610w;

    /* renamed from: x, reason: collision with root package name */
    private final int f4611x;

    /* renamed from: y, reason: collision with root package name */
    private final long f4612y;

    /* renamed from: z, reason: collision with root package name */
    private final String f4613z;

    /* compiled from: MyApplication */
    static final class a extends com.google.android.gms.games.a {
        a() {
        }

        @Override // com.google.android.gms.games.a
        public final PlayerEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.P0(DowngradeableSafeParcel.N0()) || DowngradeableSafeParcel.M0(PlayerEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 != null ? Uri.parse(readString4) : null, parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1L, false, -1L, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j7, int i7, long j8, String str3, String str4, String str5, d4.a aVar, i iVar, boolean z7, boolean z8, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i8, long j9, boolean z9, long j10, m mVar) {
        this.f4606s = str;
        this.f4607t = str2;
        this.f4608u = uri;
        this.f4613z = str3;
        this.f4609v = uri2;
        this.A = str4;
        this.f4610w = j7;
        this.f4611x = i7;
        this.f4612y = j8;
        this.B = str5;
        this.E = z7;
        this.C = aVar;
        this.D = iVar;
        this.F = z8;
        this.G = str6;
        this.H = str7;
        this.I = uri3;
        this.J = str8;
        this.K = uri4;
        this.L = str9;
        this.M = i8;
        this.N = j9;
        this.O = z9;
        this.P = j10;
        this.Q = mVar;
    }

    static int R0(g gVar) {
        return n.b(gVar.J0(), gVar.k(), Boolean.valueOf(gVar.j()), gVar.u(), gVar.r(), Long.valueOf(gVar.M()), gVar.getTitle(), gVar.a0(), gVar.g(), gVar.getName(), gVar.z(), gVar.O(), Integer.valueOf(gVar.n()), Long.valueOf(gVar.o()), Boolean.valueOf(gVar.e()), Long.valueOf(gVar.q()), gVar.s());
    }

    static boolean U0(g gVar, Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (gVar == obj) {
            return true;
        }
        g gVar2 = (g) obj;
        return n.a(gVar2.J0(), gVar.J0()) && n.a(gVar2.k(), gVar.k()) && n.a(Boolean.valueOf(gVar2.j()), Boolean.valueOf(gVar.j())) && n.a(gVar2.u(), gVar.u()) && n.a(gVar2.r(), gVar.r()) && n.a(Long.valueOf(gVar2.M()), Long.valueOf(gVar.M())) && n.a(gVar2.getTitle(), gVar.getTitle()) && n.a(gVar2.a0(), gVar.a0()) && n.a(gVar2.g(), gVar.g()) && n.a(gVar2.getName(), gVar.getName()) && n.a(gVar2.z(), gVar.z()) && n.a(gVar2.O(), gVar.O()) && n.a(Integer.valueOf(gVar2.n()), Integer.valueOf(gVar.n())) && n.a(Long.valueOf(gVar2.o()), Long.valueOf(gVar.o())) && n.a(Boolean.valueOf(gVar2.e()), Boolean.valueOf(gVar.e())) && n.a(Long.valueOf(gVar2.q()), Long.valueOf(gVar.q())) && n.a(gVar2.s(), gVar.s());
    }

    static String V0(g gVar) {
        n.a a8 = n.c(gVar).a("PlayerId", gVar.J0()).a("DisplayName", gVar.k()).a("HasDebugAccess", Boolean.valueOf(gVar.j())).a("IconImageUri", gVar.u()).a("IconImageUrl", gVar.getIconImageUrl()).a("HiResImageUri", gVar.r()).a("HiResImageUrl", gVar.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(gVar.M())).a("Title", gVar.getTitle()).a("LevelInfo", gVar.a0()).a("GamerTag", gVar.g()).a("Name", gVar.getName()).a("BannerImageLandscapeUri", gVar.z()).a("BannerImageLandscapeUrl", gVar.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", gVar.O()).a("BannerImagePortraitUrl", gVar.getBannerImagePortraitUrl()).a("GamerFriendStatus", Integer.valueOf(gVar.n())).a("GamerFriendUpdateTimestamp", Long.valueOf(gVar.o())).a("IsMuted", Boolean.valueOf(gVar.e())).a("totalUnlockedAchievement", Long.valueOf(gVar.q()));
        char[] cArr = new char[16];
        cArr[0] = 143;
        cArr[1] = 171;
        cArr[2] = 160;
        cArr[3] = 184;
        cArr[4] = 147;
        cArr[5] = 174;
        cArr[6] = 166;
        cArr[7] = 164;
        cArr[8] = 179;
        cArr[9] = 167;
        cArr[10] = 164;
        cArr[11] = 177;
        cArr[12] = 136;
        cArr[13] = 173;
        cArr[14] = 165;
        cArr[15] = 174;
        for (int i7 = 0; i7 < 16; i7++) {
            cArr[i7] = (char) (cArr[i7] - '?');
        }
        return a8.a(new String(cArr), gVar.s()).toString();
    }

    @Override // y3.g
    public final String J0() {
        return this.f4606s;
    }

    @Override // y3.g
    public final long M() {
        return this.f4610w;
    }

    @Override // y3.g
    public final Uri O() {
        return this.K;
    }

    public final long Q0() {
        return this.f4612y;
    }

    @Override // y3.g
    public final i a0() {
        return this.D;
    }

    @Override // y3.g
    public final boolean e() {
        return this.O;
    }

    public final boolean equals(Object obj) {
        return U0(this, obj);
    }

    @Override // y3.g
    public final String g() {
        return this.G;
    }

    @Override // y3.g
    public final String getBannerImageLandscapeUrl() {
        return this.J;
    }

    @Override // y3.g
    public final String getBannerImagePortraitUrl() {
        return this.L;
    }

    @Override // y3.g
    public final String getHiResImageUrl() {
        return this.A;
    }

    @Override // y3.g
    public final String getIconImageUrl() {
        return this.f4613z;
    }

    @Override // y3.g
    public final String getName() {
        return this.H;
    }

    @Override // y3.g
    public final String getTitle() {
        return this.B;
    }

    public final int hashCode() {
        return R0(this);
    }

    @Override // y3.g
    public final boolean j() {
        return this.F;
    }

    @Override // y3.g
    public final String k() {
        return this.f4607t;
    }

    @Override // y3.g
    public final int n() {
        return this.M;
    }

    @Override // y3.g
    public final long o() {
        return this.N;
    }

    @Override // y3.g
    public final long q() {
        return this.P;
    }

    @Override // y3.g
    public final Uri r() {
        return this.f4609v;
    }

    @Override // y3.g
    public final y3.n s() {
        return this.Q;
    }

    public final String toString() {
        return V0(this);
    }

    @Override // y3.g
    public final Uri u() {
        return this.f4608u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        if (O0()) {
            parcel.writeString(this.f4606s);
            parcel.writeString(this.f4607t);
            Uri uri = this.f4608u;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f4609v;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f4610w);
            return;
        }
        int a8 = c.a(parcel);
        c.r(parcel, 1, J0(), false);
        c.r(parcel, 2, k(), false);
        c.q(parcel, 3, u(), i7, false);
        c.q(parcel, 4, r(), i7, false);
        c.o(parcel, 5, M());
        c.l(parcel, 6, this.f4611x);
        c.o(parcel, 7, Q0());
        c.r(parcel, 8, getIconImageUrl(), false);
        c.r(parcel, 9, getHiResImageUrl(), false);
        c.r(parcel, 14, getTitle(), false);
        c.q(parcel, 15, this.C, i7, false);
        c.q(parcel, 16, a0(), i7, false);
        c.c(parcel, 18, this.E);
        c.c(parcel, 19, this.F);
        c.r(parcel, 20, this.G, false);
        c.r(parcel, 21, this.H, false);
        c.q(parcel, 22, z(), i7, false);
        c.r(parcel, 23, getBannerImageLandscapeUrl(), false);
        c.q(parcel, 24, O(), i7, false);
        c.r(parcel, 25, getBannerImagePortraitUrl(), false);
        c.l(parcel, 26, this.M);
        c.o(parcel, 27, this.N);
        c.c(parcel, 28, this.O);
        c.o(parcel, 29, this.P);
        c.q(parcel, 33, this.Q, i7, false);
        c.b(parcel, a8);
    }

    @Override // y3.g
    public final Uri z() {
        return this.I;
    }
}
