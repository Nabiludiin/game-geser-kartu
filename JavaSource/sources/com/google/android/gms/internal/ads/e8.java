package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class e8 {
    public static void a(int i7, le leVar, xn5 xn5Var, le leVar2, le... leVarArr) {
        if (leVar2 == null) {
            leVar2 = new le(-9223372036854775807L, new ld[0]);
        }
        if (leVar != null) {
            w04 d8 = leVar.d(ol2.class);
            int size = d8.size();
            for (int i8 = 0; i8 < size; i8++) {
                ol2 ol2Var = (ol2) d8.get(i8);
                if (!ol2Var.f13374a.equals("com.android.capture.fps") || i7 == 2) {
                    leVar2 = leVar2.g(ol2Var);
                }
            }
        }
        for (le leVar3 : leVarArr) {
            leVar2 = leVar2.f(leVar3);
        }
        if (leVar2.a() > 0) {
            xn5Var.j0(leVar2);
        }
    }

    public static void b(int i7, e3 e3Var, xn5 xn5Var) {
        if (i7 == 1 && e3Var.b()) {
            xn5Var.h(e3Var.f7407a);
            xn5Var.i(e3Var.f7408b);
        }
    }

    public static ld c(y82 y82Var) {
        String str;
        ld t5Var;
        int F = y82Var.F() + y82Var.b();
        int b8 = y82Var.b();
        int i7 = (b8 >> 24) & 255;
        ld ldVar = null;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = b8 & 16777215;
                if (i8 == 6516084) {
                    int b9 = y82Var.b();
                    if (y82Var.b() == 1684108385) {
                        y82Var.J(8);
                        String l7 = y82Var.l(b9 - 16);
                        ldVar = new x5("und", l7, l7);
                    } else {
                        gv1.c("MetadataUtil", "Failed to parse comment attribute: ".concat(sp2.a(b8)));
                    }
                } else {
                    if (i8 != 7233901 && i8 != 7631467) {
                        if (i8 != 6516589 && i8 != 7828084) {
                            if (i8 == 6578553) {
                                ldVar = d(b8, "TDRC", y82Var);
                            } else if (i8 == 4280916) {
                                ldVar = d(b8, "TPE1", y82Var);
                            } else if (i8 == 7630703) {
                                ldVar = d(b8, "TSSE", y82Var);
                            } else if (i8 == 6384738) {
                                ldVar = d(b8, "TALB", y82Var);
                            } else if (i8 == 7108978) {
                                ldVar = d(b8, "USLT", y82Var);
                            } else if (i8 == 6776174) {
                                ldVar = d(b8, "TCON", y82Var);
                            } else if (i8 == 6779504) {
                                ldVar = d(b8, "TIT1", y82Var);
                            } else if (i8 == 7173742) {
                                ldVar = d(b8, "MVNM", y82Var);
                            } else {
                                if (i8 == 7173737) {
                                    ldVar = e(b8, "MVIN", y82Var, true, false);
                                }
                                String a8 = sp2.a(b8);
                                StringBuilder sb = new StringBuilder(a8.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(a8);
                                gv1.a("MetadataUtil", sb.toString());
                            }
                        }
                        ldVar = d(b8, "TCOM", y82Var);
                    }
                    ldVar = d(b8, "TIT2", y82Var);
                }
            } else if (b8 == 1735291493) {
                String a9 = e6.a(f(y82Var) - 1);
                if (a9 != null) {
                    t5Var = new i6("TCON", null, w04.n(a9));
                    ldVar = t5Var;
                } else {
                    gv1.c("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (b8 == 1684632427) {
                ldVar = g(1684632427, "TPOS", y82Var);
            } else if (b8 == 1953655662) {
                ldVar = g(1953655662, "TRCK", y82Var);
            } else if (b8 == 1953329263) {
                ldVar = e(1953329263, "TBPM", y82Var, true, false);
            } else if (b8 == 1668311404) {
                ldVar = e(1668311404, "TCMP", y82Var, true, true);
            } else if (b8 == 1668249202) {
                int b10 = y82Var.b();
                if (y82Var.b() == 1684108385) {
                    int b11 = y82Var.b();
                    int i9 = w7.f18095b;
                    int i10 = b11 & 16777215;
                    if (i10 == 13) {
                        str = "image/jpeg";
                    } else if (i10 == 14) {
                        str = "image/png";
                        i10 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i10);
                        gv1.c("MetadataUtil", sb2.toString());
                    } else {
                        y82Var.J(4);
                        int i11 = b10 - 16;
                        byte[] bArr = new byte[i11];
                        y82Var.L(bArr, 0, i11);
                        t5Var = new t5(str, null, 3, bArr);
                        ldVar = t5Var;
                    }
                } else {
                    gv1.c("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (b8 == 1631670868) {
                ldVar = d(1631670868, "TPE2", y82Var);
            } else if (b8 == 1936682605) {
                ldVar = d(1936682605, "TSOT", y82Var);
            } else if (b8 == 1936679276) {
                ldVar = d(1936679276, "TSOA", y82Var);
            } else if (b8 == 1936679282) {
                ldVar = d(1936679282, "TSOP", y82Var);
            } else if (b8 == 1936679265) {
                ldVar = d(1936679265, "TSO2", y82Var);
            } else if (b8 == 1936679791) {
                ldVar = d(1936679791, "TSOC", y82Var);
            } else if (b8 == 1920233063) {
                ldVar = e(1920233063, "ITUNESADVISORY", y82Var, false, false);
            } else if (b8 == 1885823344) {
                ldVar = e(1885823344, "ITUNESGAPLESS", y82Var, false, true);
            } else if (b8 == 1936683886) {
                ldVar = d(1936683886, "TVSHOWSORT", y82Var);
            } else if (b8 == 1953919848) {
                ldVar = d(1953919848, "TVSHOW", y82Var);
            } else {
                if (b8 == 757935405) {
                    int i12 = -1;
                    int i13 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (y82Var.F() < F) {
                        int F2 = y82Var.F();
                        int b12 = y82Var.b();
                        int b13 = y82Var.b();
                        y82Var.J(4);
                        if (b13 == 1835360622) {
                            str2 = y82Var.l(b12 - 12);
                        } else {
                            int i14 = b12 - 12;
                            if (b13 == 1851878757) {
                                str3 = y82Var.l(i14);
                            } else {
                                if (b13 == 1684108385) {
                                    i13 = b12;
                                }
                                if (b13 == 1684108385) {
                                    i12 = F2;
                                }
                                y82Var.J(i14);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i12 != -1) {
                        y82Var.G(i12);
                        y82Var.J(16);
                        ldVar = new f6(str2, str3, y82Var.l(i13 - 16));
                    }
                }
                String a82 = sp2.a(b8);
                StringBuilder sb3 = new StringBuilder(a82.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(a82);
                gv1.a("MetadataUtil", sb3.toString());
            }
            return ldVar;
        } finally {
            y82Var.G(F);
        }
    }

    private static i6 d(int i7, String str, y82 y82Var) {
        int b8 = y82Var.b();
        if (y82Var.b() == 1684108385) {
            y82Var.J(8);
            return new i6(str, null, w04.n(y82Var.l(b8 - 16)));
        }
        gv1.c("MetadataUtil", "Failed to parse text attribute: ".concat(sp2.a(i7)));
        return null;
    }

    private static d6 e(int i7, String str, y82 y82Var, boolean z7, boolean z8) {
        int f8 = f(y82Var);
        if (z8) {
            f8 = Math.min(1, f8);
        }
        if (f8 >= 0) {
            return z7 ? new i6(str, null, w04.n(Integer.toString(f8))) : new x5("und", str, Integer.toString(f8));
        }
        gv1.c("MetadataUtil", "Failed to parse uint8 attribute: ".concat(sp2.a(i7)));
        return null;
    }

    private static int f(y82 y82Var) {
        int b8 = y82Var.b();
        if (y82Var.b() == 1684108385) {
            y82Var.J(8);
            int i7 = b8 - 16;
            if (i7 == 1) {
                return y82Var.R();
            }
            if (i7 == 2) {
                return y82Var.S();
            }
            if (i7 == 3) {
                return y82Var.W();
            }
            if (i7 == 4 && (y82Var.M() & 128) == 0) {
                return y82Var.h();
            }
        }
        gv1.c("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static i6 g(int i7, String str, y82 y82Var) {
        int b8 = y82Var.b();
        if (y82Var.b() == 1684108385 && b8 >= 22) {
            y82Var.J(10);
            int S = y82Var.S();
            if (S > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(S).length());
                sb.append(S);
                String sb2 = sb.toString();
                int S2 = y82Var.S();
                if (S2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(S2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(S2);
                    sb2 = sb3.toString();
                }
                return new i6(str, null, w04.n(sb2));
            }
        }
        gv1.c("MetadataUtil", "Failed to parse index/count attribute: ".concat(sp2.a(i7)));
        return null;
    }
}
