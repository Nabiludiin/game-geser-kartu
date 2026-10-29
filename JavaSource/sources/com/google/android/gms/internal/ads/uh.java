package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: MyApplication */
public final /* synthetic */ class uh implements qi {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uh f16759b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ uh f16760c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ uh f16761d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ uh f16762e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uh f16763f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ uh f16764g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ uh f16765h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ uh f16766i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ uh f16767j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ uh f16768k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ uh f16769l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ uh f16770m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ uh f16771n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ uh f16772o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ uh f16773p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ uh f16774q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ uh f16775r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ uh f16776s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ uh f16777t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ uh f16778u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ uh f16779v;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f16780a;

    static {
        int i7 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i8 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i9 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i10 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i11 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i12 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i13 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f16779v = new uh((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f16778u = new uh((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f16777t = new uh((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f16776s = new uh(i13);
        f16775r = new uh(i10);
        f16774q = new uh(i11);
        uh uhVar = new uh(i12);
        int i14 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i15 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i16 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i17 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i18 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i19 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i20 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i21 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i22 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f16773p = uhVar;
        f16772o = new uh(i9);
        f16771n = new uh(i14);
        f16770m = new uh(i15);
        f16769l = new uh(i16);
        f16768k = new uh(i8);
        f16767j = new uh(i17);
        f16766i = new uh(i18);
        f16765h = new uh(i19);
        f16764g = new uh(i7);
        f16763f = new uh(i20);
        f16762e = new uh(i21);
        f16761d = new uh(i22);
        f16760c = new uh(1);
        f16759b = new uh(0);
    }

    private /* synthetic */ uh(int i7) {
        this.f16780a = i7;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        yg ygVar;
        Optional of;
        Optional empty;
        Optional empty2;
        Optional empty3;
        Optional empty4;
        Optional empty5;
        Optional empty6;
        Optional empty7;
        Optional empty8;
        Optional empty9;
        Optional of2;
        Optional empty10;
        Optional empty11;
        Optional empty12;
        Optional empty13;
        Optional of3;
        Optional empty14;
        Optional empty15;
        Optional empty16;
        Optional empty17;
        Optional empty18;
        Optional empty19;
        Optional empty20;
        Optional of4;
        Optional empty21;
        Optional of5;
        long j7 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f16780a) {
                                            case 0:
                                                ti tiVar = (ti) obj;
                                                pi piVar = tiVar.f16199b;
                                                long m7 = piVar.c().m();
                                                if (piVar.c().m() != 0) {
                                                    tiVar.f16201d.a(m7);
                                                }
                                                empty = Optional.empty();
                                                return empty;
                                            case 1:
                                                try {
                                                    pi piVar2 = ((ti) obj).f16199b;
                                                    long m8 = piVar2.c().m();
                                                    zi c8 = piVar2.c();
                                                    zi c9 = piVar2.c();
                                                    List o7 = c9.o();
                                                    if (m8 < 0) {
                                                        m8 += o7.size() + 1;
                                                    }
                                                    if (m8 < 0 || m8 >= o7.size() + 1) {
                                                        throw new xi();
                                                    }
                                                    o7.add((int) m8, c8);
                                                    piVar2.b(c9);
                                                    empty2 = Optional.empty();
                                                    return empty2;
                                                } catch (xi unused) {
                                                    ygVar = yg.Z;
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                ti tiVar2 = (ti) obj;
                                                pi piVar3 = tiVar2.f16199b;
                                                long m9 = piVar3.c().m();
                                                if (piVar3.c().m() == 0) {
                                                    tiVar2.f16201d.a(m9);
                                                }
                                                empty3 = Optional.empty();
                                                return empty3;
                                            case 3:
                                                ((ti) obj).f16199b.b(zi.b(r0.c().o().size()));
                                                empty4 = Optional.empty();
                                                return empty4;
                                            case 4:
                                                ((ti) obj).f16199b.b(zi.b(r0.c().n().f4976a.length));
                                                empty5 = Optional.empty();
                                                return empty5;
                                            case 5:
                                                pi piVar4 = ((ti) obj).f16199b;
                                                piVar4.b(zi.c(Math.log(piVar4.c().q())));
                                                empty6 = Optional.empty();
                                                return empty6;
                                            case 6:
                                                pi piVar5 = ((ti) obj).f16199b;
                                                long m10 = piVar5.c().m();
                                                long m11 = piVar5.c().m();
                                                if (m10 == 0 || m11 == 0) {
                                                    j7 = 0;
                                                }
                                                piVar5.b(zi.b(j7));
                                                empty7 = Optional.empty();
                                                return empty7;
                                            case 7:
                                                pi piVar6 = ((ti) obj).f16199b;
                                                if (piVar6.c().m() != 0) {
                                                    j7 = 0;
                                                }
                                                piVar6.b(zi.b(j7));
                                                empty8 = Optional.empty();
                                                return empty8;
                                            case 8:
                                                pi piVar7 = ((ti) obj).f16199b;
                                                long m12 = piVar7.c().m();
                                                long m13 = piVar7.c().m();
                                                if (m12 == 0 && m13 == 0) {
                                                    j7 = 0;
                                                }
                                                piVar7.b(zi.b(j7));
                                                empty9 = Optional.empty();
                                                return empty9;
                                            case 9:
                                                ti tiVar3 = (ti) obj;
                                                pi piVar8 = tiVar3.f16199b;
                                                try {
                                                    int compare = new ui(false).compare(piVar8.c(), piVar8.c());
                                                    pi piVar9 = tiVar3.f16199b;
                                                    if (compare >= 0) {
                                                        j7 = 0;
                                                    }
                                                    piVar9.b(zi.b(j7));
                                                    empty10 = Optional.empty();
                                                    return empty10;
                                                } catch (IllegalArgumentException unused2) {
                                                    of2 = Optional.of(yg.f19568u);
                                                    return of2;
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i7 = iArr[0];
                                                int i8 = iArr[1];
                                                int i9 = iArr[2];
                                                int i10 = iArr[3];
                                                int i11 = iArr[4];
                                                int i12 = iArr[5];
                                                int i13 = iArr[6];
                                                int i14 = iArr[7];
                                                int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
                                                int i16 = i14 % 1677157265;
                                                ti tiVar4 = (ti) obj;
                                                try {
                                                    pi piVar10 = tiVar4.f16199b;
                                                    long m14 = piVar10.c().m();
                                                    kh khVar = tiVar4.f16198a;
                                                    pi piVar11 = new pi(i16 ^ i15);
                                                    for (int i17 = 0; i17 < piVar10.f13889b; i17++) {
                                                        try {
                                                            piVar11.b(zi.j((zi) piVar10.f13888a.get(i17)));
                                                        } catch (oi e8) {
                                                            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e8);
                                                        }
                                                    }
                                                    fi fiVar = tiVar4.f16201d;
                                                    new ti(khVar, piVar11, new fi(fiVar.f8264b, fiVar.f8263a, fiVar.f8265c.d(), fiVar.f8266d)).f16201d.a(m14);
                                                    piVar10.b(zi.a(new wh()));
                                                    empty11 = Optional.empty();
                                                    return empty11;
                                                } catch (di | ei unused3) {
                                                    ygVar = yg.K;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    pi piVar12 = ((ti) obj).f16199b;
                                                    piVar12.b(zi.a(piVar12.c().i((Class) piVar12.c().l())));
                                                    empty12 = Optional.empty();
                                                    return empty12;
                                                } catch (vi unused4) {
                                                    ygVar = yg.G;
                                                    break;
                                                }
                                            case 12:
                                                pi piVar13 = ((ti) obj).f16199b;
                                                long m15 = piVar13.c().m();
                                                long m16 = piVar13.c().m();
                                                if (m15 == 0) {
                                                    of3 = Optional.of(yg.W);
                                                    return of3;
                                                }
                                                piVar13.b(zi.b(m16 % m15));
                                                empty13 = Optional.empty();
                                                return empty13;
                                            case 13:
                                                pi piVar14 = ((ti) obj).f16199b;
                                                piVar14.b(zi.c(piVar14.c().q() * piVar14.c().q()));
                                                empty14 = Optional.empty();
                                                return empty14;
                                            case 14:
                                                pi piVar15 = ((ti) obj).f16199b;
                                                piVar15.b(zi.b(piVar15.c().m() * piVar15.c().m()));
                                                empty15 = Optional.empty();
                                                return empty15;
                                            case 15:
                                                pi piVar16 = ((ti) obj).f16199b;
                                                long m17 = piVar16.c().m();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j8 = 0; j8 < m17; j8++) {
                                                    arrayList.add(piVar16.c());
                                                }
                                                Collections.reverse(arrayList);
                                                piVar16.b(zi.e(arrayList));
                                                empty16 = Optional.empty();
                                                return empty16;
                                            case 16:
                                                pi piVar17 = ((ti) obj).f16199b;
                                                piVar17.b(zi.c(Math.pow(piVar17.c().q(), piVar17.c().q())));
                                                empty17 = Optional.empty();
                                                return empty17;
                                            case 17:
                                                ((ti) obj).f16199b.b(zi.a(null));
                                                empty18 = Optional.empty();
                                                return empty18;
                                            case 18:
                                                ti tiVar5 = (ti) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(tiVar5.f16201d.f((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                tiVar5.f16199b.b(zi.c(Double.longBitsToDouble(wrap.getLong())));
                                                empty19 = Optional.empty();
                                                return empty19;
                                            case 19:
                                                ti tiVar6 = (ti) obj;
                                                tiVar6.f16199b.b(zi.b(tiVar6.f16201d.e()));
                                                empty20 = Optional.empty();
                                                return empty20;
                                            default:
                                                long j9 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j10 = 1246101662 % 372004513;
                                                long j11 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j12 = 1675644664 % 749217043;
                                                ti tiVar7 = (ti) obj;
                                                fi fiVar2 = tiVar7.f16201d;
                                                long e9 = fiVar2.e();
                                                if (e9 >= 0 && e9 <= (j9 ^ j10)) {
                                                    if (((j11 ^ j12) & e9) != 0) {
                                                        of5 = Optional.of(yg.f19569v);
                                                        return of5;
                                                    }
                                                    tiVar7.f16199b.b(zi.d(fiVar2.f(e9)));
                                                    empty21 = Optional.empty();
                                                    return empty21;
                                                }
                                                of4 = Optional.of(yg.Q);
                                                return of4;
                                        }
                                    } catch (ei unused5) {
                                        ygVar = yg.Q;
                                    }
                                } catch (vi unused6) {
                                    ygVar = yg.P;
                                }
                            } catch (di e10) {
                                e = e10;
                                throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (oi e11) {
                            e = e11;
                            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (ni unused7) {
                        ygVar = yg.O;
                    }
                } catch (oi unused8) {
                    ygVar = yg.f19565r;
                }
            } catch (ci unused9) {
                ygVar = yg.U;
            }
        } catch (di | ei unused10) {
            ygVar = yg.f19573z;
        }
        of = Optional.of(ygVar);
        return of;
    }
}
