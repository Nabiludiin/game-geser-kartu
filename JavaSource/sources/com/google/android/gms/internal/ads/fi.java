package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    public int f8263a;

    /* renamed from: b, reason: collision with root package name */
    public ai f8264b;

    /* renamed from: c, reason: collision with root package name */
    public mh f8265c;

    /* renamed from: d, reason: collision with root package name */
    public ph f8266d;

    public fi(ph phVar) {
        this(ai.f4974b, 0, new nh());
        this.f8266d = phVar;
    }

    private final long g() {
        int i7 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i8 = 1600766768 % 649830540;
        int i9 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i10 = 1743768897 % 152059765;
        int i11 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i12 = 1861701682 % 1196748250;
        int i13 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i14 = 2091729405 % 1207774949;
        int i15 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i16 = 1050760512 % 184320788;
        int i17 = 0;
        long j7 = 0;
        while (i17 < (i7 ^ i8)) {
            try {
                mh mhVar = this.f8265c;
                ai aiVar = this.f8264b;
                int i18 = i7;
                int i19 = this.f8263a;
                int i20 = i8;
                this.f8263a = i19 + 1;
                byte a8 = mhVar.a(aiVar, i19);
                int i21 = i11 ^ i12;
                j7 |= ((i9 ^ i10) & a8) << i17;
                if (i17 == i21) {
                    if (a8 > 1) {
                        throw new ci();
                    }
                    i17 = i21;
                }
                if ((a8 & (i13 ^ i14)) == 0) {
                    return (j7 >>> 1) ^ (-(1 & j7));
                }
                i17 += i15 ^ i16;
                i7 = i18;
                i8 = i20;
            } catch (IndexOutOfBoundsException e8) {
                throw new ei(e8);
            }
        }
        throw new ci();
    }

    private static final void h(long j7) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        if (j7 % ((jArr[6] + (((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13)) ^ (jArr[7] % 477127367)) != 0) {
            throw new di();
        }
    }

    public final void a(long j7) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        h(j7);
        long j16 = j7 / ((j14 + (((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13)) ^ (j15 % 899334107));
        if (j16 < 0 || j16 > this.f8264b.f4976a.length) {
            throw new ei();
        }
        this.f8263a = (int) j16;
    }

    public final long b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        return this.f8263a * ((jArr[6] + (((((~j7) & j8) | j9) + ((j7 & j10) | j11)) - jArr[5])) ^ (jArr[7] % 1780695788));
    }

    public final long c() {
        try {
            mh mhVar = this.f8265c;
            ai aiVar = this.f8264b;
            this.f8263a = this.f8263a + 1;
            return mhVar.a(aiVar, r2);
        } catch (IndexOutOfBoundsException e8) {
            throw new ei(e8);
        }
    }

    public final int d() {
        int i7 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i8 = 1609416931 % 1031126087;
        int i9 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i10 = 1723578341 % 672563970;
        int i11 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i12 = 1124734562 % 530406424;
        int i13 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i14 = 529302443 % 418646579;
        try {
            mh mhVar = this.f8265c;
            ai aiVar = this.f8264b;
            int i15 = this.f8263a;
            this.f8263a = i15 + 1;
            int i16 = i7 ^ i8;
            int a8 = mhVar.a(aiVar, i15) & i16;
            mh mhVar2 = this.f8265c;
            ai aiVar2 = this.f8264b;
            int i17 = this.f8263a;
            this.f8263a = i17 + 1;
            int a9 = a8 | ((mhVar2.a(aiVar2, i17) & i16) << (i9 ^ i10));
            mh mhVar3 = this.f8265c;
            ai aiVar3 = this.f8264b;
            int i18 = this.f8263a;
            this.f8263a = i18 + 1;
            int a10 = a9 | ((i16 & mhVar3.a(aiVar3, i18)) << (i11 ^ i12));
            mh mhVar4 = this.f8265c;
            ai aiVar4 = this.f8264b;
            int i19 = this.f8263a;
            this.f8263a = i19 + 1;
            return a10 | (mhVar4.a(aiVar4, i19) << (i13 ^ i14));
        } catch (IndexOutOfBoundsException e8) {
            throw new ei(e8);
        }
    }

    public final long e() {
        return g();
    }

    public final ai f(long j7) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        h(b() + j7);
        int i16 = this.f8263a;
        long j8 = i16;
        ai aiVar = this.f8264b;
        long j9 = (j7 >> ((i14 % 774318984) ^ i15)) + j8;
        if (j9 > aiVar.f4976a.length || j9 < j8) {
            throw new ei();
        }
        try {
            int i17 = (int) j9;
            ai b8 = this.f8265c.b(aiVar, i16, i17);
            this.f8263a = i17;
            return b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e8);
        }
    }

    private fi(ai aiVar, int i7, mh mhVar) {
        this.f8264b = aiVar;
        this.f8263a = i7;
        this.f8265c = mhVar;
    }

    public fi(ai aiVar, int i7, mh mhVar, ph phVar) {
        this(aiVar, i7, mhVar);
        this.f8266d = phVar;
    }
}
