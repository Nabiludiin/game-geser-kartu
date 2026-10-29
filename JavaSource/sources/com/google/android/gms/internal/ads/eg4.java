package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: MyApplication */
abstract class eg4 {

    /* renamed from: a, reason: collision with root package name */
    static final long[] f7612a;

    /* renamed from: b, reason: collision with root package name */
    static final long[] f7613b;

    /* renamed from: c, reason: collision with root package name */
    static final long[] f7614c;

    /* renamed from: d, reason: collision with root package name */
    static final xf4[][] f7615d;

    /* renamed from: e, reason: collision with root package name */
    static final xf4[] f7616e;

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f7617f;

    /* renamed from: g, reason: collision with root package name */
    private static final BigInteger f7618g;

    /* renamed from: h, reason: collision with root package name */
    private static final BigInteger f7619h;

    /* renamed from: i, reason: collision with root package name */
    private static final BigInteger f7620i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f7617f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f7618g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f7619h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        f7620i = modPow;
        dg4 dg4Var = new dg4(null);
        dg4Var.d(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        BigInteger c8 = dg4Var.c();
        BigInteger multiply = c8.pow(2).subtract(bigInteger).multiply(mod.multiply(c8.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        dg4Var.b(modPow2);
        f7612a = jg4.g(b(mod));
        f7613b = jg4.g(b(mod2));
        f7614c = jg4.g(b(modPow));
        f7615d = (xf4[][]) Array.newInstance((Class<?>) xf4.class, 32, 8);
        dg4 dg4Var2 = dg4Var;
        for (int i7 = 0; i7 < 32; i7++) {
            dg4 dg4Var3 = dg4Var2;
            for (int i8 = 0; i8 < 8; i8++) {
                f7615d[i7][i8] = c(dg4Var3);
                dg4Var3 = a(dg4Var3, dg4Var2);
            }
            for (int i9 = 0; i9 < 8; i9++) {
                dg4Var2 = a(dg4Var2, dg4Var2);
            }
        }
        dg4 a8 = a(dg4Var, dg4Var);
        f7616e = new xf4[8];
        for (int i10 = 0; i10 < 8; i10++) {
            f7616e[i10] = c(dg4Var);
            dg4Var = a(dg4Var, a8);
        }
    }

    private static dg4 a(dg4 dg4Var, dg4 dg4Var2) {
        dg4 dg4Var3 = new dg4(null);
        BigInteger multiply = f7618g.multiply(dg4Var.a().multiply(dg4Var2.a()).multiply(dg4Var.c()).multiply(dg4Var2.c()));
        BigInteger bigInteger = f7617f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = dg4Var.a().multiply(dg4Var2.c()).add(dg4Var2.a().multiply(dg4Var.c()));
        BigInteger bigInteger2 = BigInteger.ONE;
        dg4Var3.b(add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger));
        dg4Var3.d(dg4Var.c().multiply(dg4Var2.c()).add(dg4Var.a().multiply(dg4Var2.a())).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return dg4Var3;
    }

    private static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i7 = 0; i7 < 16; i7++) {
            byte b8 = bArr[i7];
            int i8 = 31 - i7;
            bArr[i7] = bArr[i8];
            bArr[i8] = b8;
        }
        return bArr;
    }

    private static xf4 c(dg4 dg4Var) {
        BigInteger add = dg4Var.c().add(dg4Var.a());
        BigInteger bigInteger = f7617f;
        return new xf4(jg4.g(b(add.mod(bigInteger))), jg4.g(b(dg4Var.c().subtract(dg4Var.a()).mod(bigInteger))), jg4.g(b(f7619h.multiply(dg4Var.a()).multiply(dg4Var.c()).mod(bigInteger))));
    }
}
