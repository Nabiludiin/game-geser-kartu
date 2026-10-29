package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: MyApplication */
public abstract class gg4 {

    /* renamed from: a, reason: collision with root package name */
    public static final ECParameterSpec f8906a = h("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");

    /* renamed from: b, reason: collision with root package name */
    public static final ECParameterSpec f8907b = h("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");

    /* renamed from: c, reason: collision with root package name */
    public static final ECParameterSpec f8908c = h("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");

    /* renamed from: d, reason: collision with root package name */
    private static final BigInteger f8909d = BigInteger.valueOf(2);

    /* renamed from: e, reason: collision with root package name */
    private static final BigInteger f8910e = BigInteger.valueOf(3);

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f8911f = BigInteger.valueOf(4);

    /* renamed from: g, reason: collision with root package name */
    private static final BigInteger f8912g = BigInteger.valueOf(8);

    public static void a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger c8 = c(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(c8) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(c8) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(c8).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(c8))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static boolean b(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static BigInteger c(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static ECPoint d(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        ECPoint eCPoint;
        if (!b(eCParameterSpec, f8906a) && !b(eCParameterSpec, f8907b) && !b(eCParameterSpec, f8908c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        a(generator, curve);
        BigInteger a8 = eCParameterSpec.getCurve().getA();
        BigInteger c8 = c(curve);
        fg4 e8 = e(ECPoint.POINT_INFINITY, c8);
        fg4 e9 = e(generator, c8);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                e8 = g(e8, e9, a8, c8);
                e9 = f(e9, a8, c8);
            } else {
                e9 = g(e8, e9, a8, c8);
                e8 = f(e8, a8, c8);
            }
        }
        if (e8.a()) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger modInverse = e8.f8249c.modInverse(c8);
            BigInteger mod = modInverse.multiply(modInverse).mod(c8);
            eCPoint = new ECPoint(e8.f8247a.multiply(mod).mod(c8), e8.f8248b.multiply(mod).mod(c8).multiply(modInverse).mod(c8));
        }
        a(eCPoint, curve);
        return eCPoint;
    }

    static fg4 e(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return fg4.f8246d;
        }
        BigInteger mod = new BigInteger(1, ui4.a((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger mod2 = mod.multiply(mod).mod(bigInteger);
        return new fg4(eCPoint.getAffineX().multiply(mod2).mod(bigInteger), eCPoint.getAffineY().multiply(mod2.multiply(mod).mod(bigInteger)).mod(bigInteger), mod);
    }

    static fg4 f(fg4 fg4Var, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = fg4Var.f8248b;
        if (bigInteger3.equals(BigInteger.ZERO)) {
            return fg4.f8246d;
        }
        BigInteger bigInteger4 = fg4Var.f8247a;
        BigInteger mod = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger mod2 = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger mod3 = mod2.multiply(mod2).mod(bigInteger2);
        BigInteger bigInteger5 = fg4Var.f8249c;
        BigInteger mod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger add = bigInteger4.add(mod2);
        BigInteger subtract = add.multiply(add).mod(bigInteger2).subtract(mod).subtract(mod3);
        BigInteger bigInteger6 = f8909d;
        BigInteger multiply = subtract.multiply(bigInteger6);
        BigInteger add2 = mod.multiply(f8910e).add(bigInteger.multiply(mod4).multiply(mod4).mod(bigInteger2));
        BigInteger mod5 = add2.multiply(add2).mod(bigInteger2).subtract(multiply.multiply(bigInteger6)).mod(bigInteger2);
        BigInteger mod6 = add2.multiply(multiply.subtract(mod5)).mod(bigInteger2).subtract(mod3.multiply(f8912g)).mod(bigInteger2);
        BigInteger add3 = bigInteger3.add(bigInteger5);
        return new fg4(mod5, mod6, add3.multiply(add3).mod(bigInteger2).subtract(mod2).subtract(mod4).mod(bigInteger2));
    }

    static fg4 g(fg4 fg4Var, fg4 fg4Var2, BigInteger bigInteger, BigInteger bigInteger2) {
        if (fg4Var.a()) {
            return fg4Var2;
        }
        if (fg4Var2.a()) {
            return fg4Var;
        }
        BigInteger bigInteger3 = fg4Var.f8249c;
        BigInteger mod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = fg4Var2.f8249c;
        BigInteger mod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger mod3 = fg4Var.f8247a.multiply(mod2).mod(bigInteger2);
        BigInteger mod4 = fg4Var2.f8247a.multiply(mod).mod(bigInteger2);
        BigInteger mod5 = fg4Var.f8248b.multiply(bigInteger4).mod(bigInteger2).multiply(mod2).mod(bigInteger2);
        BigInteger mod6 = fg4Var2.f8248b.multiply(bigInteger3).mod(bigInteger2).multiply(mod).mod(bigInteger2);
        if (mod3.equals(mod4)) {
            return !mod5.equals(mod6) ? fg4.f8246d : f(fg4Var, bigInteger, bigInteger2);
        }
        BigInteger mod7 = mod4.subtract(mod3).mod(bigInteger2);
        BigInteger mod8 = mod7.multiply(f8911f).multiply(mod7).mod(bigInteger2);
        BigInteger mod9 = mod7.multiply(mod8).mod(bigInteger2);
        BigInteger subtract = mod6.subtract(mod5);
        BigInteger bigInteger5 = f8909d;
        BigInteger mod10 = subtract.multiply(bigInteger5).mod(bigInteger2);
        BigInteger mod11 = mod3.multiply(mod8).mod(bigInteger2);
        BigInteger mod12 = mod10.multiply(mod10).mod(bigInteger2).subtract(mod9).subtract(mod11.multiply(bigInteger5)).mod(bigInteger2);
        BigInteger mod13 = mod10.multiply(mod11.subtract(mod12)).subtract(mod5.multiply(bigInteger5).multiply(mod9)).mod(bigInteger2);
        BigInteger add = bigInteger3.add(bigInteger4);
        return new fg4(mod12, mod13, add.multiply(add).mod(bigInteger2).subtract(mod).subtract(mod2).multiply(mod7).mod(bigInteger2));
    }

    private static ECParameterSpec h(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
