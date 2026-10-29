package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.Inflater;

/* compiled from: MyApplication */
public abstract class hi2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9535a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9536b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f9537c;

    /* renamed from: d, reason: collision with root package name */
    private static HashMap f9538d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f9539e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f9540f;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f9541g;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f9542h;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f9543i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i7 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i7).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i7);
        f9535a = sb.toString();
        f9536b = new byte[0];
        f9537c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f9539e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9540f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9541g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9542h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f9543i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, f.j.M0, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, f.j.L0, 122, 137, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, androidx.constraintlayout.widget.h.C2, 103, 96, 117, 114, 123, f.j.K0, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper B() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static ExecutorService C(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.gh2
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = hi2.f9535a;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService D(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.fg2
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = hi2.f9535a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String a8 = zw3.a(str);
        int i7 = 0;
        String str2 = a8.split("-", 2)[0];
        if (f9538d == null) {
            f9538d = w();
        }
        String str3 = (String) f9538d.get(str2);
        if (str3 != null) {
            a8 = str3.concat(String.valueOf(a8.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = f9540f;
                int length = strArr.length;
                if (i7 >= 18) {
                    break;
                }
                if (a8.startsWith(strArr[i7])) {
                    return String.valueOf(strArr[i7 + 1]).concat(String.valueOf(a8.substring(strArr[i7].length())));
                }
                i7 += 2;
            }
        }
        return a8;
    }

    public static String F(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String G(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, StandardCharsets.UTF_8);
    }

    public static boolean H(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static int I(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    public static int J(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j7) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        return z8 ? Math.max(0, i7) : i7;
    }

    public static int K(hw1 hw1Var, long j7, boolean z7, boolean z8) {
        int d8 = hw1Var.d() - 1;
        int i7 = 0;
        while (i7 <= d8) {
            int i8 = (i7 + d8) >>> 1;
            if (hw1Var.c(i8) < j7) {
                i7 = i8 + 1;
            } else {
                d8 = i8 - 1;
            }
        }
        int i9 = d8 + 1;
        if (i9 < hw1Var.d() && hw1Var.c(i9) == j7) {
            return i9;
        }
        if (d8 == -1) {
            return 0;
        }
        return d8;
    }

    public static int L(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j7) {
                break;
            }
            binarySearch = i7;
        }
        return !z7 ? i7 : binarySearch;
    }

    public static long M(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static long N(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static long O(long j7, int i7) {
        return Q(j7, 1000000L, i7, RoundingMode.DOWN);
    }

    public static long P(long j7, int i7) {
        return Q(j7, i7, 1000000L, RoundingMode.UP);
    }

    public static long Q(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 < j8 || j9 % j8 != 0) ? (j9 >= j8 || j8 % j9 != 0) ? (j9 < j7 || j9 % j7 != 0) ? (j9 >= j7 || j7 % j9 != 0) ? t(j7, j8, j9, roundingMode) : g44.c(j8, g44.a(j7, j9, RoundingMode.UNNECESSARY)) : g44.a(j8, g44.a(j9, j7, RoundingMode.UNNECESSARY), roundingMode) : g44.c(j7, g44.a(j8, j9, RoundingMode.UNNECESSARY)) : g44.a(j7, g44.a(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void R(long[] jArr, long j7, long j8) {
        long j9;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i7 = 0;
        if (j8 >= 1000000 && j8 % 1000000 == 0) {
            long a8 = g44.a(j8, 1000000L, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = g44.a(jArr[i7], a8, roundingMode);
                i7++;
            }
            return;
        }
        if (j8 < 1000000 && 1000000 % j8 == 0) {
            long a9 = g44.a(1000000L, j8, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = g44.c(jArr[i7], a9);
                i7++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < jArr.length) {
            long j10 = jArr[i8];
            if (j10 != 0) {
                if (j8 >= j10 && j8 % j10 == 0) {
                    jArr[i8] = g44.a(1000000L, g44.a(j8, j10, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= j10 || j10 % j8 != 0) {
                    j9 = j8;
                    jArr[i8] = t(j10, 1000000L, j9, roundingMode);
                    i8++;
                    j8 = j9;
                } else {
                    jArr[i8] = g44.c(1000000L, g44.a(j10, j8, RoundingMode.UNNECESSARY));
                }
            }
            j9 = j8;
            i8++;
            j8 = j9;
        }
    }

    public static long S(long j7, float f8) {
        return f8 == 1.0f ? j7 : Math.round(j7 * f8);
    }

    public static long T(long j7, float f8) {
        return f8 == 1.0f ? j7 : Math.round(j7 / f8);
    }

    public static String U(int i7) {
        return new String(new byte[]{(byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7}, StandardCharsets.US_ASCII);
    }

    public static eq5 V(int i7, int i8, int i9) {
        xn5 xn5Var = new xn5();
        xn5Var.l0("audio/raw");
        xn5Var.e(i8);
        xn5Var.f(i9);
        xn5Var.g(i7);
        return xn5Var.m();
    }

    public static int W(int i7, ByteOrder byteOrder) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i7 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i7 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static boolean a(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    public static int b(int i7) {
        int i8;
        int i9 = 6396;
        if (i7 != 10) {
            if (i7 == 16) {
                i8 = 205215996;
            } else if (i7 != 24) {
                switch (i7) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i7) {
                            case 12:
                                return 743676;
                            case 13:
                                i8 = 30136348;
                                break;
                            case 14:
                                i8 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i8 = 67108860;
            }
            i9 = 0;
        } else {
            i8 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i8 : i9;
    }

    public static AudioFormat c(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static int d(int i7) {
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i7) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int e(int i7) {
        if (i7 != 2) {
            if (i7 == 3) {
                return 1;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int f(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0.equals("isml") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r0.equals("ism") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(android.net.Uri r6) {
        /*
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L19
            java.lang.String r1 = "rtsp"
            boolean r1 = com.google.android.gms.internal.ads.zw3.e(r1, r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "rtspt"
            boolean r0 = com.google.android.gms.internal.ads.zw3.e(r1, r0)
            if (r0 != 0) goto L17
            goto L19
        L17:
            r6 = 3
            return r6
        L19:
            java.lang.String r0 = r6.getLastPathSegment()
            r1 = 4
            if (r0 != 0) goto L21
            return r1
        L21:
            r2 = 46
            int r2 = r0.lastIndexOf(r2)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 < 0) goto L69
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = com.google.android.gms.internal.ads.zw3.a(r0)
            int r2 = r0.hashCode()
            switch(r2) {
                case 104579: goto L5a;
                case 108321: goto L50;
                case 3242057: goto L47;
                case 3299913: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L64
        L3d:
            java.lang.String r2 = "m3u8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r0 = r4
            goto L65
        L47:
            java.lang.String r2 = "isml"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L50:
            java.lang.String r2 = "mpd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r0 = r3
            goto L65
        L5a:
            java.lang.String r2 = "ism"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
        L62:
            r0 = r5
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 != r1) goto L68
            goto L69
        L68:
            return r0
        L69:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.hi2.f9537c
            java.lang.String r6 = r6.getPath()
            r6.getClass()
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.matches()
            if (r0 == 0) goto L95
            java.lang.String r6 = r6.group(r4)
            if (r6 == 0) goto L94
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L8b
            return r3
        L8b:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L94
            return r4
        L94:
            return r5
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hi2.g(android.net.Uri):int");
    }

    public static int h(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f9541g[(i9 >>> 24) ^ (bArr[i7] & 255)] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static int i(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 65535;
        for (int i11 = 0; i11 < i8; i11++) {
            int a8 = x82.a(bArr[i11]);
            i10 = u(a8 & 15, u(a8 >> 4, i10));
        }
        return i10;
    }

    public static int j(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        while (i7 < i8) {
            i10 = f9543i[i10 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i10;
    }

    public static int k(ByteBuffer byteBuffer, int i7) {
        int i8 = byteBuffer.getInt(i7);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i8 : Integer.reverseBytes(i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.E(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(com.google.android.gms.internal.ads.y82 r3, com.google.android.gms.internal.ads.y82 r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.C()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.I()
            int r2 = r3.C()
            if (r0 >= r2) goto L1a
            int r0 = r3.C()
            int r0 = r0 + r0
            r4.B(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.H()
            int r2 = r3.F()
            int r3 = r3.C()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.H()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.I()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.E(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.I()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.I()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.B(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hi2.l(com.google.android.gms.internal.ads.y82, com.google.android.gms.internal.ads.y82, java.util.zip.Inflater):boolean");
    }

    public static boolean m(y82 y82Var, y82 y82Var2, Inflater inflater) {
        return y82Var.C() > 0 && y82Var.M() == 120 && l(y82Var, y82Var2, inflater);
    }

    public static boolean n(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean o(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point p(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && n(context)) {
            String v7 = Build.VERSION.SDK_INT < 28 ? v("sys.display-size") : v("vendor.display-size");
            if (!TextUtils.isEmpty(v7)) {
                try {
                    String[] split = v7.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                gv1.e("Util", "Invalid display size: ".concat(String.valueOf(v7)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String q(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int r(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z7 = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int parseInt = Integer.parseInt(str2);
            return z7 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean s(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i7 == 30) {
            String str = Build.MODEL;
            if (zw3.e(str, "moto g(20)") || zw3.e(str, "rmx3231")) {
                return true;
            }
        }
        return i7 == 34 && zw3.e(Build.MODEL, "sm-x200");
    }

    private static long t(long j7, long j8, long j9, RoundingMode roundingMode) {
        long c8 = g44.c(j7, j8);
        if (c8 != Long.MAX_VALUE && c8 != Long.MIN_VALUE) {
            return g44.a(c8, j9, roundingMode);
        }
        long b8 = g44.b(Math.abs(j8), Math.abs(j9));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long a8 = g44.a(j8, b8, roundingMode2);
        long a9 = g44.a(j9, b8, roundingMode2);
        long b9 = g44.b(Math.abs(j7), Math.abs(a9));
        long a10 = g44.a(j7, b9, roundingMode2);
        long a11 = g44.a(a9, b9, roundingMode2);
        long c9 = g44.c(a10, a8);
        if (c9 != Long.MAX_VALUE && c9 != Long.MIN_VALUE) {
            return g44.a(c9, a11, roundingMode);
        }
        double d8 = a10 * (a8 / a11);
        if (d8 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d8 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return b44.a(d8, roundingMode);
    }

    private static int u(int i7, int i8) {
        return (char) (f9542h[(i7 ^ (i8 >> 12)) & 255] ^ ((char) (i8 << 4)));
    }

    private static String v(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            gv1.f("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    private static HashMap w() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f9539e.length;
        HashMap hashMap = new HashMap(length + 88);
        int i7 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f9539e;
            int length3 = strArr.length;
            if (i7 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    public static boolean x(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static Object[] y(Object[] objArr, int i7) {
        rx3.a(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static Handler z(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, null);
    }
}
